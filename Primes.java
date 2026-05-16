public class Primes {
    public static void main(String[] args) {
        Primes f = new Primes();
        //f.prime(75);
        f.prime_range(100);
    }

    public void prime(int num) {
        boolean flag = true;

        if (num == 0 || num == 1) {
            System.out.println("They are not prime Numbers");
            return;
        } else if (num >= 2) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
        } else {
            System.out.println("Invalid Input");
            return;
        }

        if (flag) {
            System.out.println(num + " is a prime Number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }

    public void prime_range(int n) {
        if (n == 1 || n == 0) {
            System.out.println("Cannot calculate between 0 and 1");
        } else if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

