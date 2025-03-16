//Check whether a character is alphabet or digit 
//ASCII VALUE OF A-Z: 65-90, a-z: 97-122, 0-9: 48-57)

import java.util.Scanner;
public class W2typecasting {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        
        char ch=obj.next().charAt(0);
        int value=ch;
        
        if((value>=65 && value<=90) || (value>=97 && value<=122)){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Digit");
        }
    }
}
