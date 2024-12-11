public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 9, 7, 6, 4, 3, 2, 1 };

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) { // In this first we compair key with previous value and
                arr[j + 1] = arr[j];
                j--;                          // decrement previous value 
            }                                 
            arr[j + 1] = key;
        }

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
} 
