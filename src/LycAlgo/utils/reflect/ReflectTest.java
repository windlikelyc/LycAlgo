package LycAlgo.utils.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by lyc on 2017/9/22.
 */
public class ReflectTest {

    public static lyc initByDefaultConst() throws Throwable {

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("LycAlgo.utils.reflect.lyc");

        Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
        lyc lyc = (LycAlgo.utils.reflect.lyc) cons.newInstance();

        Method setName = clazz.getMethod("setName", String.class);
        setName.invoke(lyc, "刘耀晨一号");


        Method wocao = clazz.getMethod("setAge", int.class);
        wocao.invoke(lyc, 30);

        return lyc;
    }

    public static void main(String[] args) throws Throwable {
        lyc lyc = initByDefaultConst();
        System.out.print(lyc.toString());

    }

}
