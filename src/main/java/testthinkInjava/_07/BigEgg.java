package testthinkInjava._07;

class Egg{
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg.Yolk()");
        }
    }

    private Yolk yolk;
    public Egg(){
        System.out.println("new Egg()");
        yolk = new Yolk();
    }
}
public class BigEgg extends Egg {
    public class Yolk{
        public Yolk(){
            System.out.println("bigegg.yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}

