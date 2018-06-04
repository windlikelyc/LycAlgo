package testDesignPattern.desiginBuddhism.Multition;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
    private static int maxNumOfEmperor = 2;
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);
    private static ArrayList emperorList = new ArrayList();

    private static int countNumOfEmperor = 0;
    
    static {
        for (int i = 0 ; i < maxNumOfEmperor ; i++) {
            emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    public Emperor(String info) {
        emperorInfoList.add(info);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);

        return (Emperor) emperorList.get(countNumOfEmperor);

    }

    public static Emperor getInstance(int id) throws Exception {
        if (id < 0 || id > 1) {
            throw new Exception("没有这个人");
        }
        countNumOfEmperor = id;
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
