/**
 * @author zhengxinyu
 * @date ${DATE}
 */
public class Start {
    public static void main(String[] args) {

        Person person = new Student();

        System.out.println(person.personStr);
        System.out.println(person.publicStr);


        System.out.println("==============================");

        System.out.println(((Student) person).studentStr);
        System.out.println(((Student) person).publicStr);
        person.eat();
    }
}