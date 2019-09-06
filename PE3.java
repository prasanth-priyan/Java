import java.util.Scanner;

public class PE3{
    public static void main(String[] args) {
        String test;
        char c;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the test string of letters only:");
        test=input.nextLine();
        for(int i=0;i<test.length();i++){
            c=test.charAt(i);
            c=Character.toLowerCase(c);
            if(Character.isLetter(c)==false)
                System.out.print("Error ");
            else if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
                System.out.print("Vowel ");
            else
                System.out.print("Consonant ");
        }
    }
}