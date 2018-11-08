import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        long stattime = System.currentTimeMillis();
        long elapsedtime = 0;
        ArrayList<Integer> arrayList = getRandomList(1000000);
        ArrayList<Integer> arrayListSorted = new ArrayList<>();

        for (int i = 0; i <= arrayList.size()-1; i++) {

            System.out.println(arrayList.get(i));
        }

        System.out.println();

        while (arrayList.size() > 0) {

            int minimum = arrayList.get(0);
            int minimumindex = 0;


            for (int i = 1; i < arrayList.size()-1; i++) {
                if (arrayList.get(i) < minimum) {
                    minimum = arrayList.get(i);
                    minimumindex = i;
                }

            }
            arrayListSorted.add(minimum);
            arrayList.remove(minimumindex);

        }


        for (int i = 0; i <= arrayListSorted.size()-1; i++) {
            System.out.println(arrayListSorted.get(i));
        }

        elapsedtime = System.currentTimeMillis() - stattime;
        System.out.println("elapsed time: " + elapsedtime + " ms");
    }

    //returns arraylist filled with random integers
    public static ArrayList<Integer> getRandomList(int size){

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i <= size-1; i++) {
            arrayList.add(r.nextInt(100));
        }
        return arrayList;
    }


}
