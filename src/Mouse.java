public class Mouse extends Animal{ //Child class Mouse inherit from parent class Animal

    public Mouse(){ //Default constructor
        super();
        System.out.println("Now I am a Mouse!");
    }
    @Override
    public String sleep() { //Override the method
        return "A mouse sleeps...";
    }

    @Override
    public String eat() { //Override the method
        return "A mouse eats...";
    }

    public String purr() {
        return "purrr...";
    }
}
