import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random r = new Random();

        //fills array with random integers and prints array
        for (int i = 0; i <= 9; i++) {

            arrayList.add(r.nextInt(100));
            System.out.println(arrayList.get(i));
        }

        System.out.println();

        //bubblesort
        for (int i = 0; i <= 9; i++) {

            for (int j = 1; j <= 9; j++) {

                if (arrayList.get(j - 1) > arrayList.get(j)) {
                    int a = arrayList.get(j - 1);
                    arrayList.set(j - 1, arrayList.get(j));
                    arrayList.set(j, a);
                }
            }
        }

        //prints sorted array
        for (int i = 0; i <= 9; i++) {

            arrayList.add(r.nextInt(100));
            System.out.println(arrayList.get(i));
        }

    }
}
