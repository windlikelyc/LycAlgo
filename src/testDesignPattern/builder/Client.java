package testDesignPattern.builder;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args){
        // 制定一套规则
        ArrayList<String> sequence = new ArrayList<String>();

        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        // 直接在这个benzmodel建立规则
//        BenzModel benz = new BenzModel();
//        benz.setSequence(sequence);
//        benz.run();

        // 使用builder创建一个奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        benz.run();

        // 使用builder建立一个宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();

        Director director = new Director();
        for(int i = 0 ; i < 10000;i++) {
            director.getABenzModel().run();
        }

        for(int i = 0 ; i < 1000000 ; i++) {
            director.getBBenzModel().run();
        }

        for (int i = 0 ; i < 9999 ; i++) {
            director.getCBMWModel().run();
        }



    }
}
