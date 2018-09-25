import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random r = new Random();

        //fills array with random integers and prints it
        for(int i = 0; i <= 9; i++){
            arrayList.add(r.nextInt(100));
            System.out.println(arrayList.get(i));
        }

        for(int i = 0; i <= 9; i++){

            if (arrayList.get(i - 1) > arrayList.get(i)) {
                int a = arrayList.get(i - 1);
                arrayList.set(i - 1, arrayList.get(i));
                arrayList.set(i, a);
            }

        }
    }
}
