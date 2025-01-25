package lesson11;

public class Figure {

    private int height;
    private int width;

    public Figure(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isAppropriate() {
        return height <= 2 && width <= 1;
    }
}
