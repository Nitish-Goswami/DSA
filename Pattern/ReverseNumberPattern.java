/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
 */

public class ReverseNumberPattern {
 public static void main(String[] args) {
    int N = 4;
    int i = 1;

    while(i <= N){
        for(int j=i;j>0;j--){
            System.out.print(j);
        }
        System.out.println();
        i++;
    }
 }   
}
