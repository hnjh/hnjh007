package com.web.haina.juhong.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name = "task")
public class Task implements Serializable{
	
	private static final long serialVersionUID = 4179878324052136875L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer count;

    private Integer integral;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    private Integer type;

    private String image;

    private String steps;

    @Column(name = "acceptance_conditions")
    private String acceptanceConditions;

    private byte[] desc;

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
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
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

    /**
     * @return start_time
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return steps
     */
    public String getSteps() {
        return steps;
    }

    /**
     * @param steps
     */
    public void setSteps(String steps) {
        this.steps = steps;
    }

    /**
     * @return acceptance_conditions
     */
    public String getAcceptanceConditions() {
        return acceptanceConditions;
    }

    /**
     * @param acceptanceConditions
     */
    public void setAcceptanceConditions(String acceptanceConditions) {
        this.acceptanceConditions = acceptanceConditions;
    }

    /**
     * @return desc
     */
    public byte[] getDesc() {
        return desc;
    }

    /**
     * @param desc
     */
    public void setDesc(byte[] desc) {
        this.desc = desc;
    }
}