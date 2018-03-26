package algorithm.utils.thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lyc on 2017/9/22.
 */
public class SimpleThreadLocal {
    private Map valueMap = Collections.synchronizedMap(new HashMap<>());

    public void set(Object newValue) {
        valueMap.put(Thread.currentThread(), newValue);
    }

    public Object get() {
        Thread currentThread = Thread.currentThread();

        Object o = valueMap.get(currentThread);

        if (o == null && !valueMap.containsKey(currentThread)) {
            o = initalValue();
            valueMap.put(currentThread, o);
        }
        return o;
    }

    public void remove() {
        valueMap.remove(Thread.currentThread());
    }

    public Object initalValue() {
        return null;
    }

}
