//Finding last digit of a number using while loop

import java.util.Scanner;
public class W2whileloop {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        
        while(n>0)
        {
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;
        }
    }
}