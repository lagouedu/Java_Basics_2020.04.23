package com.lagou.task17;

public class User implements java.io.Serializable {
    private static final long serialVersionUID = -5814716593800822421L;

    private String userName;  // 用户名
    private String password;  // 密码
    private transient String phoneNum;  // 手机号  表示该成员变量不参与序列化操作

    public User() {
    }

    public User(String userName, String password, String phoneNum) {
        this.userName = userName;
        this.password = password;
        this.phoneNum = phoneNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
