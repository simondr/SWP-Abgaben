public class Main {

    public static void main(String[] args) {

        String string = "";
        for(int i = 1; i<=100; i++){

            if(i%3 == 0)
                string += "fizz";
            if(i%4 == 0)
                string += "buzz";
            if (string.isEmpty())
                string += i;

            System.out.println(string);
            string = "";
        }
    }
}
