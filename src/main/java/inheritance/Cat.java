package inheritance;

public class Cat extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Meooow!");
    }

    public void scratch(){
        System.out.println("I'm a cat, i scratch things!");
    }
}
