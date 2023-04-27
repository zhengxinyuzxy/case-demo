/**
 * @author zhengxinyu
 * @date 2023/4/27
 */
public class A {

    public A() {
        System.out.println("A类无参构造器执行");
    }

    public A(int a, double d) {
        this.a = a;
        this.d = d;
    }

    int a = 1;
    double d = 2.0;

    void show() {
        System.out.println("Class A: a=" + a + "\td=" + d);
    }

}
