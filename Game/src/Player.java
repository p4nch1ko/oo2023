public class Player {
    int xCoordinate; // täisarvuline number
    int yCoordinate; // castimine ehk teisendamine ühest tüübist teise
    char symbol;

    // constructor
    public Player(int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomXCoordinate(worldWidth);
        this.yCoordinate = getRandomXCoordinate(worldHeight);
        this.symbol = 'X';
    }
    private static int getRandomXCoordinate(int worldWidth) {
        return (int) (Math.random() * (worldWidth - 2) + 1);
    }
    //public tähendab et mõni teine klass saab seda funktsiooni välja kasutada
    //private tähendab, et seda funktsiooni ainult selles klassis kasutada
    public void move(String input) {
        if (input.equals("w")) {
            this.yCoordinate = this.yCoordinate - 1;
        } else if (input.equals("s")){
            this.yCoordinate = this.yCoordinate + 1;
        } else if (input.equals("a")){
            this.xCoordinate = this.xCoordinate - 1;
        } else if (input.equals("d")){
            this.xCoordinate = this.xCoordinate + 1;
        }
    }
}
