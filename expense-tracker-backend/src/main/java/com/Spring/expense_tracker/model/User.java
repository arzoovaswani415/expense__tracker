package com.Spring.expense_tracker.model;
//create table User(user_id int primary key auto_increment,name varchar(50) not null,username varchar(60) not null,email varchar(60) not null unique,password varchar(60) not null, phone_no varchar(20) not null,created_at timestamp default current_timestamp,updated_at timestamp default current_timestamp on update current_timestamp,active_yn int default 1);
public class User {
    int user_id;
    String name;
    String username;
    String email;
    String password;
    int active_yn;
    // we can keep this boolean also

    public User(int user_id, String name, String username, String email, String password, int active_yn) {
        this.user_id = user_id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.active_yn = active_yn;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActive_yn() {
        return active_yn;
    }

    public void setActive_yn(int active_yn) {
        this.active_yn = active_yn;
    }
}
