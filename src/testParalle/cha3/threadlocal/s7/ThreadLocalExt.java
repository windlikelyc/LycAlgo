package testParalle.cha3.threadlocal.s7;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
