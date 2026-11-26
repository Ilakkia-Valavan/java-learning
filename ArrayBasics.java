import java.util.Scanner;

public class ArrayBasics 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int len = scanner.nextInt();

        System.out.println("Enter " + len + " elements for the array:");
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) 
        {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.println(numbers[i]);
        }

        int sum = 0;
        for (int num : numbers) 
        {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);

        System.out.println("average of array elements: " + (double) sum / numbers.length);

        int max = numbers[0];
        for (int i =0; i<numbers.length; i++)
        {
            if (numbers[i]>max)
            {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i ++)
        {
            if (numbers[i]<min)
            {
                min = numbers[i];
            }
        }
        System.out.println("Minimum element in the array: " + min);
    }
    
}
