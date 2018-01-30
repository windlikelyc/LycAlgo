package testDesignPattern.proxy;

public class XimenQing {

    public static void main(String[] args) {
//        WangPo wangPo = new WangPo();
        WangPo wangPo = new WangPo(new JiaShi());

        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();


    }
}
