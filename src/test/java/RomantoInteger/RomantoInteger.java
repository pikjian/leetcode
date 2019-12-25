package RomantoInteger;

public class RomantoInteger {
    public static int romanToInt(String s) {
        int num=0;
        int temp=0;
        int[] word = new int[s.length()];

        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == 'I') word[i] = 1;
            else if (s.charAt(i) == 'V') word[i] = 5;
            else if (s.charAt(i) == 'X') word[i] = 10;
            else if (s.charAt(i) == 'L') word[i] = 50;
            else if (s.charAt(i) == 'C') word[i] = 100;
            else if (s.charAt(i) == 'D') word[i] = 500;
            else if (s.charAt(i) == 'M') word[i] = 1000;
            System.out.println(i + " : "+ word[i]);
        }
        for (int i = s.length()-1; i >= 0; i--) {
                if (word[i] >= temp){
                    num += word[i];}
                else
                    num -= word[i];
                    temp = word[i];
                }
        return num;

    }
    public static void main (String []args){
        System.out.println(romanToInt("XVX"));
    }


}
