package com.bank.Web.bank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Money {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String money;
    private Long user_id;

    public Money(String money, Long user_id) {
        this.money = money;
        this.user_id = user_id;
    }

    public Money() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
