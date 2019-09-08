package com.web.haina.juhong;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.web.haina.juhong.response.Result;
import com.web.haina.juhong.service.InvitationCodeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HainaJuhong007ApplicationTests {

	@Autowired
	private InvitationCodeService InvitationCodeServiceImpl;

	@Test
	public void contextLoads() {
		Result<Object> result =InvitationCodeServiceImpl.createInvitationCode("13269159518");
		System.out.println(result);
	}

}
