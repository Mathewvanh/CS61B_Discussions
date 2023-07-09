public class Fight {
    public static void main(String[] args){
        CatBus c = new CatBus();
        Honker m = new CatBus();
        Goose g = new Goose();
        Plane p = new Plane();
        Vehicle v = new Plane();

        c.conversation(g);
        //Honker h = new Honker();
        g.pester(c);
        g.pester(p);
        ((CatBus) m).revEngine();
        g.pester(v);
        v= (Vehicle) m;
        c.conversation((Honker) p);
        p.honk();
    }
}
