//Find area(l*b) and perimeter(2*(l+b)) of rectangle
import java.util.Scanner;
public class LanguageQ3 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int l=obj.nextInt();
        int b=obj.nextInt();

        //int area=l*b;
        //int perimeter=2*l+b;
        //System.out.println(area);
        //System.out.println(perimeter);

        System.out.println("The area of rectangle is: " +(l*b));
        System.out.println("The perimeter of rectangle is: " +(2*l+b));
    }
}
