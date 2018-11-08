import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = getRandomList(8);
        quickersort(arrayList);
    }

    public static ArrayList<Integer> getRandomList(int size) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i <= size - 1; i++) {

            arrayList.add(r.nextInt(100));
        }
        return arrayList;

    }

    public static ArrayList<Integer> quickersort (ArrayList<Integer> arrayList, int leftindex, int rightindex){

        if (arrayList.size() <=1)
            return arrayList;

        int pivot = 0;
        if(arrayList.size()%2 == 0)
            pivot = arrayList.size()/2;
        else
            pivot = (arrayList.size()-1)/2;
        System.out.println(pivot);

        int smallerthanpivot = arrayList.get(pivot);
        while (smallerthanpivot>=pivot){

            if(arrayList.get(leftindex) < arrayList.get(pivot))
                smallerthanpivot = arrayList.get(pivot);
            leftindex++;
        }

        int greaterthanpivot = arrayList.get(pivot);
        while (greaterthanpivot<=pivot){

            if(arrayList.get(rightindex) < arrayList.get(pivot))
                greaterthanpivot = rightindex;
            rightindex--;
        }



        Collections.swap(arrayList,leftindex-1,rightindex+1);
        return quickersort(arrayList, leftindex, rightindex);



     /*   for (int leftindex = 0; leftindex <= pivot; leftindex++){

            int smallerthanpivot;
            if(arrayList.get(leftindex) < arrayList.get(pivot))

            smallerthanpivot = arrayList.get(pivot);
        }


        for (int rightindex = arrayList.size()-1; rightindex >= pivot; rightindex--){

            int greaterthanpivot;
            if(arrayList.get(rightindex) > arrayList.get(pivot))

            greaterthanpivot = arrayList.get(pivot);
        }*/

    }
}
