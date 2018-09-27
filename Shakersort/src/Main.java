import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        long starttime = System.nanoTime();
        long elapsedtime = 0;
        ArrayList<Integer> arrayList = getRandomList(100);

        for (int i = 0; i <= arrayList.size() - 1; i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println();

        int maxindex = arrayList.size() - 1;
        int minindex = 0;

        while (minindex < maxindex) {
            //
            for (int i = 0; i < maxindex; i++) {

                if (arrayList.get(i + 1) < arrayList.get(i)) {

                    int a = arrayList.get(i + 1);
                    arrayList.set(i + 1, arrayList.get(i));
                    arrayList.set(i, a);

                }

            }
            maxindex--;

            for (int i = 9; i > minindex; i--) {

                if (arrayList.get(i - 1) > arrayList.get(i)) {

                    int a = arrayList.get(i - 1);
                    arrayList.set(i - 1, arrayList.get(i));
                    arrayList.set(i, a);
                }
            }
            minindex++;
        }


        for (int i = 0; i <= arrayList.size() - 1; i++) {
            System.out.println(arrayList.get(i));
        }


        elapsedtime = System.nanoTime() - starttime;
        System.out.println("elapsed time " + elapsedtime + " ns");

    }

    public static ArrayList<Integer> getRandomList(int size) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i <= size - 1; i++) {

            arrayList.add(r.nextInt(100));
        }
        return arrayList;

    }
}
