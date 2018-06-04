package testDesignPattern.desiginBuddhism.builder;

import java.util.ArrayList;

public abstract class CarBuilder { // 为啥不是个接口呢
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
