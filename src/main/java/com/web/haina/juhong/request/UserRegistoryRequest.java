package com.web.haina.juhong.request;

import io.swagger.annotations.ApiModelProperty;

public class UserRegistoryRequest {

	@ApiModelProperty(value="用户名",name="phone",example="13269159510")
	private String phone;
	@ApiModelProperty(value="邀请码",name="invitation_code",example="13269159510")
	private String invitation_code;
	@ApiModelProperty(value="用户密码",name="password",example="xxxxx")
	private String password;
	@ApiModelProperty(value="验证码",name="captcha",example="3376")
	private String captcha;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInvitation_code() {
		return invitation_code;
	}

	public void setInvitation_code(String invitation_code) {
		this.invitation_code = invitation_code;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
}
