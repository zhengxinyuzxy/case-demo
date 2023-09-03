/**
 * @author zhengxinyu
 * @date 2023/4/28
 */
public class AbstractTest {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        animal.setAnimalName("猫的名字是tom");
        System.out.println(animal.getAnimalName());
        System.out.println("==========================");
        animal.sleep();
        animal.specific();


        System.out.println("===================");
        new Cat("tom");


    }
}
