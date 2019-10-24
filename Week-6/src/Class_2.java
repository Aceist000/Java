import java.util.*;
import java.lang.*;
import java.io.*;

public class Class_2 {
    public static void main() {
        ReadFile();
    }
    public static void ReadFile(){
        try {
            BufferedReader rd = new BufferedReader(new FileReader("function.txt"));
            String s;

            double heigh = 0;
            double low = 10000000;

            while((s = rd.readLine())!= null){
                // System.out.println(s); for checking
                double number = Double.parseDouble(s);
                if (number > heigh){
                    heigh = number;
                }
                if (number < low){
                    low = number;
                }
            }

            System.out.println("max = "+ heigh);
            System.out.println("min = "+ low);
            rd.close();
        }
        catch(Exception e){
            System.out.println("NO FILE");
        }
    }
}
