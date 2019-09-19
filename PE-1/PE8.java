import java.util.Scanner;

public class PE8{
    public static void main(String[] args) {
        int value,check=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number [1-100]:");
        value=input.nextInt();
        if((value<1) || (value>100))
            System.out.println("Input number outside limits");
        else while(check!=value){
            System.out.println("Enter a guess:");
            check=input.nextInt();
            if(check==value)
                System.out.println("Number guessed matches the original number");
            else if(check>value)
                System.out.println("Number guessed is greater the original number");
            else //if(check<value)
                System.out.println("Number guessed is lesser the original number");
        }
    }
}