public class Inverted_hollow_pyramid  {
    public static void main(String[] args) {
        hollow_pyramin(5);
    }

    public static void hollow_pyramin(int n){
        for (int i =1; i<=n; i++){
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j =1 ; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
