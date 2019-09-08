package com.web.haina.juhong.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity(name = "invitation_code")
public class InvitationCode implements Serializable{
	
	private static final long serialVersionUID = -841568934087498190L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer inviter;

	private Integer type;

	private Integer expire;

	@Column(name = "invitation_code")
	private String invitationCode;

	private String phone;

	@Column(name = "user_id")
	private Integer userId;

	private Integer status;

	@Column(name = "create_time")
	private Date createTime;

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
	 * @return inviter
	 */
	public Integer getInviter() {
		return inviter;
	}

	/**
	 * @param inviter
	 */
	public void setInviter(Integer inviter) {
		this.inviter = inviter;
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
	 * @return expire
	 */
	public Integer getExpire() {
		return expire;
	}

	/**
	 * @param expire
	 */
	public void setExpire(Integer expire) {
		this.expire = expire;
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
	 * @return status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return create_time
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public InvitationCode() {
		this.createTime = new Date();
	}

}