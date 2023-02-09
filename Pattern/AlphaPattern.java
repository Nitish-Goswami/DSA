/*
 Code : Alpha Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
 */
public class AlphaPattern {
    public static void main(String[] args) {
        int N = 5;
        int i = 0;
        while(i < N){
            char ch = (char)(i+65);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
    }
}
