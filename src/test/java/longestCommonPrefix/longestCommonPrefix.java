package longestCommonPrefix;

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int shortest = 0;

        char character ;
        int x=0;
        boolean match = false;

        if (strs.length==0)
            return "";
        int shortestlength = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
//            System.out.println(i + " : " + strs[i]);
//            System.out.println(strs[i] + " : " + strs[i].length());
            if (strs[i].length() <= shortestlength) {
                shortest = i;
                shortestlength = strs[i].length();
            }
//            System.out.println("shortestlength : " + shortestlength);
//            System.out.println("shortest: " + shortest);
        }
            for (int y = 0; y < strs[shortest].length(); y++){
                character = strs[0].charAt(y);
                for (x = 0; x < strs.length; x++){
                    System.out.print(character);
                    System.out.print(" vs ");
                    System.out.print(strs[x].charAt(y));
                    System.out.println();

                    if(character==strs[x].charAt(y)){
                        match = true;
                        System.out.println(match);
                    }
                    else{
                        match = false;
                        System.out.println(match);
                        break;
                    }
                }

                if (match==true){
                    prefix = prefix + character;
                    System.out.println("Prefix : " + prefix);
                }
                else if (match==false)
                    break;

            }
        return prefix;
    }

    public static void main (String []args){
        String[] text = {"c","acc","ccc"};
        longestCommonPrefix(text);
    }
}
