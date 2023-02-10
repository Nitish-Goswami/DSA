class ArrangeNumbers {
    public static void arrangeNubers(int arr[]){
        int left = 0;
        int right = arr.length -1;
        int counter = 1;

        while(left <= right){
            if(counter % 2 == 1){
                arr[left] = counter;
                left++;
                counter++;
            }
            else
            {
                arr[right] = counter;
                counter++;
                right--;
            }
        }
    }

   public static void printList(int[] arr){
        for(int item : arr){
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        int N = 9;
        int[] arr = new int[N];

        arrangeNubers(arr);
        printList(arr);
        
    }
}