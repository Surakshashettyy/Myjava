//Enter two numbers and perform all arithmetic operations

import java.util.Scanner;
public class W1Homework1 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();

        System.out.println("The sum of a and b is: " +(a+b)); //System.out.println(a+b);
        System.out.println("The subtraction of a and b is: " +(a-b));
        System.out.println("The multiplication of a and b is: " +(a*b));
        System.out.println("The quotient of a and b is: " +(a/b));
        System.out.println("The modulus of a and b is: " +(a%b));
    }
} 

