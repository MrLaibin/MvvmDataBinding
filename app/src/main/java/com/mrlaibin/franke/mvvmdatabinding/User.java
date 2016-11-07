package com.mrlaibin.franke.mvvmdatabinding;

/**
 * Created by franke on 16/11/7.
 */

public class User {
    private String name;
    private String age;

    public User(String loonggg, String s) {
        this.name = loonggg;
        this.age = s;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
