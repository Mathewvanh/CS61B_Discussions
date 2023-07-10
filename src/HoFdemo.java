/*
This demonstrates higher order functions
 */
public class HoFdemo {
    public static int do_twice(IntUnaryFunction f,int x){
        return f.apply(f.apply(x));
    }
    public static void main(String[] args){
        IntUnaryFunction TenX = new TenX();
        System.out.println(do_twice(TenX,2));
    }
}
