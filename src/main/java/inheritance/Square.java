package inheritance;

import objects.Rectangle;

public class Square extends Rectangle{

    @Override //only use override if changing the body of the class
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
