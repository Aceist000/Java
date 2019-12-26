import java.util.*;

public class C {

    int A;
    int B;
    int C;

    public  void Method1() {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        A = input.nextInt();
        System.out.print("b: ");
        B = input.nextInt();
        System.out.print("c: ");
        C = input.nextInt();
    }
    public int Method2() {

        return A%10;
    }
    public int Method3(){
        while(B >= 10){
            B = B/10;
        }

        return B;
    }
    public int Method4(){
        int sum = 0;
        while(C > 0){
            sum += C%10;
            C = C/10;
        }

        return sum;
    }
    public int Method5() {
        System.out.println(Method2() * Method3());
        return Method2() * Method3();
    }

    public void Method6() {
        System.out.print(Method3() + (Method2() * Method3()));
    }

}
