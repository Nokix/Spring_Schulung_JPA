package gmbh.conteco.spring_schulung_jpa;


import gmbh.conteco.spring_schulung_jpa.entity.*;
import gmbh.conteco.spring_schulung_jpa.repository.CourseRepository;
import gmbh.conteco.spring_schulung_jpa.repository.StudentRepository;
import gmbh.conteco.spring_schulung_jpa.repository.TeacherRepository;
import gmbh.conteco.spring_schulung_jpa.studentService.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@AllArgsConstructor
public class BeanConfig {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;
    private CourseService courseService;
    private final TeacherRepository teacherRepository;

    @Bean
    public CommandLineRunner myApp() {
        return args -> {
            Guardian guardian = Guardian.builder()
                    .name("Oli")
                    .email("123-456")
                    .build();

            Student student0 = Student.builder()
                    .email("ketchup@mayo.de")
                    .firstName("Viktor")
                    .lastName("Reichert")
                    .guardian(guardian)
                    .build();
            student0.setPartner(student0);
            studentRepository.save(student0);
            studentRepository.findAll().forEach(System.out::println);

            CourseMaterial material = CourseMaterial.builder()
                    .url("uni.de/ana1")
                    .build();

            Course course0 = Course.builder().title("Analysis I")
                    .credits(8)
                    .courseMaterial(material)
                    .build();

            courseRepository.save(course0);

            Course course1 = Course.builder().title("Analysis III")
                    .credits(10).build();
            courseRepository.save(course1);

            Teacher teacher = Teacher.builder().name("Kohl")
                    .taughtCourses(List.of(course0, course1)).build();
            teacherRepository.save(teacher);

        };
    }
}
