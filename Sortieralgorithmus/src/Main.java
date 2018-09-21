import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListSorted = new ArrayList<>();
        Random r = new Random();

        for(int i = 0; i<= 9; i++){
             arrayList.add(r.nextInt(100));
             System.out.println(arrayList.get(i));
        }

        System.out.println();
        

       for (int j = 0; j < arrayList.size(); j++ ){

            int minimum = arrayList.get(0);
            int minimumindex = arrayList.indexOf(0);
            

            for (int i = 1; i < arrayList.size(); i++){

               
                if(arrayList.get(i) < minimum) {
                     minimum = arrayList.get(i);
                     minimumindex = i;

                }

            }
           arrayListSorted.add(minimum);
           arrayList.remove(minimumindex);
            
            System.out.println(minimum);
            System.out.println(minimumindex);
            
        }


        for(int i = 0; i<= 9; i++){
            System.out.println(arrayListSorted.get(i));
        }
    }



}
