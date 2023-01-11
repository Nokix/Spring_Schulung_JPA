package gmbh.conteco.spring_schulung_jpa.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}