import java.util.Scanner;

public class A {
    int X;

    public A() {
        System.out.println("Hello");
    }

    public int Method1() {
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        X = input.nextInt();
        return X;
    }

    public void Method2() {
        System.out.println(X + 12);
    }

    public void Method3() {
        if (X % 2 == 0) {
            System.out.println("x iyofa orze");
        } else {
            System.out.println("x ar iyofa orze");
        }
    }
}



