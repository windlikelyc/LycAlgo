package testDesignPattern.PrincipleSix.MapToCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Father {
    public Collection change(HashMap hashmap) {
        System.out.println("father");
        return hashmap.values();
    }
}
