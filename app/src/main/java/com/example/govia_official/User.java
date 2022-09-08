package com.example.govia_official;

public class User {
    String name, email, password, phoneNum, address;
    int gender, race, age;

    //constructors
    public User(String name, String email, String phoneNum, String password, String address, int age, int race, int gender) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
        this.address = address;
        this.age = age;
        this.race = race;
        this.gender = gender;
    }




}
