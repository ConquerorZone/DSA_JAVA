public class bubble_algo {
    public static void main(String[] args) {
        int[] arr = {5,6,8,2,1,3,7,9};
        int size = arr.length;
        int temp;
        
        System.out.println("before sort");
        for (int i : arr) {
            System.out.print(i+",");
        }

        // One thing must be noted, This method is not efficient-> it's for small size arrays
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
            if (arr[j]>arr[j+1]) {
                temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }

        System.out.println();
        System.out.println("after sort");
        for (int i : arr) {
            System.out.print(i+",");
        }
    }


}
