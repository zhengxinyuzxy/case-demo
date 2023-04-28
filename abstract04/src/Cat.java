/**
 * @author zhengxinyu
 * @date 2023/4/28
 */
public class Cat extends Animal{

    public Cat() {
        System.out.println("cat的无参构造方法执行");
    }

    public Cat(String s) {
//        super("jack");
        System.out.println("cat的无参构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫趴着睡觉");
    }

    @Override
    public void specific() {
        super.specific();
        System.out.println("子类调用animal特有方法");
    }
}
