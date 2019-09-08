package com.web.haina.juhong.response;

public class ResultUtil {

	public static Result<Object> success(Object object) {
		Result<Object> result = new Result<Object>();
		result.setCode(201);
		result.setMsg("SUCCESS");
		result.setData(object);
		return result;
	}

	public static Result<Object> success() {
		return success(null);
	}

	public static Result<Object> error(Integer code, String msg) {
		Result<Object> result = new Result<Object>();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
}