import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder reverse = new StringBuilder(input);
        reverse.reverse();


        if (input.equals(reverse.toString()))
        {
            System.out.println(input + " is a palindrome.");
        }
        else
        {
            System.out.println(input + " is not a palindrome.");    

        }



    }
    
}
