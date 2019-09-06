import java.util.Scanner;

public class PE4{
    public static void main(String[] args) {
        int value;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        value=input.nextInt();
        for(int i=1;i<=value;i++){
            for(int j=1;j<=i;j++)
                System.out.print(i+" ");
        }
    }
}