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

import com.web.haina.juhong.entity.UserTask;


public interface UserTaskRepository extends JpaRepository<UserTask, Integer>, JpaSpecificationExecutor<UserTask> {

	public static class Executor {
		private UserTaskRepository repository;

		public Executor(UserTaskRepository repository) {
			this.repository = repository;
		}

		public Page<UserTask> findAll(final UserTask filter, Pageable pageable) {
			return repository.findAll(new Specification<UserTask>() {
				private static final long serialVersionUID = 1L;

				@Override
				public Predicate toPredicate(Root<UserTask> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					if (filter == null) {
						return cb.conjunction();
					}
					return cb.and(merge());
				}
			}, pageable);
		}

		public List<UserTask> findAll(final UserTask filter) {
			return repository.findAll(new Specification<UserTask>() {
				private static final long serialVersionUID = 1L;

				@Override
				public Predicate toPredicate(Root<UserTask> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
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
