// Check whether the given number is even or odd

import java.util.Scanner;
public class W2Language1 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        
        if(num%2==0){
            System.out.println("The given number is even");
        }
        else
            System.out.println("The given number is odd");
    }
}
