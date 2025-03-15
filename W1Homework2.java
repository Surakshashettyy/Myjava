// Enter P,R,T and calculate simple interest

import java.util.Scanner;
public class W1Homework2{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int p=obj.nextInt();
        int r=obj.nextInt();
        int t=obj.nextInt();

        int SI=(p*r*t)/100;
        
        System.out.println("Simple interest is: " +SI);
    }
}
