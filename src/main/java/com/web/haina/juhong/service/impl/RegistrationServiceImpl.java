package com.web.haina.juhong.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.web.haina.juhong.entity.InvitationCode;
import com.web.haina.juhong.entity.UserInfo;
import com.web.haina.juhong.repository.InvitationCodeRepository;
import com.web.haina.juhong.repository.UserInfoRepository;
import com.web.haina.juhong.request.UserRegistoryRequest;
import com.web.haina.juhong.response.Result;
import com.web.haina.juhong.response.ResultUtil;
import com.web.haina.juhong.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private InvitationCodeRepository invitationCodeRepository;

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Override
	public Result<Object> registrationUser(UserRegistoryRequest request) {

		UserInfo userFilter = new UserInfo();
		userFilter.setPhone(request.getPhone());
		List<UserInfo> userList = new UserInfoRepository.Executor(userInfoRepository).findAll(userFilter);

		if (!ObjectUtils.isEmpty(userList)) {
			return ResultUtil.error(200, String.format("手机号[%s]已注册，请核对", request.getPhone()));
		}

		InvitationCode filter = new InvitationCode();
		filter.setInvitationCode(request.getInvitation_code());
		List<InvitationCode> invitationCodeList = new InvitationCodeRepository.Executor(invitationCodeRepository)
				.findAll(filter);

		if (ObjectUtils.isEmpty(invitationCodeList)) {
			return ResultUtil.error(200, String.format("邀请码[%s]无效，请核对", request.getInvitation_code()));
		}

		UserInfo newUser = new UserInfo();
		newUser.setPhone(request.getPhone());
		newUser.setPassword(request.getPassword());
		newUser.setInvitationCode(request.getInvitation_code());

		newUser = userInfoRepository.save(newUser);
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", String.valueOf(newUser.getId()));

		return ResultUtil.success(map);
	}

}
