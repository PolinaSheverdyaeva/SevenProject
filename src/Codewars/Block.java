package Codewars;

public class Block {



    private int width;
    private int length;
    private int height;

    public Block(int [] sides) {

        if(sides.length != 3){
           throw new IllegalArgumentException("Invalid sides.Expected 3.");
        }

        this.width = sides[0];
        this.length = sides[1];
        this.height = sides[2];
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public int getHeight(){
        return height;
    }

    public int getSurfaceArea(){
        int topAndBottomArea = 2 * width * length;
        int side1Area = 2 * length * height;
        int side2Area = 2 * width * height;
        return topAndBottomArea + side1Area + side2Area;
    }

    public int getVolume(){
        return width * length * height;
    }



}
