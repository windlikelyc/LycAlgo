package testDesignPattern.PrincipleSix.MapToCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father {

    public Collection change(Map map) {
        System.out.println("zi");
        return map.values();
    }
}
