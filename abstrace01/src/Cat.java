/**
 * @author zhengxinyu
 * @date 2023/4/28
 */
public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catHouse() {
        System.out.println("猫特有方法，猫抓老鼠");
    }
}
