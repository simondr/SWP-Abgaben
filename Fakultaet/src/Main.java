public class Main {

    public static void main(String[] args) {
        //System.out.println(facRecursive(5));
        //System.out.println(isPalindromRecursive("anna"));
        //System.out.println(pascalTrinagleRecursive(10, 5));
        //System.out.println(pascalTriangle(10, 5));
        //System.out.println(fibonacci(5));
        long starttime = System.nanoTime();
        System.out.println(fac(10));
        long elapsedtime = System.nanoTime() - starttime;
        System.out.println(elapsedtime);

    }

    public static int fac(int n) {

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int facRecursive(int n) {
        if (n == 1)
            return 1;
        return n * fac(n - 1);
    }

    public static int facEndRecursive(int n, int i){

        if(n == 1)
            return i;
        return facEndRecursive(n-1, i*n);
    }

    public static boolean isPalindrom(String s) {
        String string = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            string += s.charAt(i);
        }
        if (s.equals(string))
            return true;
        else
            return false;
    }

    public static boolean isPalindromRecursive(String s) {
        if (s.length() == 1)
            return true;
        if (s.length() == 2 && s.charAt(0) == s.charAt(1))
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {

            return isPalindrom(s.substring(1, s.length() - 2));
        }
        return false;
    }


    public static int pascalTrinagleRecursive(int x, int y) {

        if (x == y || y == 0)
            return 1;

        return pascalTrinagleRecursive(x - 1, y - 1) + pascalTrinagleRecursive(x-1,y);
    }

    public static int pascalTriangle(int x, int y){

        int[][] pascalTriangle = new int[x][y];
        pascalTriangle[0][0] = 1;
        for (int i = 1; i <= x; i++){
            for (int j = 1; j<= y; j++){
                pascalTriangle[x][y] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];


            }
        }
        return pascalTriangle[x] [y];

    }

    public static int fibonacci(int index){

        if(index == 0)
            return 1;
        if (index == -1)
            return 1;
        return fibonacci(index-1) + fibonacci(index-2);

    }
}
