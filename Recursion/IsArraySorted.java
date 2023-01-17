package recursion;

public class IsArraySorted {
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1)
            return true;
        if(arr[i] > arr[i+1])
            return false;
        return isSorted(arr,i+1);



    }

    public static void main(String[] args) {

        int arr[] = {1,4,5,6,9,15};
        boolean ans = isSorted(arr,0);
        System.out.println(ans);
    }
}
