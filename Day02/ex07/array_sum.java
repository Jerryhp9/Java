package Day03;

import java.util.Scanner;

public class array_sum {
    public static void print_sum(int[] numbers){
        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            sum = sum + numbers[i];
        }
        System.out.println("Average: " + (sum/5));
    }
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner newobj = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            int flag = 0;
            while (flag != 1)
            {
                System.out.print("Enter number " + (i + 1) + ": ");
                if (newobj.hasNextInt())
                {
                    numbers[i] = newobj.nextInt();
                    flag = 1;
                }
                else
                {
                    System.out.println("Invalid input, try again");
                    newobj.next();
                }
            }
            System.out.println();
        }
        print_sum(numbers);
        newobj.close();
    }
}
