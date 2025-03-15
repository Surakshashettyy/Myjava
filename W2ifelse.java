import java.util.Scanner;
public class W2ifelse {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();

        if(num>=18){
            System.out.print("Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
}

