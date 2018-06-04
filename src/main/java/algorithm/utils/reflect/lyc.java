package algorithm.utils.reflect;

/**
 * Created by lyc on 2017/9/22.
 */
public class lyc {
    private String name;
    private String hobby;
    private int age;

    public lyc() {
    }

    ;

    public lyc(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "lyc{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
