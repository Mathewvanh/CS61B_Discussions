public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        noise = "Woof!";
    }
    public void greet(Animal a) { System.out.println("Dog " + name + " says: " + noise); }
    public void play(int happiness) {
        if (happiness > 10) {
            System.out.println("Woo it is so much fun being a dog!");
        }
    }
    public static void sleep() { System.out.println("I love napping!"); }
}
