interface Vehicle{
    void revEngine();
}
interface Honker{
    default void honk(){
        System.out.println("HONQUE!");
    }
}
public class CatBus implements Vehicle,Honker{
    @Override
    public void revEngine(){
        System.out.println("Purrrrrrr");
    }
    @Override
    public void honk(){
        System.out.println("CatBus says HONK");
    }
    public void conversation(Honker target){
        honk();
        target.honk();
    }
}
