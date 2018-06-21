package testDowncase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

class Fruit {

    public void myName() {
        System.out.println("我是父类 水果。。");
    }
}

class Apple extends Fruit {
    @Override
    public void myName() {
        System.out.println("我是子类 苹果。。。");
    }

    public void myMore() {
        System.out.println("你是我的小丫小苹果");
    }
}

public class Sys {

    public List<Integer> listUsers(String type, Long...ids) {
        int sum = 0;
        for (Long id : ids) {
            sum += id;
        }
        return null;

    }

    public static void main(String[] args) {

        AA aa = new AA();

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("2".equals(item)) {
                iterator.remove();
            }
        }
        System.out.println(list);

    }

    private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };


}

enum SeasonEnum {
    SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);
    private int seq;

    SeasonEnum(int seq) {
        this.seq = seq;
    }
}
