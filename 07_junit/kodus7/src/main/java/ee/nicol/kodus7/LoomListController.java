package ee.nicol.kodus7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class LoomListController {

    List<Loom> loom = new ArrayList<>(Arrays.asList(
            new Loom(1,"Koer", "1", true),
            new Loom(2,"Kass", "4", false),
            new Loom(3,"Küülik", "3", true)
    ));

    @GetMapping("loom")
    public List<Loom> saaLoom() {
        return loom;
    }

    @GetMapping ("kustuta-loom/{index}")
    public String kustutaLoom(@PathVariable int index) {
        loom.remove(index);
        return "Loom oli kustutatud!";
    }

    @GetMapping("lisa-loom")
    public List<Loom> lisaLoom(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam String vanus,
            @RequestParam boolean onAktiivne
    ) {
        loom.add(new Loom(id, nimi, vanus, onAktiivne));
        return loom;
    }
}
