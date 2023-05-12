package ee.nicol.kt2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MatkajadListController {
    List<Matkaja> matkaja = new ArrayList<>(Arrays.asList(
            new Matkaja(1,"Ivan", 25),
            new Matkaja(2,"Tomas", 15),
            new Matkaja(3,"Alex", 12)
    ));


    // localhost:8080/matkajad
    @GetMapping("matkajad")
    public List<Matkaja> saaMatkajad() {
        return matkaja;
    }


    @GetMapping("lisa-matkaja")
    public List<Matkaja> lisaMatkaja(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam double kilometraz
    ) {
        matkaja.add(new Matkaja(id, nimi, kilometraz));
        return matkaja;
    }


    //localhost:8080/muuda-kilometraz?id=1&uusKilometraz=10
    @GetMapping("muuda-kilometraz")
    public List<Matkaja> muudaMatkajaKilometraz(
            @RequestParam int id,
  //          @RequestParam String nimi,
            @RequestParam double uusKilometraz
    ) {
        for (Matkaja matkaja : matkaja) {
            if (matkaja.getId() == id) {
                matkaja.setKilometraz(matkaja.getKilometraz() + uusKilometraz);
                break;
            }
        }
        return matkaja;
    }
}
