public class Sorting_algos {

    public static void bubble_sort() {
        int arr[] = { 5, 4, 3, 2, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
       
    }

    public static void selection_sort() {

        int arr[] = { 5, 1, 1, 4, 3, 2, 1 };

        for (int i = 0; i < arr.length - 1; i++) {

            int minpos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertion_sort() {

        int arr[] = { 5, 1, 1, 4, 3, 2, 1 };

        for (int i = 1; i < arr.length; i++) {

            int curr = arr[i]; // ✅ value
            int prev = i - 1;

            // shift elements
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // place element
            arr[prev + 1] = curr;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void counting_sort() {
        int arr[] = { 5, 4, 6, 2, 1, 7, 1, 2,99 };

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        //bubble_sort();
        //selection_sort(); 
        //insertion_sort();                
        //counting_sort();
    }
    
}
