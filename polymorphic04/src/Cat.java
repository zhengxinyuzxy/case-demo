/**
 * @author zhengxinyu
 * @date 2023/4/27
 */
public class Cat extends Animal{

    String s = "猫";

    @Override
    void eat() {
        super.eat();
        System.out.println("猫吃鱼");
    }

    public void catHouse() {
        System.out.println("猫特有方法，猫抓老鼠");
    }
}
