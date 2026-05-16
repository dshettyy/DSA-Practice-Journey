

public class Patterns {
    public static void main(String[] args) {
        Patterns obj = new Patterns();
        //obj.half_Pyramid_Star(4);
        //obj.inverted_Star(4);
        //obj.num_halaPyramid(4);
        //obj.char_pyramid(4);
        //ivtpyramid(4);
        //ivtpyramid_num(5);
        //floyds(5);
        //triangle_01(5);
        butterfly_patt(5);
    }

    public void half_Pyramid_Star(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void inverted_Star(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void num_halaPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void char_pyramid(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void ivtpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ivtpyramid_num(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void floyds(int n) {
        int flag = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(flag + " ");
                flag++;
            }
            System.out.println();
        }
    }

    public static void triangle_01(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_patt(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}