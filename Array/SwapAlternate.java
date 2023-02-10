public class SwapAlternate {
    public static void SwapAlternate(int arr[]){
        // Checking for array length
        int length = arr.length%2 == 0 ? arr.length : arr.length-1 ;
        for(int i=0;i<length;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {9, 3, 6, 12, 4, 32, 5, 11, 19};
       SwapAlternate(arr);
       printList(arr);

    }
    public static void printList(int[] arr){
        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}
