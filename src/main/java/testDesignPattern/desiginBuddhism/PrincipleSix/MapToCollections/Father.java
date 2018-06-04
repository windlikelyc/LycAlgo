package testDesignPattern.desiginBuddhism.PrincipleSix.MapToCollections;

import java.util.Collection;
import java.util.HashMap;

public class Father {
    public Collection change(HashMap hashmap) {
        System.out.println("father");
        return hashmap.values();
    }
}
