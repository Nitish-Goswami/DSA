/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
 */
public class CharacterPattern {
    public static void main(String[] args) {
        int N = 5;
        int i = 0;
        int count = 65;
        while(i < N){
            for(int j=0;j<=i;j++){
                char ch = (char)count;
                System.out.print(ch);
                count++;
            }
            count--;
            System.out.println();
            i++;
        }
    }
}
