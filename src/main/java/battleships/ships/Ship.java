package battleships.ships;

public class Ship {

    private final int size;
    private int life;
    private final String name;
    private final String color;

    public Ship(int size, String name, String color) {
        this.size = size;
        this.life = size;
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }

    public boolean isDestroyed() {
        return life <= 0;
    }

    public boolean hit() {
        if (!isDestroyed()) {
            life--;
        }
        return isDestroyed();
    }
}