//Print "FizzBuzz" if i is divisible by 3 and 5, print "Fizz" if i is divisible by 3, print "Buzz" if i is divisible by 5, else print i.

import java.util.Scanner;
public class W2fizzbuzz {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            else {
                System.out.println(i);
            }
        }
    }
}


