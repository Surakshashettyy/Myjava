//Calculate total, average(total/n) and percentage (total*100)/500 of 5 subjects

import java.util.Scanner;
public class W1LanguageQ5 {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        int d=obj.nextInt();
        int e=obj.nextInt();

        int total=a+b+c+d+e;
        double average=total/5;
        double percentage=(total/5); //int percentage=(total*100)/500;

        System.out.println(total);
        System.out.println(average);
        System.out.println(percentage);
    }
}
