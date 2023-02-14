import java.util.Scanner;
class BinarySearch {

	public static int searchElement(int[] arr,int key){
		int ans = -1;
		int low = 0;
		int high = arr.length;

		while(low < high){
			int mid = low+(high-low)/2;
			if(arr[mid] == key) { ans = mid; return ans;}
			else if(arr[mid] > key){ high = mid-1; }
			else low = mid+1;
		} 
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}	
		int key = sc.nextInt();	
		int ans = searchElement(arr, key);
		System.out.println(ans);
	}
}