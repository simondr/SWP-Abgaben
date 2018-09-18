import java.util.ArrayList;
import java.util.Random;

public class Main {

    static ArrayList<Integer> arrayList = new ArrayList<>();
    static ArrayList<Integer> arrayListSortiert = new ArrayList<>();

    public static void main(String[] args) {

        arrayFuellen(10);
        for (int i = 0; i <= arrayList.size()-1; i++) {
            System.out.println(arrayList.get(i));
            arraySortieren();
        }
        System.out.println();
        arraySortieren();
        for (int i = 0; i <= arrayListSortiert.size()-1; i++) {
            System.out.println(arrayListSortiert.get(i));
            arraySortieren();
        }


    }

    public static void arraySortieren() {

        for (int i = 0; i <= arrayList.size()-1; i++) {
            int minimum = arrayList.get(0);
            int minimumindex = 0;

            for (int j = 0; j <= arrayList.size()-1; j++) {

                if (arrayList.get(j) < minimum) {
                    minimum = arrayList.get(j);
                    minimumindex = arrayList.indexOf(j);
                }
            }

            arrayListSortiert.add(minimum);
            arrayList.remove(minimumindex);
        }
    }

    public static void arrayFuellen(int laenge) {

        Random r = new Random();
        for (int i = 0; i <= laenge; i++) {

            arrayList.add(r.nextInt(100));
        }
    }


}
