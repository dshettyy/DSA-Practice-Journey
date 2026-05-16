import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1= 10;
        int num2 = 20;
    
        System.out.println("Enter the operator :");
        String operator = sc.next();

        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Invalid Input");

        }
        sc.close();

    
}        
    
    
}
