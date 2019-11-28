import java.util.*;

public class Davaleba1 {
    public static void main() {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listFinish = new ArrayList<Integer>();
        Random rand = new Random();
        int X;


        for (int i=0; i< 12; i++) {
            X = rand.nextInt(200) - 100;
            list.add(X);

            if (i%2==0)
            {
                listFinish.add(X);
            }
        }

        System.out.println("Davaleba1-1");

        Collections.sort(list);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Davaleba1-2");

        Collections.sort(listFinish);
        Iterator itrFinish = listFinish.iterator();
        while (itrFinish.hasNext()) {
            System.out.println(itrFinish.next());
        }

    }
}
