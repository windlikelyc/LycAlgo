package testthinkInjava._07.testInnerClass;

interface Selector{
    boolean end();

    Object current();

    void next();
}
public class Sequence {
    private Object[] o;
    private int next = 0;

    public Sequence(int size) {
        o = new Object[size];
    }

    public void add(Object x) {
        if (next < o.length) {
            o[next] = x;
            next++;
        }
    }

    private class SSelector implements Selector {
        int i = 0;
        @Override
        public boolean end() {
            // 内部类可以随意访问外部类的private
            return i == o.length;
        }

        @Override
        public Object current() {
            return o[i];
        }

        @Override
        public void next() {
            if(i < o.length) i++;
        }
    }

    public Selector getSector(){
        return new SSelector();
    }

    public static void main(String[] args) {
        Sequence s = new Sequence(10);

        for (int i = 0 ; i < 10;++i) {
            s.add(Integer.toString(i));
        }

        Selector sl = s.getSector();
        while (!sl.end()) {
            System.out.println((String)sl.current());
            sl.next();
        }
    }

}
