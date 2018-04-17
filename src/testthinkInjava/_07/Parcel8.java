package testthinkInjava._07;

public class Parcel8 {

    public Destination dest( final String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLable() {
                // 这行编译报错，显示dest必须为final或者等效于final
                //dest += "123";

                label += "123";
                System.out.println(label);
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Destination d = p.dest("wowowo");
        d.readLable();
    }
}
