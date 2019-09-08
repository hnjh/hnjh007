package com.web.haina.juhong.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.haina.juhong.request.TaskRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "任务controller", tags = { "任务操作接口" })
@RestController
@RequestMapping(value = "/v1")
public class TaskController {
	@ApiOperation(value = "删除任务", notes = "根据url的id来指定删除对象")
	@ApiImplicitParam(name = "id", value = "任务ID", required = true, dataType = "Long")
	@DeleteMapping(value = "/tasks/{id}")
	public String deleteTask(@PathVariable String id) {
		return "success";
	}
	
	
	@ApiOperation(value = "创建任务", notes = "根据任务信息创建任务")
	@PostMapping(value = "/tasks")
	public String createTask(@ApiParam(name="任务信息",value="传入json格式",required=true)@RequestBody TaskRequest request) {
		return "success";
	}
	
	@ApiOperation(value = "更新任务", notes = "根据任务信息更新任务")
	@PutMapping(value = "/tasks")
	public String updateTask(@ApiParam(name="任务更新信息",value="传入json格式",required=true)@RequestBody TaskRequest request) {
		return "success";
	}
}
