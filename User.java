package JAVA_Register;

public class User {
    // 이름
    // 아이디
    // 비밀번호
    // 휴대폰 번호
    private String name;
    private String id;
    private String pw;
    private String phoneNum;

    public User(){;}

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
