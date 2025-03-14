import java.util.Scanner;
public class W1Scannerclass4 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in); //System.in used for taking input from the console

        int a = obj.nextInt();
        float b = obj.nextFloat();
        double c = obj.nextDouble();
        String w = obj.next();     //next() is used for one word input
        String s = obj.nextLine(); //nextLine() is used for multiple word input
        char d = obj.next().charAt(0); //charAt(0) is used to take the first character of the input

        System.out.println("The value of a is " +a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(w);
        System.out.println(s);
        System.out.println(d);
    }
}
