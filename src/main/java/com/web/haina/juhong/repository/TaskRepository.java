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

import com.web.haina.juhong.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>, JpaSpecificationExecutor<Task> {

	public static class Executor {
		private TaskRepository repository;

		public Executor(TaskRepository repository) {
			this.repository = repository;
		}

		public Page<Task> findAll(final Task filter, Pageable pageable) {
			return repository.findAll(new Specification<Task>() {
				private static final long serialVersionUID = 1L;

				@Override
				public Predicate toPredicate(Root<Task> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
					if (filter == null) {
						return cb.conjunction();
					}
					return cb.and(merge());
				}
			}, pageable);
		}

		public List<Task> findAll(final Task filter) {
			return repository.findAll(new Specification<Task>() {
				private static final long serialVersionUID = 1L;

				@Override
				public Predicate toPredicate(Root<Task> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
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
