public class TestAnimal {
 public static void main(String[] args) {
        Animal a = new Dog("Pluto");
        Animal b = new Animal("Bear");
        Cat c = new Cat("Garfield");
        Dog d = new Dog("Lucky");       //Compile Time    runtime   output                                   Right?
        Cat e = new Cat("Kitty");// ERROR Animal no int                                                 √
        a.greet(c);                          //   Animal        Dog        Pluto says:Woof!                         √(half remember its the greet method
        a.sleep();                           //  Animal         Dog        I love napping                           Wrong(Sleep is static I missed that)
        c.play(":)");                  //  Animal         Cat         Woo it is so much fun being a cat! meow  Wrong it takes in the :) to replace the sound
        ((Animal) c).greet(d);              //  Animal         animal(cast) Pluto says:Woof!                        Wrong its a cat lol
        d.sleep();                          // Animal          Dog         I love napping！                         Wrong Sleep is static!!
        a = c;                              // Animal          Cat          null                                    √
        a.play();                         // Error(cat play no int                                                WRong Animal doesn't have a play(int)
        ((Dog) a).play(12);        //Animal           Dog          Its so much fun being a dog           WrOng(didn't we cast it as dog though?)
        a.greet(b);                         //Animal           Dog          Pluto says:Woof!                      Wrong oh wait a became a cat after a=c on line 13
        d = (Dog) a;                        //Animal           Dog          null                                  Wrong(Runtime cuz cat isn't a dog)
        c = (Cat)a;                              //Animal           Error Cat is not a dog                        c is static cat while a is a static a
        }
}
