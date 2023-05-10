package ee.nicol.proovikontrolltoo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Toit {

    @Id
    private String nimetus;
    @OneToMany
    private List<Toidukomponent> toidukomponendid;
}
