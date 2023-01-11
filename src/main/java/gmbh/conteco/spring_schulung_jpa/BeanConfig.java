package gmbh.conteco.spring_schulung_jpa;


import gmbh.conteco.spring_schulung_jpa.entity.Guardian;
import gmbh.conteco.spring_schulung_jpa.entity.Student;
import gmbh.conteco.spring_schulung_jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Autowired
    private StudentRepository studentRepository;

//    public BeanConfig(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

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
        };
    }
}
