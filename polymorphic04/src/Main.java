/**
 * @author zhengxinyu
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        Animal animal01 = new Cat();

        System.out.println(animal01.s);
        animal01.eat();

        // 猫调用猫的特有方法，向下转型，多态
        Cat cat = (Cat) animal01;
        cat.catHouse();
        System.out.println("=========================");
        if (animal01 instanceof Cat) {
            Cat cat1 = (Cat) animal01;
            cat1.catHouse();
        }

        System.out.println("============================");
        // 调用狗的特有方法, 向下转型，多态

        Animal animal02 = new Dog();
        Dog dog = (Dog) animal02;
        dog.dogHome();

        System.out.println("==========================");
        // 判断是否能够向下转型，使用instanceof

        if (animal02 instanceof Dog) {
            Dog dog1 = (Dog) dog;
            dog1.dogHome();
        }

    }
}