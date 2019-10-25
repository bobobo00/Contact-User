/**
 * @ClassName User
 * @Description TODO
 * @Auther danni
 * @Date 2019/10/24 21:25]
 * @Version 1.0
 **/

public class User {
    private String name;
    private String mobliephone;
    private String officephone;

    public User(String name, String mobliephone, String officephone) {
        this.name = name;
        this.mobliephone = mobliephone;
        this.officephone = officephone;
    }

    public User() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobliephone(String mobliephone) {
        this.mobliephone = mobliephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone;
    }

    public String getName() {
        return name;
    }

    public String getMobliephone() {
        return mobliephone;
    }

    public String getOfficephone() {
        return officephone;
    }
    public String toString(){
        return String.format("|姓名：%s|%n|移动电话：%s|%n|办公电话：%s|",name,mobliephone,officephone);
    }
}
