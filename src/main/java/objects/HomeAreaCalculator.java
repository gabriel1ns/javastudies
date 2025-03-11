package objects;

public class HomeAreaCalculator {
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 75);
        room2.calculateArea();

        double areaRoom2 = room2.calculateArea();

        double totalArea = areaRoom1 + areaRoom2;

        System.out.println("Total area: " + totalArea);
    }
}
