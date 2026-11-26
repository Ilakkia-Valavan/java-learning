import java.util.Scanner;

public class NumberToDay 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
        int dayNumber = scanner.nextInt();
        String dayName;

        switch (dayNumber) {
            case 1 ->
                dayName = "Monday";
                
            case 2 ->
                dayName = "Tuesday";
                
            case 3 ->
                dayName = "Wednesday";
                
            case 4 ->
                dayName = "Thursday";
                
            case 5 ->
                dayName = "Friday";
                
            case 6 ->
                dayName = "Saturday";
                
            case 7 ->
                dayName = "Sunday";
                
            default ->
                dayName = "Invalid day number";
        }

        System.out.println("The day corresponding to the number " + dayNumber + " is: " + dayName);
        scanner.close();
    }
}