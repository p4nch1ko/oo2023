package ee.nicol.kodutoo10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Menu {
    private int id;
    private String nimetus;
    private double hind;
}
