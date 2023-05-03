public class Character implements WorldObject {
    int xCoordinate; // täisarvuline number
    int yCoordinate; // castimine ehk teisendamine ühest tüübist teise
    char symbol;

    // constructor
    public Character(int worldWidth, int worldHeight, char symbol) {
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
        this.symbol = symbol;
    }

    public int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
