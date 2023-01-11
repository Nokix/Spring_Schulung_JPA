package gmbh.conteco.spring_schulung_jpa.repository;

import gmbh.conteco.spring_schulung_jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}