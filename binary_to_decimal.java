public class binary_to_decimal {
    public static void main(String[] args) {
        int b = Bin_to_dec(10000);
       System.out.println(b);

    }
    
    public static int Bin_to_dec(int bin) {
        int dec = 0;
        int pow = 0;

        while (bin > 0) {
            int last_dig = bin % 10;
            dec = dec + (last_dig * (int) Math.pow(2, pow));

            pow++;
            bin /= 10;
        }
        return dec;
    }
}
