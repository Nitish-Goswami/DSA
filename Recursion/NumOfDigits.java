package recursion;

public class NumOfDigits {
    public static int numOfDigits(int N){
        if(N==0)
            return 0;
        return 1+numOfDigits(N/10);

    }

    public static void main(String[] args) {
        System.out.println(numOfDigits(1234567));
    }
}
