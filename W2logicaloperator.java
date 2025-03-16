//alternate for nested if problem to check if the year is leap year or not

import java.util.Scanner;
public class W2logicaloperator {
    public static void main (String args[]){
        Scanner obj=new Scanner(System.in);
        int year=obj.nextInt();
        
        if(year%4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Non Leap year");
        }
    }
}