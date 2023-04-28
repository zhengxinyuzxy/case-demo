/**
 * @author zhengxinyu
 * @date 2023/4/28
 */
public class AbstractTest {

    public static void main(String[] args) {
        Animal animal = new Cat();

        animal.eat();

        animal.sleep();

        animal.setName("旺财");

        System.out.println("猫的名字：" + animal.getName());
    }
}
