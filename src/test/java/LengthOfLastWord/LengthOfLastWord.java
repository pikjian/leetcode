package LengthOfLastWord;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.security.acl.LastOwnerException;
import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int lastLength=0;
        int fullLength = s.length();
        System.out.println("String length = " + s.length());
        List<Character> arr = new ArrayList();


        if(fullLength==0)
            return 0;
        char last = s.charAt(fullLength-1);
        if(Character.isWhitespace(last) && fullLength==1)
            return 0;

        while(Character.isWhitespace(last)) {
            System.out.println("Last is space");
            fullLength--;
            if(fullLength>0)
                last = s.charAt(fullLength-1);
            else
                break;
        }

        for(int i=fullLength-1;i>=0;i--){
            char x = s.charAt(i);

            if(!(Character.isWhitespace(x))) {
                arr.add(x);
            }
            else { break; }

            lastLength = arr.size();
        }

        //print last word
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
        }

        System.out.println();
        return lastLength;
    }

    public static void main (String [] args){
        System.out.println("lastLength = " + lengthOfLastWord("        "));
    }
}
