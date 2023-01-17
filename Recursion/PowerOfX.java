package recursion;

public class PowerOfX {
    public static int powerOfX(int x,int n){
        if(n==0)
            return 1;
        if(n==1)
            return x;

        return x*powerOfX(x,n-1);
    }
    public static void main(String[] args) {
        int ans = powerOfX(5,3);
        System.out.println(ans);
    }
}
