public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.noise = "Meow!";
    }
    public void greet(Animal a) { System.out.println("Cat " + name + " says: " + noise); }
    public void greet(Dog d) { System.out.println(noise + " I don't like dogs"); }
    public void play(String noise) {
        System.out.println("Woo it is so much fun being a cat!" + noise);
    }
}
