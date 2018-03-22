package testParalle.cha3.threadlocal.s5.s6;

public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return "I am defalult value ,the first get is not null";
    }
}
