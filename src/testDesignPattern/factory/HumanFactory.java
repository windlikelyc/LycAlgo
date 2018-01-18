package testDesignPattern.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

@SuppressWarnings("all")
public class HumanFactory {

    private static HashMap<String, Human> humans = new HashMap<String, Human>();

//    public static Human createHuman(Class c){ // 一般传 id
//
//        Human human = null;
//        try {
//            human = (Human) Class.forName(c.getName()).newInstance();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        return human;
//
//    }

    // lazy initlization 一个对象初始化之后不释放，等再次使用从内存直接拿出来
    public static Human createHuman(Class c){ // 一般传 id

        Human human = null;
        try {

            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            }else {
                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(), human);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return human;

    }

    public static Human createHuman(){

        Human human = null;
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));

        return human;




    }
}
