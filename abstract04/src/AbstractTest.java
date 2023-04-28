/**
 * @author zhengxinyu
 * @date 2023/4/28
 */
public class AbstractTest {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        System.out.println("==========================");
        animal.sleep();
        animal.specific();


        System.out.println("===================");
        new Cat("tom");


    }
}
