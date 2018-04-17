package testthinkInjava._07;

public class Parcel5 {

    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSilp(){
                    return id;
                }
            }

            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSilp();
        }

       // TrackingSlip 已经找不到了
    }

    public void track(){internalTracking(true);}

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        p.track();

    }
}
