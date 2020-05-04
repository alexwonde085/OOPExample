public class AnimalApp {
    public static void main(String[] args) {

        Animal a = new Animal(); // Creating instance of an Animal
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat(); // Creating instance of a Cat
        print(c.eat());
        print(c.sleep());
        print(c.purr());

        Bird b = new Bird(); // Creating instance of a Bird
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Dog d = new Dog(); // Creating instance of a Dog
        print(d.eat());
        print(d.sleep());
        print(d.bark());

        Mouse m = new Mouse(); // Creating instance of a Mouse
        print(m.eat());
        print(m.sleep());
        print(m.purr());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
