package ee.nicol.kodutoo10;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

public class MenuListController {
    List<Menu> roog;

    public MenuListController() {
        roog = new ArrayList<>(Arrays.asList(
                new Menu(1, "Salat", 5.0),
                new Menu(2, "Supp", 6.0),
                new Menu(3, "Pizza", 10.0),
                new Menu(4, "Riis", 2.0),
                new Menu(5, "Kana tiivad", 2.5)
        ));
    }

    //localhost:8080/roog
    @GetMapping("roog")
    public List<Menu> saaRoog() {
        return roog;
    }

    //localhost:8080/kustuta-menu/1
    @GetMapping("kustuta-menu/{index}")
    public String kustutaMenu(@PathVariable int index) {
        roog.remove(index);
        return "Roog oli kustutatud!";
    }

    //localhost:8080/lisa-roog/6/Burgir/5
    @GetMapping("lisa-roog/{id}/{nimi}/{hind}")
    public List<Menu> lisaMenu(
            @PathVariable int id,
            @PathVariable String nimi,
            @PathVariable double hind) {
        roog.add(new Menu(id, nimi, hind));
        return roog;
    }

}


