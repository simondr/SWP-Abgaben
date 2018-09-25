import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        long starttime = System.nanoTime();
        long elapsedtime = 0;
        ArrayList<Integer> arrayList = getRandomList(10);

        for (int i = 0; i <= 9; i++) {
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
            System.out.println(arrayList.get(i));
        }

        elapsedtime = System.nanoTime() - starttime;
        System.out.println("elapsed time " + elapsedtime + " ns");

    }

    public static ArrayList<Integer> getRandomList(int size){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i<= size-1; i++){

            arrayList.add(r.nextInt(100));
        }
        return arrayList;

    }
}
