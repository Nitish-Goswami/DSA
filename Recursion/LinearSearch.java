package recursion;

public class LinearSearch {
    public  static  int linearSearch(int arr[],int item,int i){
        if(i == arr.length)
            return -1;
        if(item == arr[i])
            return  i;
        return linearSearch(arr,item,i+1);
    }

    public static void main(String[] args) {

        int arr[] = {9,8,10,8};
        int  ans = linearSearch(arr,8,0);
        System.out.println(ans);
    }
}
