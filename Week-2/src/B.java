import java.util.*;

public class B {
    public static void Main() {

        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        int c;

        int luwi = 0;
        int kenti = 0;

        for(int i=0; i<40;i++) {
            double random = (Math.random() * ((a - b) + 1)) + b;
            if ((int)random %2 == 0){
                luwi = luwi + 1;
            }
            else{
                kenti = kenti + 1;
            }
            System.out.println((int) random);
        }

        if(a>b){
            c = a;
            a = b;
            b = c;
        }
        System.out.println("luwi: ");
        System.out.println(luwi);
        System.out.println("kenti: ");
        System.out.println(kenti);

    }
}
