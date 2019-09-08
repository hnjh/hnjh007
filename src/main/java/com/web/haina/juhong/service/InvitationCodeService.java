package com.web.haina.juhong.service;

import com.web.haina.juhong.response.Result;

public interface InvitationCodeService {
	
	public Result<Object> createInvitationCode(String phone);
}
