package ee.nicol.veebipood;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class TellimusController {

    List<Toode> tellimuseTellimused = new ArrayList<>(Arrays.asList(
            new Toode(3, "Sprite", 1.7),
            new Toode(3, "Sprite", 1.7)
    ));
    List<Toode> tellimuse2Tellimused = new ArrayList<>(Arrays.asList(
            new Toode(3, "Sprite", 1.7),
            new Toode(4, "Vichy", 2.0),
            new Toode(5, "Vitamin well", 2.5)
    ));
    Isik tellija = new Isik(1, "Ees", "Pere", new Date());
    List<Tellimus> tellimused = new ArrayList<>(Arrays.asList(
            new Tellimus(1, tellija, tellimuseTellimused),
            new Tellimus(2, tellija, tellimuse2Tellimused)
    ));
    // GET api.err.ee/tellimused
    // GET localhost:8080/tellimused
    @GetMapping("tellimused")
    public List<Tellimus> saaTellimused() {
        return tellimused;
    }

    // DELETE localhost:8080/kustuta-tellimus/1
    @DeleteMapping("kustuta-tellimus/{index}")
    public String kustutaTellimus(@PathVariable int index) {
        tellimused.remove(index);
        return "Tellimus kustutatud!";
    }

    // POST localhost:8080/lisa-tellimus?id=1&nimi=Coca&hind=1.1

    @PostMapping("lisa-tellimus")
    public List<Tellimus> lisaTellimus(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam double hind) {
     //   tellimused.add(new Tellimus(id, nimi, hind));
        return tellimused;
    }
}
