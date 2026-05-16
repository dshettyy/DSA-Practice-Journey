public class Patterns_Printing {
    public static void main(String[] args) {
        hollow_rectangle(4, 5);

    }

    public static void hollow_rectangle(int row, int cols) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == row || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}