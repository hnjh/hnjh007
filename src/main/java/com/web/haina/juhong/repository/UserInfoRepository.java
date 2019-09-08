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

import com.web.haina.juhong.entity.UserInfo;
import com.web.haina.juhong.entity.UserInfo_;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>, JpaSpecificationExecutor<UserInfo> {

	public static class Executor {
		private UserInfoRepository repository;

		public Executor(UserInfoRepository repository) {
			this.repository = repository;
		}

		public Page<UserInfo> findAll(final UserInfo filter, Pageable pageable) {
			return repository.findAll(new Specification<UserInfo>() {
				private static final long serialVersionUID = 1L;

				@Override
				public Predicate toPredicate(Root<UserInfo> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					if (filter == null) {
						return cb.conjunction();
					}
					return cb.and(merge());
				}
			}, pageable);
		}

		public List<UserInfo> findAll(final UserInfo filter) {
			return repository.findAll(new Specification<UserInfo>() {
				private static final long serialVersionUID = 1L;

				@Override
				public Predicate toPredicate(Root<UserInfo> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					if (filter == null) {
						return cb.conjunction();
					}
					return cb.and(merge(eq(cb, root.get(UserInfo_.phone), filter.getPhone())));
				}
			});
		}
	}
}
