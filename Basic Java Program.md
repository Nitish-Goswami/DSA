1. Function for finding maximum sum of subarray
  ```
   public static int maxSubarraySum(int[] arr) {
        int maxSum = 0;
        int currSum = 0;
        
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            currSum = Math.max(currSum,0);
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
  ```
  
  2. Function for rotating array by k
  ```
   public static void rotateByK(int[] arr, int k)
    {
        for(int i=1;i<=k;i++){
            int first = arr[arr.length-1];
            int j = arr.length-1;
            while(j>0){
                arr[j] = arr[j-1];
                j--;
            }
            arr[0] = first;
        }
    }
  ```
  
   3. Function for making array reverse
  ```
    public static void reverse(int[] arr) {
        int s = 0, e = arr.length-1;
        while(s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    ```
    4. Function for finding max element
    ```
     public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    ```
