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

import com.web.haina.juhong.entity.UserRelation;


public interface UserRelationRepository extends JpaRepository<UserRelation, Integer>, JpaSpecificationExecutor<UserRelation> {

	public static class Executor {
		private UserRelationRepository repository;

		public Executor(UserRelationRepository repository) {
			this.repository = repository;
		}

		public Page<UserRelation> findAll(final UserRelation filter, Pageable pageable) {
			return repository.findAll(new Specification<UserRelation>() {
				private static final long serialVersionUID = 1L;

				@Override
				public Predicate toPredicate(Root<UserRelation> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					if (filter == null) {
						return cb.conjunction();
					}
					return cb.and(merge());
				}
			}, pageable);
		}

		public List<UserRelation> findAll(final UserRelation filter) {
			return repository.findAll(new Specification<UserRelation>() {
				private static final long serialVersionUID = 1L;

				@Override
				public Predicate toPredicate(Root<UserRelation> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					if (filter == null) {
						return cb.conjunction();
					}
					return cb.and(merge(
					    // eq(cb, root.get(QuartzJob_.jobStatus), filter.getJobStatus())
					));
				}
			});
		}
	}
}
