package com.learn.bean;


/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/7/22 13:10<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class Address {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
