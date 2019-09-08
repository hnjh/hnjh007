package com.web.haina.juhong.service;

import com.web.haina.juhong.request.UserRegistoryRequest;
import com.web.haina.juhong.response.Result;

public interface RegistrationService {
	
	public Result<Object> registrationUser(UserRegistoryRequest request);
}
