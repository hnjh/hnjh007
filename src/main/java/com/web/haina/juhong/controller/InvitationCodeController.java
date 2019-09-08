package com.web.haina.juhong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.haina.juhong.response.Result;
import com.web.haina.juhong.service.InvitationCodeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api(value = "邀请码controller", tags = { "邀请码接口" })
@RestController
@RequestMapping(value = "/v1")
public class InvitationCodeController {

	@Autowired
	private InvitationCodeService invitationCodeService;

	@ApiOperation(value = "删除邀请码记录", notes = "根据url的id来指定删除对象")
	@ApiImplicitParam(name = "id", value = "邀请码生成记录ID", required = true, dataType = "Long")
	@DeleteMapping(value = "/invitationcode/{id}")
	public String deleteUser(@PathVariable String id) {
		return "success";
	}

	@ApiOperation(value = "生成邀请码", notes = "根据被邀请者的手机号生成邀请码")
	@ApiImplicitParam(name = "phone", value = "被邀请者手机号码", required = true, dataType = "Long")
	@PostMapping(value = "/invitationcode/{phone}")
	public Result<Object> createInvitationcode(@PathVariable String phone) {
		return invitationCodeService.createInvitationCode(phone);
	}
}
