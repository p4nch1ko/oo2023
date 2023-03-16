public class Main {

    //fori
    //sout
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*String sonaline = "Sõnaline muutuja";
        char taheline = 's'; //üks täht
        double komakohaga = 4213.2312312;
        float komakohaga2 = 313.123213F;
        boolean kahendV22rtus = true; // 0 ja 1     2   "y" "n"
        byte pisikeNumber = 100;
        short lyhikeNumber = 312;
        long pikkNumber = 31312321312L;*/

        int worldWidth = 10;
        int worldHeight = 5;


        int playerXCoordinate = getRandomXCoordinate(worldWidth); // täisarvuline number
        int playerYCoordinate = getRandomXCoordinate(worldHeight); // castimine ehk teisendamine ühest tüübist teise
        char playerSymbol = 'X';
        int dragonXCoordinate = getRandomXCoordinate(worldWidth);
        int dragonYCoordinate = getRandomXCoordinate(worldHeight);
        char dragonSymbol = 'D';
        int orcXCoordinate = getRandomXCoordinate(worldWidth);
        int orcYCoordinate = getRandomXCoordinate(worldHeight);
        char orcSymbol = 'O';

        // algväärtus kuni iga tsükkel
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if(y == 0 || y == worldHeight-1){
                    System.out.print("-");
                }else if (x == 0 || x == worldWidth-1){
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

    // int on tagastustüüp ehk mis järgneb return kirjele
    private static int getRandomXCoordinate(int worldWidth) {
        return (int) (Math.random() * (worldWidth - 2) + 1);
        // returni järel tuleb täisarv
    }

    // void on tagastustüüp ehk mis tüüp järgneb return kirjale
// void tähendab et ei tagastagi midagi
    private static void printCharacters(int playerXCoordinate, int playerYCoordinate, char playerSymbol,
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
