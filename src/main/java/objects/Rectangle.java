package objects;

public class Rectangle {

    private double length;
    private double width;
    private int sides = 4;

    // those are the fields of the rectangle

    // constructors before methods and after global fields

    public Rectangle(){
        setLength(0);   //proper way to do it -> using methods
        this.width = 0;
    }

    // all args constructor

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
