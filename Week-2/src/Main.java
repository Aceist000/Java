public class Main {

    public static void main(String[] args) {
        // write your code here

        C First  = new C();
        First.Method1();
        System.out.println(First.Method2());
        System.out.println(First.Method3());
        System.out.println(First.Method4());
        First.Method5();
        First.Method6();

        A Second  = new A();
        Second.Method1();
        Second.Method2();
        Second.Method3();

        B Third = new B();
        Third.Main();

    }
}
