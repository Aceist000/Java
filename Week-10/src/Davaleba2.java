import java.util.*;

public class Davaleba2 {
    public static void main() {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listFinish = new ArrayList<Integer>();
        Random rand = new Random();
        int X;

        for (int i = 1; i <= 12; i++) {
            X = rand.nextInt(5) + 5;
            list.add(X);
            listFinish.add(X);
            if (i%3 ==0)
            {
                int Y = rand.nextInt(5) + 20;
                listFinish.add(Y);
            }

        }

        System.out.println("Davaleba2-1");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Davaleba2-2");


        Iterator itrFinish = listFinish.iterator();
        while (itrFinish.hasNext()) {
            System.out.println(itrFinish.next());
        }


    }
}
