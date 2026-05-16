
public class Array_Chapter {

    public static void arroperations(int arr[]) { //Creation
        int marks[] = new int[50];
        int numbers[] = { 1, 2, 3, 4 };
        String fruits[] = { "apple", "banana", "mango" };
        System.out.println(numbers[1]);
        System.out.println(fruits[1]);
        //input
        marks[0] = 90;

        //Update
        marks[0] = 80;

        //Display
        System.out.print(marks[0]);

    }

    //Binary Search
    public static void binarysearch(int arr[]) {
        int key = 10;

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key == arr[mid]) {
                System.out.println("Key found at Index :" + mid);
                return;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Element not Found");
    }

    //Reverse an Array
    public static void reverse(int arr[]) {

        int start = 0, end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Print all Subarrays in an Array
    public static void subarrays(int arr[]) {

        for (int i = 0; i <= arr.length - 1; i++) {

            for (int j = 0; j <= arr.length - 1; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
    // Arrays-II
    //Printing Maximum sun of an SUbarray in an Array
    public static void maxsubarray(int arr[]) {

        int max = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum = currsum + arr[k];

                }
                if (currsum > max) {
                    max = currsum;
                }
            }
            System.out.println(currsum);

        }
        System.out.println("Total Sum :" + currsum);
        System.out.println("Maximum :" + max);
    }

    //Printing Maximum sun of an SUbarray in an Array using prefix method
    public static void prefixsum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currsum = 0;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (currsum > max) {
                    max = currsum;
                }
            }
            System.out.println("Current sub-array sum :" + currsum);

        }

        System.out.println("Maximum :" + max);

    }

    public static void kadanes(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 1; i++) {
            currsum += arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("Maximum sub array :" + maxsum);
    }

    public static void trapping_rainwater(){
        int arr[] = {4, 2, 0 ,6, 3, 2, 5};
        int n = arr.length ;

        //calc left max boundary array
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }
      
        //calc right max boundary array
        int rightmax[] = new int[n];
        rightmax[n - 1] = arr[n - 1];
        for (int i = n-2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]); 
        }

        int trappedwater = 0;
        //loop
        for (int i = 0; i < n; i++) {

            //waterlevel = minimum (left , right)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            //trappedwater = (left - right) * width 
            trappedwater += (waterlevel - arr[i]) * 1;

        }
        
        System.out.println(trappedwater);
    

    }

    public static void stock_buysell() {
        int arr[] = { 7, 1, 5, 3, 6, 4 };

        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;
       

        for (int i = 0; i < arr.length; i++) {
            if (buy < arr[i]) {
                int profit = arr[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = arr[i];
            }
            
        }
        System.out.print(maxProfit);
    }
    public static void main(String[] args) {
        //int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        //int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        //arroperations(arr);

        //binarysearch();
        //reverse(arr);
        //subarrays(arr);\
        //maxsubarray(arr);
        //prefixsum(arr);
        //kadanes(arr);
        //trapping_rainwater();
       // stock_buysell();
    }
}