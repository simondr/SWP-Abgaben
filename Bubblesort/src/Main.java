import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random r = new Random();

        for(int i = 0; i<= 9; i++){

            arrayList.add(r.nextInt(100));
            System.out.println(arrayList.get(i));
        }


    }
}
