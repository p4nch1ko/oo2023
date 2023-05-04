package ee.nicol.kodutoo10;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class KlientController {



    List<Klient>kliendid = new ArrayList<>(Arrays.asList(
                new Klient(1,"Maria","Mari", 5555555),
                new Klient(2,"Tomas","Sarapuu", 3492849),
                new Klient(3,"Kate","Peterson", 9403628),
                new Klient(4,"Viktor","Tamm", 9403628)
        ));


    //localhost:8080/kliendid
    @GetMapping("kliendid")
    public List<Klient> saaKliendid() {
        return kliendid;
    }

    //localhost:8080/kustuta-klient/1
    @GetMapping("kustuta-klient/{index}")
    public String kustutaKlient(@PathVariable int index) {
        kliendid.remove(index);
        return "Klient kustutatud!";
    }

    //localhost:8080/lisa-klient
    @PostMapping("lisa-klient")
    public List<Klient> lisaKlient(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi,
            @RequestParam String telNum) {
        boolean add = kliendid.add(new Klient());
        return kliendid;
    }
}
