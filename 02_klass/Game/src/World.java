public class World {
    int width;
    int height;
    public World(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void printMap(int worldWidth, int worldHeight, int playerXCoordinate, int playerYCoordinate, char playerSymbol, int dragonXCoordinate, int dragonYCoordinate, char dragonSymbol, int orcXCoordinate, int orcYCoordinate, char orcSymbol) {
        // algväärtus kuni iga tsükkel
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if(y == 0 || y == worldHeight -1){
                    System.out.print("-");
                }else if (x == 0 || x == worldWidth -1){
                    System.out.print("|");
                } else{
                    // ctrl + alt + m
                    // parem klõps -> refactor -> extract method
                    printCharacters(playerXCoordinate, playerYCoordinate, playerSymbol,
                            dragonXCoordinate, dragonYCoordinate, dragonSymbol,
                            orcXCoordinate, orcYCoordinate, orcSymbol, y, x);
                }
            }
        }
    }

    /*private static int getRandomXCoordinate(int worldWidth) {
        return (int) (Math.random() * (worldWidth - 2) + 1);
    }*/

    // void on tagastustüüp ehk mis tüüp järgneb return kirjale
// void tähendab et ei tagastagi midagi
    private void printCharacters(int playerXCoordinate, int playerYCoordinate, char playerSymbol,
                                        int dragonXCoordinate, int dragonYCoordinate, char dragonSymbol,
                                        int orcXCoordinate, int orcYCoordinate, char orcSymbol, int y, int x) {
        if(playerXCoordinate == x && playerYCoordinate == y) {
            System.out.print(playerSymbol);
        } else if (dragonXCoordinate == x && dragonYCoordinate == y) { // aktiveerin + parem klõps + refactor + rename
            System.out.print(dragonSymbol);
        } else if (orcXCoordinate == x && orcYCoordinate == y) {
            System.out.print(orcSymbol);
        } else {
            System.out.print(" ");
        }
    }

}
