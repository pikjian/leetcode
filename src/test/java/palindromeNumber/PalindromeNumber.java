package palindromeNumber;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        boolean rev = true;

        if (x<0) {
            rev = false;
            return rev;
        }

        int half = s.length()/2;
        for (int i = 0;i<=half;i++){
            int opp = s.length()-1-i;
            if (s.charAt(i) != s.charAt(opp))
                rev = false;
        }
        System.out.println(s);
        return rev;
        }


    public static void main (String [] args){
        isPalindrome(101);
    }
}
