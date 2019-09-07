package com.web.haina.juhong.entity;

import javax.persistence.*;

@Entity(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer mode;

    private String name;

    @Column(name = "invitation_code")
    private String invitationCode;

    private String password;

    private String phone;

    private String sex;

    private Integer age;

    @Column(name = "wechat_id")
    private String wechatId;

    @Column(name = "alipay_id")
    private String alipayId;

    @Column(name = "create_time")
    private String createTime;

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
     * @return mode
     */
    public Integer getMode() {
        return mode;
    }

    /**
     * @param mode
     */
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return invitation_code
     */
    public String getInvitationCode() {
        return invitationCode;
    }

    /**
     * @param invitationCode
     */
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return wechat_id
     */
    public String getWechatId() {
        return wechatId;
    }

    /**
     * @param wechatId
     */
    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    /**
     * @return alipay_id
     */
    public String getAlipayId() {
        return alipayId;
    }

    /**
     * @param alipayId
     */
    public void setAlipayId(String alipayId) {
        this.alipayId = alipayId;
    }

    /**
     * @return create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}