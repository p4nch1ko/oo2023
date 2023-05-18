package ee.nicol.kt2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MatkaradaController {
    List<Matkarada> matkarajad = new ArrayList<>(Arrays.asList(
            new Matkarada("Matkarada1", 10, new ArrayList<>()),
            new Matkarada("Matkarada2", 8.2, new ArrayList<>()),
            new Matkarada("Matkarada3", 12.7, new ArrayList<>())
    ));

//    List<Matkaja> matkajad = new ArrayList<>(Arrays.asList(
//            new Matkaja(1, "Ivan", 25, new ArrayList<>()),
//            new Matkaja(2, "Tomas", 15, new ArrayList<>()),
//            new Matkaja(3, "Alex", 12, new ArrayList<>())
//    ));


    //localhost:8080/matkarajad
    @GetMapping("matkarajad")
    public List<Matkarada> saaMatkarajad() {
        return matkarajad;
    }

    //localhost:8080/matkarada-matkajad?nimetus=Matkarada1
    @GetMapping("matkarada-matkajad")
    public List<Matkaja> saaMatkaradaMatkajad(
            @RequestParam String nimetus
    ) {
        for (Matkarada matkarada : matkarajad) {
            if (matkarada.getNimetus().equals(nimetus)) {
                return matkarada.getMatkajad();
            }
        }
        return new ArrayList<>();
    }

    // localhost:8080/matkarada-matkajate-arv?nimetus=Matkarada1
    @GetMapping("matkarada-matkajate-arv")
    public int saaMatkaradaMatkajateArv(
            @RequestParam String nimetus
    ) {
        for (Matkarada matkarada : matkarajad) {
            if (matkarada.getNimetus().equals(nimetus)) {
                return matkarada.getMatkajad().size();
            }
        }
        return 0;
    }



}
