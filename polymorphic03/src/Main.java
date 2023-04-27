/**
 * @author zhengxinyu
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {

        Person person01 = new Student();

        System.out.println(person01.personStr);
        System.out.println(person01.personPub);


        System.out.println("==============================");

        System.out.println(((Student) person01).studentStr);
        System.out.println(((Student) person01).studentPub);


        person01.eat();
    }
}