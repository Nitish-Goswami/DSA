import java.util.Scanner;
import java.util.Arrays;
public class MergeSortArray {
    public static int[] mergeSortArray(int arr1[],int arr2[])
    {
        int[] ans = new int[arr1.length+arr2.length];
        
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                ans[k++] = arr1[i++];
            }
            else 
                ans[k++] = arr2[j++];
        }
        
        while(i<arr1.length){
            ans[k++] = arr1[i++];
        }
        
        while(j<arr2.length){
            ans[k++] = arr2[j++];
        }
        
        
        return ans;
        
    }


    public static void printArray(int arr[]){
        for(int i : arr)
            System.out.print(i);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 6, 9, 0, 0,};
        int[] arr2 = {4,10};
        
        int arr[] = mergeSortArray(arr1,arr2);
        System.out.println(Arrays.toString(arr));
        
        // 1 2 3 4 4 6 7 11 13 
    }
}