package com.web.haina.juhong.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name = "user_relation")
public class UserRelation implements Serializable{
	
	private static final long serialVersionUID = -5359820624674610200L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private Integer leader;

    private String inviter;

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
     * @return leader
     */
    public Integer getLeader() {
        return leader;
    }

    /**
     * @param leader
     */
    public void setLeader(Integer leader) {
        this.leader = leader;
    }

    /**
     * @return inviter
     */
    public String getInviter() {
        return inviter;
    }

    /**
     * @param inviter
     */
    public void setInviter(String inviter) {
        this.inviter = inviter;
    }
}