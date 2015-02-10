package com.test.domain;

import javax.persistence.*;

/**
 * Created by yantingjun on 2015/2/6.
 */
@Entity
@Table(name="user")
public class User {
    private Long id;
    private String name;
    private String pwd;
    @Column(name="nick_name")
    private String nickName;
    private String gendar;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }
}
