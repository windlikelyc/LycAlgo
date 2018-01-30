package testDesignPattern.PrincipleSix.MapToCollections;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void invoke(){
        Son s = new Son();
        HashMap map = new HashMap();
        s.change(map);
    }

    public static void main(String[] args){
        invoke();
    }
}
