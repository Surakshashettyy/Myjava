import java.util.Scanner;
public class W2forloop {
    public static void main(String args[]){

        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=1; i<=n; i=i+2){
            System.out.println(i);
        }
    }
}
