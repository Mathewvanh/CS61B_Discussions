public class PeopleWatching {
    public static void main(String[] args){
        Athlete anish = new Athlete();
        Person kyle = new Athlete();
        Grandma crystal = new Grandma();
        Person sherry  = new Grandma();

        anish.speakTo(kyle);//I love sports √
        sherry.watch(anish);//that looks dangerous √
        crystal.speakTo(anish);//athlete is extension of person so hello young whippersnapper(sub class can be converted to super class)√
        //sherry.bingo();//compiletime error cuz there is no bingo method in the static type of person √
        kyle.speakTo(anish);//I love sports √
        //crystal.watch(kyle);//compile error cuz the grandma watch method takes in an athlete and not a person. compile error incorrect static type √
        anish.speakTo(crystal);//I love sports should be: how was bingo
        kyle.speakTo(sherry);//how was bingo?//these two are backwards oops
        //crystal = sherry;//compile error √
        sherry=kyle;//casting to athlete from grandma? √ but doesn't print anything lmao
        //impossible for (b) cuz the classes that can be made at runtime we cannot get it
        //impossible for (c) must use casting apparently ohh if we cast to the wrong types.
    }
}
