public class selection_algo {
    public static void main(String[] args) {
        int[] arr = {5,6,8,4,2,1,3,7,9};
        int size = arr.length;
        int temp;
        int minIndex;
        
        System.out.println("before sort");
        for (int i : arr) {
            System.out.print(i+",");
        }

        // One thing must be noted, This method is not efficient-> it's for small size arrays 
                                                                // and it's better that bubble sort
        for (int i = 0; i < size-1; i++) {
            minIndex = i;
            for (int j = i+1; j < size; j++) {
               if (arr[minIndex] > arr[j]) {
                minIndex=j;
               }
               
            }
            temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }

        System.out.println();
        System.out.println("after sort");
        for (int i : arr) {
            System.out.print(i+",");
        }
    }
}
