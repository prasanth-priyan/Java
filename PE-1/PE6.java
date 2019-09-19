import java.util.Scanner;

public class PE6{
    public static void main(String[] args)  {
        char c;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the character:");
        c=input.next().charAt(0);
        if(Character.isLetter(c)){
            if(Character.isLowerCase(c))
                System.out.println("Small letter");
            else
                System.out.println("Capital letter");
        }
        else if(Character.isDigit(c))
            System.out.println("Digit");
        else
            System.out.println("Special symbol");
    }
}