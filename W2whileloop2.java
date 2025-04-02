//Sum of digits of a positive number

import java.util.Scanner;
public class W2whileloop2 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        
        while(n>0){
            int lastDigit=n%10;
            sum=sum+lastDigit;
            n=n/10;
        }
            System.out.println(sum); //outisde 
    }
}
