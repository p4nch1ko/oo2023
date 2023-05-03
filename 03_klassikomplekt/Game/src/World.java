
import java.util.List;
public class World {
    int width;
    int height;
    public World(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printMap(int worldWidth, int worldHeight,
                         int playerXCoordinate, int playerYCoordinate, char playerSymbol,
                         int dragonXCoordinate, int dragonYCoordinate, char dragonSymbol,
                         int orcXCoordinate, int orcYCoordinate, char orcSymbol, List<Item> items) {
        // algväärtus kuni iga tsükkel
        char symbol = ' '; // luuakse uus muutuja (deklareerimine), esmakordne väärtuste andmine on initsialiseerimine
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if(y == 0 || y == worldHeight -1){
                    symbol = '-';
                }else if (x == 0 || x == worldWidth -1){
                    symbol = '|';
                } else {
                    // ctrl + alt + m
                    // parem klõps -> refactor -> extract method
                    for (Item i : items) {
                        if (i.yCoordinate == y && i.xCoordinate == x) {
                            symbol = 'I';
                            break;
                        }
                    }

                    if (playerXCoordinate == x && playerYCoordinate == y) {
                        symbol = playerSymbol;
                    } else if (dragonXCoordinate == x && dragonYCoordinate == y) { // aktiveerin + parem klõps + refactor + rename
                        symbol = dragonSymbol;
                    } else if (orcXCoordinate == x && orcYCoordinate == y) {
                        symbol = orcSymbol;
                    }
//                    for (Character c: characters) {
//                        if (c.xCoordinate == x && c.yCoordinate == y) {
//                            symbol = c.symbol;
//                            break;
//                        }
//                    }
                    // ctrl + alt + N
                }
                System.out.print(symbol);
                symbol = ' ';
            }
        }
    }

    /*private static int getRandomXCoordinate(int worldWidth) {
        return (int) (Math.random() * (worldWidth - 2) + 1);
    }*/

    // void on tagastustüüp ehk mis tüüp järgneb return kirjale
    // void tähendab et ei tagastagi midagi

}
