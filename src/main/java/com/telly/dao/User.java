package com.telly.dao;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="username")
    private String username;

    public User() {

    }

    public void setUsername(String username) {
        this.username = username;
    }

}
