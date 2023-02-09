// Write a program to print all the factors of a number other than 1 and the number itself.
public class Factors {
    public static void main(String[] args) {
        int n = 11;
        int i = 2;
        while(i <= n/2){
            if(n%i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
