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
@Table(
        name = "student",
        uniqueConstraints = @UniqueConstraint( columnNames = "email")
)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    @Embedded
    private Guardian guardian;

    @OneToOne
    @ToString.Exclude
    private Student partner;
}