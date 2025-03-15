//Max of 3 numbers using LOGICAL OPERATORS

public class W2Maxnum3{
    public static void main(String args[]){
        int a=5;
        int b=6;
        int c=2;

        if(a>=b && a>=c){
            System.out.println("The highest num is: " +a);
        }
        else if(b>=a && b>=c){
            System.out.println("The highest num is: " +b);
        }
        else{
            System.out.println("The highest num is: " +c);
        }
    }
}
