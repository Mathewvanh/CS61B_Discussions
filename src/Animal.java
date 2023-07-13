public class Animal {
    public String name, noise;
    public Animal(String name) {
        this.name = name;
        this.noise = "Huh?";
    }
    public void greet(Animal a) { System.out.println("Hi " + a.name + ", I'm " + name); }
    public void play() { System.out.println("I love to play! " + noise); }
    public static void sleep() { System.out.println("Naptime!"); }
}
