public class PowerOf2 {
    public static boolean isPowerOf2(int num) {
        if(num==0)   return false;
        return (num & num-1) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOf2(5));
    }
}