package com.web.haina.juhong.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.haina.juhong.request.UserRegistoryRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@Api(value="用户controller",tags={"用户操作接口"})
@RestController
@RequestMapping(value="/v1")
public class RegistrationController {

	@ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable String id) {
		return "success";
	}
	
	
	@ApiOperation(value = "用户注册", notes = "")
	@PostMapping(value = "/users")
	public String registrationUser(@ApiParam(name="用户注册信息",value="传入json格式",required=true) @RequestBody UserRegistoryRequest request) {
		return "success";
	}

}