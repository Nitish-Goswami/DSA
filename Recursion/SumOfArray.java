package recursion;

public class SumOfArray {
    public static int  sumOfArray(int arr[],int i){
        if(i == arr.length)
            return 0;

        return arr[i]+sumOfArray(arr,i+1);
    }

    public static void main(String[] args) {

        int arr[] = {1,4,5,12,9,15};
        int  ans = sumOfArray(arr,0);
        System.out.println(ans);
    }
}
