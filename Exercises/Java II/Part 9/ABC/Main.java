public class Main {
    public static void main(String[] args) {
        //  Without Inheritance
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        // With Inheritance
        C ce = new C();

        ce.a();
        ce.b();
        ce.c();
    }
}
