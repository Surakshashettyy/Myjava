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

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        
        //1 to n
        for(int i=1; i<=n; i++){
            //for every i we need to calculate sum of digits
            int copyOfI=i;
            int sum=0;
            while (copyOfI>0)
            {
                int lastDigit=copyOfI%10;
                sum=sum+lastDigit;
                copyOfI= copyOfI/10;
            }
            System.out.println(i + "-->" +sum);
        }
    }
}