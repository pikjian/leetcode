package ReverseInteger;


public class ReverseInteger {
        public static int reverse(int x) {
            int rev = 0;
            while(x != 0 ){
                int temp = rev;
                System.out.println("temp : " + temp);
                rev = rev*10 + x%10;
                System.out.println("rev : " + rev);
                int y;
                y = ((rev-(x%10))/10);
                System.out.println("y : " + y);
                if(temp != y){
                    rev = 0;
                    break;
                }
                x = x/10;
            }
            return  rev;
        }

    public static void main (String []arg) {
        //Method 1 : Succes until added 10th number
//        int num = 123445699, reversed = 0;
//        while(num != 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num /= 10;
//        }
//        System.out.println("Reversed Number: " + reversed);
        System.out.println(reverse(1234));
    }
}

