package com.hms.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
//@Table()
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mid;

    @Column(nullable = true)
    private String username;

    @Setter
    @Column(nullable = true)
    private String password;

    @NotNull
    @Column(nullable = false)
    private String fullName;

    @NotNull
    @Column(nullable = false)
    private String phone;

    @Column(nullable = true)
    private int age;

    @Column(nullable = true)
    private char sex;

    @Column(nullable = true)
    private String address;

    @Column(nullable = true)
    private String userType;

    public User(String fullName, String phone) {
        this.fullName = fullName;
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

//    @Override
//    public String toString() {
//        return "User{" +
//                "phone='" + phone + '\'' +
//                ", fullName='" + fullName + '\'' +
//                '}';
//    }

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
