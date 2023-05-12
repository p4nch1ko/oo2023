package ee.nicol.kt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Kt2Application {

    public static void main(String[] args) {
        SpringApplication.run(Kt2Application.class, args);
    }

}

//* Koosta klass Matkajate hoidmiseks (nimi, kogu läbitud kilometraaž).
// Lisa API otspunkti kaudu võimalus matkajaid lisada ja vaadata.
// Lisa võimalus matkajale lisada sisendina API otspunktilt kilometraaži juurde lisada.
// * Lisa klass Matkarada ning lisa see andmebaasi (nimetus, pikkus, Matkaja võõrvõtmena).
// Lisa matkaja mitu-mitme seosena - üks matkaja võib olla käinud mitmel matkarajal
// ning ühel matkarajal võib olla olnud mitmeid matkajaid. Näita API otspunkti kaudu kui mitu matkajat on rajal käinud. Teise API otspunkti kaudu tagasta mis on nende matkajate kogustaaž kilomeetrites.
// * Lisa klass Riik, millele (nimetus, Matkarada võõrvõtmena).
// Tegemist on üks-mitmele seosega, ehk ühel riigil võib olla mitu matkarada.
// Näita API otspunktist ühes riigis käinud matkajate koguarvu.
// Võimalda anda sisendiks riik ning väljasta kõige suurema kilomeetrilise staažiga matkaja.
