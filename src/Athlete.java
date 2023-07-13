interface Person{
    void speakTo(Person other);
    default void watch(Athlete other){
        System.out.println("wow");
    }
}
public class Athlete implements Person{
    @Override
    public void speakTo(Person other){System.out.println("I love sports");}
    @Override
    public void watch(Athlete other){System.out.println("ball is life");}
    public void speakTo(Grandma other){System.out.println("how was Bingo?");}
}
