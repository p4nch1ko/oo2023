package ee.nicol.kodutoo10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tellimus {
    private int id;
    private Klient tellija;
    private List<Menu> tooted;
}
