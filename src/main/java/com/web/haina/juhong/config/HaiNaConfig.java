package com.web.haina.juhong.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@ConfigurationProperties("haina")
public class HaiNaConfig {
	private  InvitationCodeProperties invitation = new InvitationCodeProperties();

	public InvitationCodeProperties getInvitation() {
		return invitation;
	}

	public void setInvitation(InvitationCodeProperties invitation) {
		this.invitation = invitation;
	}
	
}
