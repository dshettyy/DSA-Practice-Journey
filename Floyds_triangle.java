public class Floyds_triangle {
    public static void main(String[] args) {
        floyds(5);
    }

    public static void floyds(int n) {
        int flag = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(flag+ " ");
                flag++;
            }
            System.out.println();
        }
    }
}
