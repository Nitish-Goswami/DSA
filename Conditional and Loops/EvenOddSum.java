// Write a program to print sum of its even digits and odd digits
public class EvenOddSum {
    public static void main(String[] args) {
        int num = 552245;
    int evenSum = 0;
    int oddSum = 0;

    while(num > 0){
        int digit = num%10;
        if(num%2 == 0)
            evenSum += digit;
        else    
            oddSum += digit; 
        num /= 10;
    }
    System.out.println(evenSum+" "+oddSum);
    }
}
