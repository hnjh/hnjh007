package com.web.haina.juhong.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InvitationCode.class)
public abstract class InvitationCode_ {

	public static volatile SingularAttribute<InvitationCode, String> phone;
	public static volatile SingularAttribute<InvitationCode, Date> createTime;
	public static volatile SingularAttribute<InvitationCode, Integer> expire;
	public static volatile SingularAttribute<InvitationCode, Integer> inviter;
	public static volatile SingularAttribute<InvitationCode, Integer> id;
	public static volatile SingularAttribute<InvitationCode, Integer> type;
	public static volatile SingularAttribute<InvitationCode, Integer> userId;
	public static volatile SingularAttribute<InvitationCode, String> invitationCode;
	public static volatile SingularAttribute<InvitationCode, Integer> status;

}

