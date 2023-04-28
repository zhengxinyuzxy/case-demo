/**
 * @author zhengxinyu
 * @date 2023/4/28
 */
public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void sleep();
}
