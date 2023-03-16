public class Dragon {

    int xCoordinate; // täisarvuline number
    int yCoordinate; // castimine ehk teisendamine ühest tüübist teise
    char symbol;

    // constructor
    public Dragon(int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomXCoordinate(worldWidth);
        this.yCoordinate = getRandomXCoordinate(worldHeight);
        this.symbol = 'D';
    }

    private static int getRandomXCoordinate(int worldWidth) {
        return (int) (Math.random() * (worldWidth - 2) + 1);
    }
}
