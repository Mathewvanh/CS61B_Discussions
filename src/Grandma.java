public class Grandma implements Person {
    @Override
    public void speakTo(Person other) {
        System.out.println("Hello young whippersnapper");
    }

    @Override
    public void watch(Athlete other) {
        System.out.println("that looks dangerous");
    }

    public void bingo() {
        System.out.println("bingo!");
    }
}
