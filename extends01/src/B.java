/**
 * @author zhengxinyu
 * @date 2023/4/27
 */
public class B extends A {
    public B() {
        super();
        System.out.println("B类无参构造器执行");
    }

    public B(float a, String d) {
        this.a = a;
        this.d = d;
    }

    float a = 3.0f;
    String d = "Java program.";

    void show() {
        super.show();
        System.out.println("Class B: a=" + a + "\td=" + d);
    }

}
