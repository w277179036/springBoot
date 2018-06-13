package com.wzq.model;

import javax.persistence.*;

/**
 * Created by wzq on 2018/3/8.
 */
@Entity
@Table(name = "t_user")
public class User {
    private int id;
    private String loginName;
    private String password;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(length = 50)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    @Column(length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
