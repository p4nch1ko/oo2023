package ee.nicol.kt2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MatkajadListController {
    List<Matkaja> matkajad = new ArrayList<>(Arrays.asList(
            new Matkaja(1, "Ivan", 25, new ArrayList<>()),
            new Matkaja(2, "Tomas", 15, new ArrayList<>()),
            new Matkaja(3, "Alex", 12, new ArrayList<>())
    ));


    // localhost:8080/matkajad
    @GetMapping("matkajad")
    public List<Matkaja> saaMatkajad() {
        return matkajad;
    }

    // localhost:8080/lisa-matkaja?id=5&nimi=Tom&kilometraz=14&matkarajaNimetus=matkarajaNimetus
    @GetMapping("lisa-matkaja")
    public List<Matkaja> lisaMatkaja(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam double kilometraz
           // @RequestParam String matkarada
    ) {
        matkajad.add(new Matkaja(id, nimi, kilometraz, new ArrayList<>()));
        return matkajad;
    }


    //localhost:8080/muuda-kilometraz?id=1&uusKilometraz=10
    @GetMapping("muuda-kilometraz")
    public List<Matkaja> muudaMatkajaKilometraz(
            @RequestParam int id,
            @RequestParam double uusKilometraz
    ) {
        for (Matkaja matkaja : matkajad) {
            if (matkaja.getId() == id) {
                matkaja.setKilometraz(matkaja.getKilometraz() + uusKilometraz);
                break;
            }
        }
        return matkajad;
    }

    // localhost:8080/kogustaaz
    @GetMapping("kogustaaz")
    public double saaMatkajateKogustaaz() {
        double koguStaaz = 0;
        for (Matkaja matkaja : matkajad) {
            koguStaaz += matkaja.getKilometraz();
        }
        return koguStaaz;
    }
}
