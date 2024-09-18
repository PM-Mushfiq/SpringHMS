package com.hms.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mid;

    private String username;
    @Setter
    private String password;
    private String fullName;
    private String phone;
    private int age;
    private char sex;
    private String address;
    private String userType;

    public User(String phone) {
        this.phone = phone;
    }

    public User(String username, String password, String fullName, String phone, int age, char sex, String address, String userType) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "phone='" + phone + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "username='" + username + '\'' +
//                ", fullName='" + fullName + '\'' +
//                ", phone='" + phone + '\'' +
//                ", age=" + age +
//                ", sex=" + sex +
//                ", address='" + address + '\'' +
//                ", userType='" + userType + '\'' +
//                '}';
//    }
}
