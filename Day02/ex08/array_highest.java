package Day03;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class array_highest {

    public static boolean duplicate_number(int[] numbers) {
        int i = 0;
        while (i < 9)
        {
            if (numbers[i] == numbers[i + 1])
            {
                System.out.println("\nduplicated number, abort");
                return (true);
            }
            i++;
        }
        return (false);
    }

    public static void find_highest_lowest(int[] numbers) {
        if (duplicate_number(numbers) == true)
            return;
        int number = numbers[0];
        for (int i = 1; i < 10; i++)
        {
            if (numbers[i] > number)
                number = numbers[i];
        }
        System.out.println("\nhighest: " + number);
        for (int i = 0; i < 10; i++)
        {
            if (numbers[i] < number)
                number = numbers[i];
        }
        System.out.println("lowest: " + number);
    }
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner newobj = new Scanner(System.in);
        System.out.println("Enter 10 numbers:\n");
        for (int i = 0; i < 10; i++)
        {
            int flag = 0;
            while (flag != 1)
            {
                try {
                    String input = newobj.nextLine();
                    if (input.isEmpty())
                    {
                        System.out.println("input is empty");
                        continue;
                    }
                    numbers[i] = Integer.parseInt(input);
                    flag = 1;
                } 
                catch (NoSuchElementException | NumberFormatException e) { //InputMismatchException is the subclass of NoSuchElementException
                    
                    if(e instanceof NoSuchElementException)
                    {
                        System.out.println("detected end of input, Exiting...");
                        System.exit(1);
                    }
                    System.out.println("invalid input, try again");
                    
                }
            }
        }
        find_highest_lowest(numbers);
    }
}
