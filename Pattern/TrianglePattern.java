/*
 Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
 */
public class TrianglePattern {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        while(i<=n)
        {
            for(int cols=1;cols<=n;cols++){
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
