package com.telly.dao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reserve")
public class Reserve implements Serializable {

    @ManyToOne
    @JoinColumn(name="username")
    private User user;

    public User getUser() {
        return user;
    }

    public Reserve() {
        this.user = new User();

    }
}
