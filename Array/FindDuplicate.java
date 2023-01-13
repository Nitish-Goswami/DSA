import java.util.Scanner;
public class FindDuplicate {
    public static int[] takeInput(int n)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int arr[]){
        for(int i : arr)
            System.out.print(i);
        System.out.println();
    }

    public static int  findDuplicate(int arr[]){
        int ans = 0;
        for(int i : arr)
            ans ^= i;

        int arr1[] = new int[arr.length-1];
        for(int i=0;i<arr1.length;i++)
            arr1[i] = i;
        
        for(int i : arr1)
            ans ^= i;    
        return ans ;
    }

    public static void main(String[] args) {
        int arr[] = takeInput(7);
        System.out.println(findDuplicate(arr));
    }
}
