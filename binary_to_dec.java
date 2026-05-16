;public class binary_to_dec {
    public static void main(String[] args) {
        int pow = 0;
        double dec = 0;
        int bin = 1010;

        while (bin > 0) {
            int lastdig = bin % 10;
            dec = dec + lastdig * (Math.pow(2, pow));
            bin = bin / 10;
            pow++;
        }
        System.out.println(dec);

        
    }
    
}
