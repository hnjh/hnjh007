package com.web.haina.juhong.repository;

import static com.web.haina.juhong.repository.JpaSpecUtils.*;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.web.haina.juhong.entity.InvitationCode;
import com.web.haina.juhong.entity.InvitationCode_;

public interface InvitationCodeRepository
		extends JpaRepository<InvitationCode, Integer>, JpaSpecificationExecutor<InvitationCode> {

	public static class Executor {
		private InvitationCodeRepository repository;

		public Executor(InvitationCodeRepository repository) {
			this.repository = repository;
		}

		public Page<InvitationCode> findAll(final InvitationCode filter, Pageable pageable) {
			return repository.findAll(new Specification<InvitationCode>() {
				private static final long serialVersionUID = 1L;

				@Override
				public Predicate toPredicate(Root<InvitationCode> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					if (filter == null) {
						return cb.conjunction();
					}
					return cb.and(merge());
				}
			}, pageable);
		}

		public List<InvitationCode> findAll(final InvitationCode filter) {
			return repository.findAll(new Specification<InvitationCode>() {
				private static final long serialVersionUID = 1L;

				@Override
				public Predicate toPredicate(Root<InvitationCode> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					if (filter == null) {
						return cb.conjunction();
					}
					return cb.and(merge(
					   eq(cb, root.get(InvitationCode_.phone), filter.getPhone())
					));
				}
			});
		}
	}
}
