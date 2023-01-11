package gmbh.conteco.spring_schulung_jpa.studentService;

import gmbh.conteco.spring_schulung_jpa.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CourseService {
    private CourseRepository courseRepository;

    @Transactional
    public void printAllCourseMaterialNames() {
        courseRepository.findAll()
                .forEach(course -> System.out.println(course.getCourseMaterial().getUrl()));
    }
}
