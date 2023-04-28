/**
 * @author zhengxinyu
 * @date 2023/4/28
 */
public class Cat extends Animal{


    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫趴着睡觉");
    }
}
