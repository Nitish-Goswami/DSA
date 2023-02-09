
public class PowerOfN {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int pow = 1;
        
        for(int i=1;i<=b;i++){
            pow *= a;
        }
        System.out.println(pow);
    }
}
