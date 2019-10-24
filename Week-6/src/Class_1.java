import java.util.*;
import java.lang.*;
import java.io.*;

public class Class_1 {
    public static void main() {

        // y = x**2 +2x +3

        WriteFile();
    }
    public static void WriteFile(){
        try {
            FileWriter fr = new FileWriter("function.txt");
            for(double n = 100; n <= 200; n++){
                double x = n/100;
                double y = Math.pow(x,2) + x*2 +3;
                System.out.printf("%.2f\n",y);
                String S=String.format("%.2f \r\n", y);
                fr.write(S);
            }
            fr.close();
        }
        catch(Exception e){
            System.out.println("NO FILE");
        }

    }


}
