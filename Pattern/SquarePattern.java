/*
Code : Square Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
 */
class SquarePattern {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        while(i <= n) {
            int cols = 1;
            while(cols <= n) {
                System.out.print(n+" ");
                cols++;
            }
            System.out.println();
            i++;
        }
    }
}