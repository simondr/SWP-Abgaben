public class Main {
    public static void main(String[] args){

        String ausgabe = new String();
        for(int i = 1; i<=100; i++){
            if(i%3 == 0)
                ausgabe = ausgabe + "fizz";
            if(i%4 == 0)
                ausgabe = ausgabe + "buzz";
            if(ausgabe.isEmpty())
                ausgabe += i;

            System.out.println(ausgabe);
            ausgabe = "";
        }
    }
}
