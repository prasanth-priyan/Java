import java.util.Scanner;

public class PE2{
    public static void main(String[] args) {
        int value;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 20 and 30:");
        value = input.nextInt();
        if(value>20 && value<30){
            if(value%2!=0)
                System.out.println("Tom");
            else
                System.out.println("Jerry");                
        }
        else
            System.out.println("Value outside limits");
    }
}