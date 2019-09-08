package com.web.haina.juhong.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name = "integral")
public class Integral implements Serializable{

	private static final long serialVersionUID = 5661036586885335245L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private Integer integral;

    private Integer money;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return integral
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * @param integral
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * @return money
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(Integer money) {
        this.money = money;
    }
}