/**
 * @author zhengxinyu
 * @date 2023/4/21
 */
// 2）	Employee类中的属性有：办公室office（String类型），工资wage（double
//类型），受雇日期hiredate（String类型）
public class Employee extends Person{

    private String office;

    private String wage;

    private String hiredate;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
