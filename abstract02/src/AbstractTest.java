/**
 * @author zhengxinyu
 * @date 2023/4/28
 */
public class AbstractTest {

    public static void main(String[] args) {
        Animal animal01 = new Cat();
        if (animal01 instanceof Cat) {
            Cat cat = (Cat) animal01;
            cat.eat();
            cat.sleep();
        }

        Animal animal02 = new Finsh();

        if (animal02 instanceof Finsh) {
            Finsh finsh = (Finsh) animal02;

            finsh.eat();
            finsh.sleep();
        }
    }
}
