import java.util.*;

public class factorial {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find factorial :");
        int n = sc.nextInt();
        int f = fact(n);
        System.out.println(f);

        sc.close();
    }

    public int fact(int n){
        int facto = 1 ;
        for (int i = 1; i <= n; i++) {
            facto *= i;

        }
        return facto;
    }

}