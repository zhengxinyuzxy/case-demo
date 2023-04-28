/**
 * @author zhengxinyu
 * @date 2023/4/28
 */
public abstract class Animal {
    public Animal() {
        System.out.println("animal无参构造方法执行");
    }

    public Animal(String s) {
        System.out.println("animal一个参数构造方法执行");
    }

    public abstract void eat();

    public abstract void sleep();
}
