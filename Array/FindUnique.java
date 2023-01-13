import java.util.Scanner;

class FindUnique{
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

    public static int  findUnique(int arr[]){
        int ans = 0;
        for(int i : arr)
            ans ^= i;
        return ans ;
    }

    public static void main(String[] args) {
        int arr[] = takeInput(9);
        System.out.println(findUnique(arr));
    }
}