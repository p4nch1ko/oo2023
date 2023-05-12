package ee.nicol.kodus7;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loom {

    private int id;
    private String nimi;
    private String vanus;
    private boolean onAktiivne;
}
