import java.util.*;

public class String_Concepts {
    
    public static void string_basics() {
        //creation
        String str = "abcd";
        String str2 = new String("xyz");

        //input
        Scanner sc = new Scanner(System.in);
        String str3;
        str3 = sc.next();
        System.out.println(str3);

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

    public static void shortest_path(){
        String str = "WNEENESENNN";

        int x=0 , y=0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);

            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                    y--;
                }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
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
    public static void main(String[] args) {
        //palindrome();
        //shortest_path();
        lexicographic();
    }
    
}
