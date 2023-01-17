package recursion;

public class FindIndex {
    public  static  int firstIndex(int arr[],int item,int i){
        if(i == arr.length)
            return -1;
        if(item == arr[i])
            return  i;
        return firstIndex(arr,item,i+1);
    }

    public  static  int lastIndex(int arr[],int item,int i,int ans ){
        if(i == arr.length)
            return ans;
        if(item == arr[i])
            ans =  i;
        return lastIndex(arr,item,i+1,ans);
    }

    public static void main(String[] args) {

        int arr[] = {9,8,10,8};
        int  firstIndex = firstIndex(arr,8,0);
        int  lastIndex = lastIndex(arr,8,0,-1);
        System.out.println(firstIndex+", "+lastIndex);
    }
}
