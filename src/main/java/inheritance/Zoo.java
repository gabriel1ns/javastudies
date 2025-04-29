package inheritance;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        //rocky.fetch();
        //rocky.makeSound();

        //Polymorphism

        Animal sasha = new Dog();
        //sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();



        //downcasting sasha
        ((Cat)sasha).scratch(); //not permanent, just for acessing the scratch method.

        boolean isAnimal = sasha instanceof Animal;  //instanceof operator
        System.out.println(isAnimal);

        feed(rocky);
        feed(sasha);
    }

    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("Here's your dog food!");
        } else if (animal instanceof Cat){
            System.out.println("Here's your cat food!");
        }
    }
}
