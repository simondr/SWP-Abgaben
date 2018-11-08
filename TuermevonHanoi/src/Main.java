import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> src = new ArrayList();
        ArrayList<Integer> aux = new ArrayList();
        ArrayList<Integer> target = new ArrayList();
        for(int i = 3; i>=1; i-- ){
            src.add(i);
        }
        move(3,src,aux,target);

        printStatus(src,aux,target);

    }

    public static void move(int n, ArrayList src, ArrayList aux, ArrayList target){
        if (n == 0)
            return;
        move(n-1, src, target, aux);
        target.add(src.remove(src.size()-1));
        move(n-1, aux, src, target);
    }

    public static void printStatus(ArrayList src, ArrayList aux, ArrayList target){
        System.out.println(src);
        System.out.println(aux);
        System.out.println(target);
        System.out.println();
    }


}
