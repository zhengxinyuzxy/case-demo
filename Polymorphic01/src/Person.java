/**
 * @author zhengxinyu
 * @date 2023/4/21
 */
//1）	Person类中的属性有：姓名name（String类型），地址address（String类型），
//        电话号码telphone（String类型）和电子邮件地址email（String类型）

public class Person {
    private String name;
    private String address;
    private String telphone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
