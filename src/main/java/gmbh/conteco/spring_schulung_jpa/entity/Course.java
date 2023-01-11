package gmbh.conteco.spring_schulung_jpa.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
    @SequenceGenerator(name = "course_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    private Integer credits;
    private String title;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY)
    @JoinColumn(name = "cmat")
    private CourseMaterial courseMaterial;

    @ManyToOne
    private Teacher teacher;

}