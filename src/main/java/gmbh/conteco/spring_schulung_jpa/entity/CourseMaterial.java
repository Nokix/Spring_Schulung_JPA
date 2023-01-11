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
@Table(name = "course_material")
public class CourseMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String url;

}