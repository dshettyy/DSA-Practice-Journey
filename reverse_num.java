
public class reverse_num {
    public static void main(String[] args) {
        int num = 4567;
        int reverse = 0 ;

        while (num > 0) {
            int last_digit = num % 10;
            reverse = (reverse * 10) + last_digit;
            num /= 10;
        }
        System.out.println(reverse);
    }
    
}
