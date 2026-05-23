import java.util.*;

public class String_Concepts {
    
    public static void string_basics() {
        //creation
        String str = "abcd";
        @SuppressWarnings("RedundantStringConstructorCall")
        String str2 = new String("xyz");


        //input
        Scanner sc = new Scanner(System.in);
        String str3;
        str3 = sc.next();
        System.out.println(str3);

        //output
        System.out.println(str+str2);

    }
    //Substring
    public static void substring() {
        String str1 = "helloworld";
        String substr = "";
        for (int i = 0; i < 4;i++) {
            substr += str1.charAt(i);

        }
        System.out.print(substr);
    }
    //palindrome check
    public static void palindrome() {
        String str = "noon";
        boolean check = true;
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    //Shortest Path
    public static void shortest_path(){
        String str = "WNEENESENNN";

        int x=0 , y=0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);

            switch (dir) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'W' -> x--;
                default -> x++;
            }
        }
        int x2 = x*x; 
        int y2 = y*y;
        float result = (float) Math.sqrt(x2+y2) ;

        System.out.println(result);
    }

    public static void lexicographic() {
        String fruits[] = { "apple", "mango", "orange" };

        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                System.out.println(largest.compareTo(fruits[i]));
                largest = fruits[i];

            }

        }
        System.out.println(largest);
    }

    //String Builder
    public static void Stringbuilder() {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }

    public static void ToUppercase() {
        String str = "hello world";
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);

    }

    public static void StringCompression() {
        String str = "aaaabbbccd";
        String newstr = "";
        Integer count;

        for (int i = 0; i < str.length(); i++) {
            count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;

            }
            newstr +=str.charAt(i);
            if(count > 1)
            {
                newstr += count.toString();
            }
        }
        System.out.println(newstr);
    }
    public static void main(String[] args) {
        //palindrome();
        //shortest_path();
        //lexicographic();
        //substring();
        //Stringbuilder();
        //ToUppercase();
        StringCompression();
    }
    
}
