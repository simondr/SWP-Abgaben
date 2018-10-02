public class Main {

    public static void main(String[] args) {
        System.out.println(facRecursive(5));

        System.out.println(isPalindromRecursive("anna"));

    }

    public static int fac(int n) {

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int facRecursive(int n){
        if (n==1)
            return 1;
        return n * fac(n-1);
    }

    public static boolean isPalindrom(String s) {
        String string = "";
        for (int i = s.length()-1; i >= 0; i--) {
            string += s.charAt(i);
        }
        if (s.equals(string))
            return true;
        else
            return false;
    }

    public static boolean isPalindromRecursive(String s){
          if (s.length() == 1)
              return true;
          if(s.length() == 2 && s.charAt(0) == s.charAt(1))
              return true;
          if(s.charAt(0) == s.charAt(s.length()-1)) {

              return isPalindrom(s.substring(1,s.length()-2));
          }
          return false;
    }
}
