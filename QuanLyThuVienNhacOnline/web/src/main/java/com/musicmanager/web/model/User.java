package com.musicmanager.web.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    // Thuộc tính
    private String id;
    private String name;
    private String email;
    private String password;

    // GETTER và SETTER với mỗi thuộc tính:
    // User ID
    public String getId(){
        return id;
    }

    public void setId(String id){
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