package testInterface;

/**
 * Created by lyc on 2017/10/10.
 */
public class LycImlp implements LycStyle {
    private int age = 21;
    private int age2 = 21;

    @Override
    public void kuangwang() {
        this.age++;
    }

    @Override
    public String sayya() {
        String string = "Ya";
        System.out.print("Ya");
        return string;
    }
}
