package recursion;

public class PrintNumber {
    public static void printNum(int N){
        if(N==0)
            return;
        printNum(N-1);
        System.out.println(N);
    }

    public static void main(String[] args) {
        printNum(5);
    }
}
