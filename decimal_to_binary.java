public class decimal_to_binary {
    public static void main(String[] args) {
        int d = dec_to_bin(10);
        System.out.println(d);
    }

    public static int dec_to_bin(int n) {
        int rem = 0;
        int pow = 0;

        while (n >0){
            int last_dig = n % 2 ;
            rem = last_dig + (int) (last_dig * Math.pow(10,pow));

            pow ++;
            n /= 2 ;
        }
        return rem;
    }
}
