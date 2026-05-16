import java.util.*;

public class binomial_coef {
    public  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== Binomial Coefficient ==");
        System.out.println("Enter the vallue of n");
        int n = sc.nextInt();

        System.out.println("Enter the vallue of r");
        int r = sc.nextInt();

        double bino_coeff = binomial_coefficient(n, r);
        System.out.println(bino_coeff);

        sc.close();

    
    }

    public int fact(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;

        }
        return facto;
    }

    public int binomial_coefficient(int n, int r) {
        int n_fact = fact(n);
        int r_fact = fact(r);
        int rmn_fact = fact(n - r);
        return n_fact / (r_fact * (rmn_fact));
    }
    
}
