/**
 * @author zhengxinyu
 * @date 2023/4/21
 */

// 4）	Staff类中的属性有：职务称号duty（String类型）
public class Staff extends Employee{

    private String duty;

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
}
