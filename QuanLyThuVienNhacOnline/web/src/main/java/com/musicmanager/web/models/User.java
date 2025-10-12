package com.musicmanager.web.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Thuộc tính:
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name", nullable = false, unique = true)
    private String name;

    @Column(name = "user_email", nullable = false, unique = true)
    private String email;

    @Column(name = "user_password", nullable = false)
    private String password;

    // Constructor mặc định:
    public User(){}

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // GETTER và SETTER với mỗi thuộc tính:
    // User ID
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    // User Name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // User Email
    public String getEmail() { return email; }

    public void setEmail(String email) {
        this.email = email;
    }

    // User Password
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}