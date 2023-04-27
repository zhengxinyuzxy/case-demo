/**
 * @author zhengxinyu
 * @date 2023/4/27
 */
public class Dog extends Animal{
    String s = "狗";

    @Override
    void eat() {
        super.eat();
        System.out.println("狗吃骨头");
    }

    public void dogHome() {
        System.out.println("狗特有方法，狗看家");
    }
}
