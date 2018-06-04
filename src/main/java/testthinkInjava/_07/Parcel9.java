package testthinkInjava._07;

public class Parcel9 {
    public Destination dest(final String dest, final float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over buget");
                }
            }
            private String label = dest;

            @Override
            public String readLable() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.dest("woo", 210.4F);
    }
}
