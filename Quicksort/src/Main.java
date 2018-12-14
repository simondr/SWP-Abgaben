import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = getRandomList(5);

        System.out.println(arrayList);

        System.out.println();

        System.out.println(quicksortq(arrayList));

    }

    public static ArrayList<Integer> getRandomList(int size) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i <= size - 1; i++) {

            arrayList.add(r.nextInt(100));
        }
        return arrayList;

    }

    public static ArrayList<Integer> quicksortq(ArrayList<Integer> arrayList) {


        if (arrayList.size() <=1)
            return arrayList;

        Random r = new Random();
        int pivot = r.nextInt(arrayList.size());

        ArrayList<Integer> smaller = new ArrayList<Integer>();
        ArrayList<Integer> greater = new ArrayList<Integer>();

        System.out.println("Pivot: " + pivot);

        for (int i = 0; i <= arrayList.size() - 1; i++) {

            if (arrayList.get(i) <= arrayList.get(pivot)) {

                smaller.add(arrayList.get(i));

            }

            if (arrayList.get(i) > arrayList.get(pivot)) {

                greater.add(arrayList.get(i));

            }
        }

        System.out.println("smaller: " + smaller);
        System.out.println("greater: " + greater);

        arrayList.clear();
        arrayList.addAll(quicksortq(smaller));
        arrayList.addAll(quicksortq(greater));

        return arrayList;
    }


}
