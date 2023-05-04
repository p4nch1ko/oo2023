package ee.nicol.veebipood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class TellimusController {

    @Autowired
    IsikController isikController; // ühel ja samal mälukohal
    @Autowired
    ToodeController toodeController;  // otseühendus selle klassiga

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



    // POST localhost:8080/Lisa-tellimus?id=9&tellijaIndex=3&toodeIndex=2

    @PostMapping("lisa-tellimus")
    public List<Tellimus> lisaTellimus(
            @RequestParam int id,
            @RequestParam int tellijaIndex,
            @RequestParam int tooteIndex) {
        //  tellimused.add(new Tellimus(id, nimi, hind));
        //  IsikController isikController = new IsikController();
        //  System.out.println(isikController); // MÄLUKOHT     Dependency Injection
        Isik telija = isikController.isikud.get(tellijaIndex);

        //  ToodeController toodeController = new ToodeController();
            Toode tellitudToode = toodeController.tooted.get(tooteIndex);
            List<Toode> tellitudTooted = new ArrayList<>(Arrays.asList(tellitudToode));

        tellimused.add(new Tellimus(id, tellija, tellitudTooted));
        return tellimused;
    }

    // POST localhost:8080/Lisa-tellimus2?id=9&tellijaIndex=3&toodeIndex=2,2,3

    @PostMapping("lisa-tellimus2")
    public List<Tellimus> lisaTellimus2(
            @RequestParam int id,
            @RequestParam int tellijaIndex,
            @RequestParam List<Integer> tooteIndexid) {
        Isik telija = isikController.isikud.get(tellijaIndex);

        List<Toode> tellitudTooted = new ArrayList<>();
        for (Integer i: tooteIndexid) {
            Toode toode = toodeController.tooted.get(i);
            tellitudTooted.add(toode);
        }

        tellimused.add(new Tellimus(id, tellija, tellitudTooted));
        return tellimused;
    }

    // POST localhost:8080/Lisa-tellimus3

    @PostMapping("lisa-tellimus3")
    public List<Tellimus> lisaTellimus3(

            @RequestBody Tellimus tellimus) {

        tellimused.add(tellimus);
        return tellimused;
    }

    @PostMapping("lisa-tellimus4")
    public List<Tellimus> lisaTellimus4(

            @RequestBody Tellimus tellimus) {
        System.out.println(tellimus.getId());
        System.out.println(tellimus.getTellija());
        System.out.println(tellimus.getTooted());
        Isik isik = isikController.isikud.get(tellimus.getTellija().getId());

        List<Toode> tellitudTooted = new ArrayList<>();
        for (Toode t: tellimus.getTooted()) {
            Toode toode = toodeController.tooted.get(t.getId());
            tellitudTooted.add(toode);
        }


        tellimused.add(new Tellimus(tellimus.getId(), isik, tellitudTooted));
        return tellimused;
    }
}
