package ee.nicol.kodutoo10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TellimusController {
    @Autowired
    MenuListController menuListController;
    @Autowired
    KlientController klientController;

    List<Menu> tellimuseTellimused = new ArrayList<>(Arrays.asList(
            new Menu(2, "Supp", 6.0)
    ));
    Klient klient = new Klient(5, "Maia", "Metsa",9239203);

    List<Tellimus> tellimused = new ArrayList<>(Arrays.asList(
            new Tellimus(1, klient, tellimuseTellimused)));


    // GET localhost:8080/tellimused
    @GetMapping("tellimused")
    public List<Tellimus> saaTellimused() {
        return tellimused;
    }


    // DELETE localhost:8080/kustuta-tellimus/1
    @GetMapping("kustuta-tellimus/{index}")
    public String kustutaTellimus(@PathVariable int index) {
        tellimused.remove(index);
        return "Tellimus oli kustutatud!";
    }


    //localhost:8080/lisa-tellimus
    @PostMapping("lisa-tellimus")
    public List<Tellimus> lisaTellimus(
            @RequestParam int id,
            @RequestParam int klientIndex,
            @RequestParam int roogIndex) {
        Klient klient = klientController.kliendid.get(klientIndex);

        Menu tellitudRoog = menuListController.roog.get(roogIndex);
        List<Menu> tellitudRoad = new ArrayList<>(Arrays.asList(tellitudRoog));

        tellimused.add(new Tellimus(id, klient, tellitudRoad));
        return tellimused;
    }


}
