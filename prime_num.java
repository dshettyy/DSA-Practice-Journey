
import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int num = sc.nextInt();

        if (num == 0 || num == 1) {
            System.out.println("Not a prime Number");
        }
        boolean flag = true; 
        for (int i = 2; i <= num / 2; i++) {
            if (num % i== 0) {
                flag = false;
                break;
            } 
        }
        if (flag == true){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
        sc.close();
        }
        
      }
    
    

