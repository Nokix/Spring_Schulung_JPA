package gmbh.conteco.spring_schulung_jpa;


import gmbh.conteco.spring_schulung_jpa.entity.*;
import gmbh.conteco.spring_schulung_jpa.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class BeanConfig {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

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
            studentRepository.save(student0);

            CourseMaterial material = CourseMaterial.builder()
                    .url("uni.de/ana1")
                    .build();

            Course course = Course.builder().title("Analysis I")
                    .credits(8)
                    .courseMaterial(material)
                    .build();

            courseRepository.save(course);

        };
    }
}
