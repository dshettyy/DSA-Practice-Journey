import java.util.Scanner;

public class Product_of_num {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter two Numbers :");
        int a = obj.nextInt();
        int b = obj.nextInt();

        int sum = a * b;
        System.out.print(sum);

        obj.close();
    }

    
    
}
