import java.util.Scanner;

public class CountingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        int vowels = 0;
        int consonants = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch != ' ') {

                if (ch >= 'a' && ch <= 'z') {

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } 
            }
        }
        System.out.println("Number of vowels in the string: " + vowels);
        System.out.println("Number of consonants in the string: " + consonants);
        scanner.close();
    }
    
}
