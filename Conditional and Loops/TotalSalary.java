/* 
Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
 totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.
Note: Try finding out a function on the internet to do so
*/
import java.util.Scanner;
public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        char grade = sc.next().charAt(0);

        float hra = salary * 0.2f;
        float da = salary * 0.5f;
        float pf = salary * 0.11f;
        float allow = 0;
        switch(grade){
            case 'A' :
            allow = 1700;
            break;
            case 'B' :
            allow = 1500;
            break;
            case 'C':
            allow = 1300;
            break;
        }
        System.out.println("HRA : "+hra);
        System.out.println("DA : "+da);
        System.out.println("PF : "+pf);
        System.out.println("Allow : "+allow);
        int taotaSalary =  Math.round(salary+hra+da+allow-pf);
        System.out.println(taotaSalary);

    }
}
