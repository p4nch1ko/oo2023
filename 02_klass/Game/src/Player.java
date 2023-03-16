public class Player {
    int xCoordinate; // täisarvuline number
    int yCoordinate; // castimine ehk teisendamine ühest tüübist teise
    char symbol;
    Direction  direction; //3nda tunni teema

    // constructor
    public Player(int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomXCoordinate(worldWidth);
        this.yCoordinate = getRandomXCoordinate(worldHeight);
        this.symbol = 'X';
        this.direction = Direction.UP;
    }
    private static int getRandomXCoordinate(int worldWidth) {
        return (int) (Math.random() * (worldWidth - 2) + 1);
    }
    //public tähendab et mõni teine klass saab seda funktsiooni välja kasutada
    //private tähendab, et seda funktsiooni ainult selles klassis kasutada
    public void move(String input, World world) {
        if (input.equals("w")) {
            this.direction = Direction.UP;
        } else if (input.equals("s")){
            this.direction = Direction.DOWN;
        } else if (input.equals("a")){
            this.direction = Direction.LEFT;
        } else if (input.equals("d")){
            this.direction = Direction.RIGHT;
        }
        if (direction.equals(Direction.UP) && this.yCoordinate > 1) {
            this.yCoordinate = this.yCoordinate - 1;
        } else if (direction.equals(Direction.DOWN) && this.yCoordinate < world.height-2){
            this.yCoordinate = this.yCoordinate + 1;
        } else if (direction.equals(Direction.LEFT)&& this.xCoordinate > 1){
            this.xCoordinate = this.xCoordinate - 1;
        } else if (direction.equals(Direction.RIGHT) && this.xCoordinate < world.height-2){
            this.xCoordinate = this.xCoordinate + 1;
        }
    }
}
