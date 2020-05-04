public class Dog extends Animal{ //Child class Dog inherited from parent class Animal

    public Dog() { //Default Constructor
        super();
        System.out.println("Now I am a Dog!");
    }

    @Override
    public String sleep() { //Override the method
        return "A dog sleeps...";
    }

    @Override
    public String eat() { //Override the method
        return "A dog eats...";
    }

    public String bark() {
        return "Woof woof...";
    }
}
