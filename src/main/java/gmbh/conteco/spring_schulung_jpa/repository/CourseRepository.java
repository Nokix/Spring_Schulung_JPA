package gmbh.conteco.spring_schulung_jpa.repository;

import gmbh.conteco.spring_schulung_jpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}