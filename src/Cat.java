public class Cat extends Animal { //Child class cat is inherit from parent class Animal

    public Cat() { //Default Constructor
        super();
        System.out.println("Now I am a Cat!");
    }

    @Override
    public String sleep() { //Override the method
        return "A cat sleeps...";
    }

    @Override
    public String eat() { //Override the method
        return "A cat eats...";
    }

    public String purr() {
        return "purrr...";
    }
}
