//Check if the year is leap year or not

import java.util.Scanner;
public class W2nestedif {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int year=obj.nextInt();
        
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0){
                    //1200. 1600
                    System.out.println("Leap year");
                }
                else{
                    //1700, 1900
                    System.out.println("Non Leap year");
                }
            }
            else {
                //2012, 2004, 2016
                System.out.println("leap year");
            }
            }
            else {
                //2003, 2007, 2011, 2023
                System.out.println("Non leap year");
            }
        }
    }