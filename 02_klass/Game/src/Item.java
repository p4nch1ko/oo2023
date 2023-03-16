public class Item {
    int xCoordinate;
    int yCoordinate;
    int strenght;
    int durability;
    String name;

    // parem klõps -> generate -> constructor -> valin kõik
    public Item(int strenght, int durability, String name, int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
        this.strenght = strenght;
        this.durability = durability;
        this.name = name;
    }
    private static int getRandomCoordinate(int worldWidth) {
        return (int) (Math.random() * (worldWidth - 2) + 1);
    }
}
