package Day02.ex09;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class reverse_array {

    public static void array_reversed(int[] numbers) {
        int[] nums = new int[5];
        int i = numbers.length - 1;
        int j = 0;
        while(i >= 0)
            nums[j++] = numbers[i--];
        for(int k = 0; k < nums.length; k++)
        {
            if (k < nums.length - 1)
                System.out.print(nums[k] + " ");
            else
                System.out.println(nums[k]);
        }
    }
    public static void main(String[] args) {
        int[] numbers = new int[5];
        try (Scanner newobj = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++)
            {
                while (true)
                {
                    try {
                        System.out.println("Enter number " + (i + 1));
                        String input = newobj.nextLine();
                        if (input.isEmpty())
                        {
                            System.out.println("Input is empty, try again");
                            continue;
                        }
                        numbers[i] = Integer.parseInt(input);
                        break;
                    } 
                    catch (NoSuchElementException | NumberFormatException e) {
                        if (e instanceof NoSuchElementException)
                        {
                            System.out.println("Detected End of input, exiting...");
                            System.exit(1);
                        }
                        System.out.println("Invalid input, try again");
                    }
                }
            }
            array_reversed(numbers);
        }
    }
}
