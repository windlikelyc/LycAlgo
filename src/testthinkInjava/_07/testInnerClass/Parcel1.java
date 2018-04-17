package testthinkInjava._07.testInnerClass;

public class Parcel1 { // 将一个类封装到类内部
    class Contents{
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destionation{
        private String label;

        Destionation(String whereTo) {
            label = whereTo;
        }
        String readLabel(){
            return label;}
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destionation d = new Destionation(dest);
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("wocao");
    }

}
