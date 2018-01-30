package testDesignPattern.PrincipleSix.girlSearcher;

public class Client {

    public static void main(String[] atgs){
        IGreatTemperatureGirl qinqian = new PrettyGirl("qianqiian");
        AbstactSearcher abstactSearcher = new Searcher(qinqian);
        abstactSearcher.show();

    }
}
