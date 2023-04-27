/**
 * @author zhengxinyu
 * @date 2023/4/27
 */
public class PloymorphicTest {

    public static void main(String[] args) {
        Person person01 = new Faculty();
        if (person01 instanceof  Faculty) {
            Faculty faculty = (Faculty) person01;

            faculty.setDegree("person01" + "本科");

            System.out.println(faculty.getDegree());
        }

        Person person02 = new Staff();

        if (person02 instanceof Staff) {
            Staff staff = (Staff) person02;

            ((Staff) person02).setDuty("职员");

            System.out.println(staff.getDuty());
        }
    }
}
