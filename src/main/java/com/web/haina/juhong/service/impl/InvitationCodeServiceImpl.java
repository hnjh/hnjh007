package com.web.haina.juhong.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.web.haina.juhong.config.HaiNaConfig;
import com.web.haina.juhong.entity.InvitationCode;
import com.web.haina.juhong.repository.InvitationCodeRepository;
import com.web.haina.juhong.response.Result;
import com.web.haina.juhong.response.ResultUtil;
import com.web.haina.juhong.service.InvitationCodeService;

@Service
public class InvitationCodeServiceImpl implements InvitationCodeService {

	@Autowired
	private InvitationCodeRepository invitationCodeRepository;
	
	@Autowired
	private HaiNaConfig haiNaConfig;

	@Override
	public Result<Object> createInvitationCode(String phone) {

		InvitationCode filter = new InvitationCode();
		filter.setPhone(phone);
		
		List<InvitationCode> invitationCodeList = new InvitationCodeRepository.Executor(invitationCodeRepository).findAll(filter);
		
		if (!ObjectUtils.isEmpty(invitationCodeList)) {
			return ResultUtil.error(200, String.format("手机号[%s]已生成过邀请码，请核对", phone));
		}
		
		String code = RandomStringUtils.randomAlphabetic(haiNaConfig.getInvitation().getCodeLength());
		InvitationCode invitationCode = new InvitationCode();
		invitationCode.setInviter(0);
		invitationCode.setPhone(phone);
		invitationCode.setInvitationCode(code);
		invitationCode.setStatus(0);
		invitationCodeRepository.save(invitationCode);

		Map<String, String> map = new HashMap<String, String>();
		map.put("invitation_code", code);
		
		return ResultUtil.success(map);
	}

}
