public class Bird extends Animal { //Bird is a child class inherited from Animal class

    public Bird() { //Default Constructor
        //super();
        System.out.println("A bird is hatched...");
    }

    @Override
    public String sleep() { // overriding the method
        return "A bird sleeps soundly...";
    }

    @Override
    public String eat() { // overriding the method
        return "A bird eats...";
    }

    public String fly() {
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";
    }
}
