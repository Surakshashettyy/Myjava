//Enter temperature in fahrenheit and convert to celsius C=(F-32)*5/9

import java.util.Scanner;
public class W1LanguageQ4 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        double tempInFah=obj.nextDouble(); //input

        double tempInCel=(tempInFah-32)*5/9; //condition

System.out.println(tempInCel);
    }
}
