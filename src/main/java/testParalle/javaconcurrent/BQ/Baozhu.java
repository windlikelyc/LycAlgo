package testParalle.javaconcurrent.BQ;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Baozhu implements Delayed {

    private int baozha = 0;

    public Baozhu(int i) {
        this.baozha = i;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return baozha;
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }

    public void setBaozha(int baozha) {
        this.baozha = baozha;
    }
}
