package ee.nicol.kt2;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Matkaja {
    @Id
    private int id;
    private String nimi;
    private double kilometraz;
    @ManyToMany
    private List<Matkarada> matkarajad;

}


//* Koosta klass Matkajate hoidmiseks (nimi, kogu läbitud kilometraaž).
//* Lisa API otspunkti kaudu võimalus matkajaid lisada ja vaadata.
//* Lisa võimalus matkajale lisada sisendina API otspunktilt kilometraaži juurde lisada.

// * Lisa klass Matkarada ning lisa see andmebaasi (nimetus, pikkus, Matkaja võõrvõtmena).
// Lisa matkaja mitu-mitme seosena - üks matkaja võib olla käinud mitmel matkarajal
// ning ühel matkarajal võib olla olnud mitmeid matkajaid.
// Näita API otspunkti kaudu kui mitu matkajat on rajal käinud.
// Teise API otspunkti kaudu tagasta mis on nende matkajate kogustaaž kilomeetrites.

// * Lisa klass Riik, millele (nimetus, Matkarada võõrvõtmena).
// Tegemist on üks-mitmele seosega, ehk ühel riigil võib olla mitu matkarada.
// Näita API otspunktist ühes riigis käinud matkajate koguarvu.
// Võimalda anda sisendiks riik ning väljasta kõige suurema kilomeetrilise staažiga matkaja.
