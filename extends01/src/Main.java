/**
 * @author zhengxinyu
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        a.show();
        System.out.println("=================");
        B b = new B();
        b.show();
        System.out.println("=================");
        B new_b = new B(3, "new b");
        new_b.show();
    }
}