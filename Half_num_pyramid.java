public class Half_num_pyramid {
    public static void main(String[] args) {
        num_pyramid(5);
    }

    public static void num_pyramid(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
