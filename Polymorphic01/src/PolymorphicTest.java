/**
 * @author zhengxinyu
 * @date 2023/4/21
 */

// 5）	现有对象Person p1 =new Faculty()和Person p2 =new Staff ()，
// 请分别为p1的属性赋值“本科”和Staff类的duty赋值“职员”
public class PolymorphicTest {
    public static void main(String[] args) {

        Person person1 = new Faculty();
        if (person1 instanceof Faculty) {
            Faculty faculty = (Faculty) person1;
            faculty.setDegree("本科");
//            ((Faculty) person1).setDegree("本科");
        }

        Person person2 = new Staff();
        if (person2 instanceof Staff) {
            Staff staff = (Staff) person2;
            staff.setDuty("职员");
//            ((Staff) person2).setDuty("职员");
        }

    }
}
