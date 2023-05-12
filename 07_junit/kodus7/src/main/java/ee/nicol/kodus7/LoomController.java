package ee.nicol.kodus7;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoomController {

    Loom loom = new Loom(1,"Kass","3",true);

    // localhost:8080/loomad/
    @GetMapping("loomad")
    public Loom saaLoom(){
        return loom;
    }

    @GetMapping("kustuta-loom")
    public String kustutaLoom(){
        loom = null;
        return "Loom oli edukalt kustutatud";
    }

    @GetMapping("muuda-loom")
    public Loom muudaLoom() {
        loom.setOnAktiivne(!loom.isOnAktiivne());
        return loom;
    }
}
