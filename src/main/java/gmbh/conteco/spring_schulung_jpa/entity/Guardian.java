package gmbh.conteco.spring_schulung_jpa.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(fluent = true)
@Embeddable
@AttributeOverrides({
        @AttributeOverride(name = "name", column = @Column(name = "guardian_name")),
        @AttributeOverride(name = "email", column = @Column(name = "guardian_email"))
})
public class Guardian {
    private String name;
    private String email;
}
