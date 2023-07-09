public class Goose implements Honker{
    public void pester(Vehicle victim){
        System.out.println("BEP!");
    }
    public void pester(Plane p){
        System.out.println("SQUAWK!");
    }
}
