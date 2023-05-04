package ee.nicol.kodutoo10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class MenuController {
    static Menu roog = new Menu(1,"Salat",5.0);

    //localhost:8080/roog
    @GetMapping("roog")
    public Menu saaRoog() {
        return roog;
    }

    //localhost:8080/kustuta-roog/1
    @GetMapping("kustuta-roog/{id]")
    public String kustutaRoog() {
        roog = null;
        return "Roog oli ustutatud!";
    }


}
