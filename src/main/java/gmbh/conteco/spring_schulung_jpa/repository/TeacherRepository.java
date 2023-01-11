package gmbh.conteco.spring_schulung_jpa.repository;

import gmbh.conteco.spring_schulung_jpa.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}