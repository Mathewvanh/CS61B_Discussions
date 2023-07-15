public class inheritanceMisery {
    public class A {
        public int x = 5;
        public void m1(A a) { System.out.println("Am1 " + x); }
        public void m2() { System.out.println("Am2 " + this.x); }
        public static void m4() { System.out.println("Am4"); }
        public void update() { x = 99; }
    }
    public class B extends A {
        public void m1(A a) { System.out.println("Bm1a " + this.x); }
        public void m1(C c) { System.out.println("Bm1c " + super.x); }
        public void m2() { System.out.println("Bm2 " + x); }
        public void m2(int y) { System.out.println("Bm2y " + y); }
        public void m3() { System.out.println("Bm3 " + "called"); }
    }

    public class C extends B {
        public int y = x + 1;
        public void m2() { System.out.println("Cm2 " + super.x); }
        public static void m4() { System.out.println("Cm4"); }
        public void m5() { System.out.println("Cm5 " + y); }
    }
    public class D {
        public void main(String[] args) {
             A b0 = new B();
             A c0 = new C();
             B b1 = new B();

             //B a0 = (A) new C(); // _______________________________________
             b0.m2(); // _______________________________________
             //((A) b1).m2(61); // _______________________________________
             b1.m3(); // _______________________________________
             b0.update(); // _______________________________________
             c0.m2(); // _______________________________________
             C c2 = (C) c0; // _______________________________________
             b0.m1((A) c2); // _______________________________________
             C c3 = (C) b1; // _______________________________________
             ((A) c2).m4(); // _______________________________________
             c2.m3(); // _______________________________________
             b1.m1((A) c2); // _______________________________________
             ((C) b0).m5(); // _______________________________________
             //(C) c0.m3(); // _______________________________________
             b0.m2(); // _______________________________________
              }
 }
}
