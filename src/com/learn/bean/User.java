package com.learn.bean;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/22 13:07<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class User {
    private String username;
    private String password;
    private String gender;
    private Integer age;
    private Address address;

    public User() {
    }

    public User(String username, String password, String gender, Integer age) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
