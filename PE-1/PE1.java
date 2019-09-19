import java.util.Scanner;

public class PE1{
    public static void main(String[] args) {
        int value, rev = 0, sum = 0, count = 1, digit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        value = input.nextInt();
        int temp = value;
        while (temp != 0) {
            digit = temp % 10;
            rev += (digit);
            rev *= 10;
            temp /= 10;
            if ((count++ % 2) == 0)
                sum += digit;
        }
        rev /= 10;
        if ((rev == value) && sum > 25)
            System.out.println(rev + " is a palindrome and sum of even numbers is greater than 25");
        else if (rev == value)
            System.out.println(rev + " is a palindrome and sum of even numbers is lesser than 25");
        else
            System.out.println(sum + " is not a palindrome");
    }
}