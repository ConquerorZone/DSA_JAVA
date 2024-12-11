public class QuickSort_Algo {

    // Quick sort method best case O(n log n) and worst cast O(n square)
    // Average case O(n log n)

    // Devide and conquer method
    public static void main(String[] args) {
        int[] arr = { 5, 6, 8, 2, 1, 3, 7, 9, 20, 55, 1, 5, 6, 7, 8, 2, 22 };

        System.out.println("before sort");
        for (int i : arr) {
            System.out.print(i + ",");
        }

        QuickSort(arr, 0, arr.length - 1);

        System.out.println();
        System.out.println("after sort");
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotindex = partition(arr, low, high);
            QuickSort(arr, low, pivotindex - 1);
            QuickSort(arr, pivotindex + 1, high);

        }

    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

}
