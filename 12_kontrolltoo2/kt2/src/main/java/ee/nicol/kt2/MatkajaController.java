package ee.nicol.kt2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatkajaController {

    Matkaja matkaja = new Matkaja(4, "Karl", 20);

    // localhost:8080/matkaja
    @GetMapping("matkaja")
    public Matkaja saaMatkaja(){
        return matkaja;
    }



}
