package JavaWithSerg;

public class Block {

    int width;
    int length;
    int height;

    public Block(int[] sides){
        width = sides[0];
        length = sides[1];
        height = sides[2];
    }

    public int getWidth() { return width; }

    public int getLength() { return length; }

    public int getHeight() { return height; }

    public int getVolume() { return length * width * height; }

    public int getSurfaceArea() {
        return 2 * length * width + 2 * width * height + 2 * length * height;
    }
}
