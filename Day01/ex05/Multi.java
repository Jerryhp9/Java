package Day01.ex05;

import java.util.Scanner;

public class Multi {

    public static void print_table(int number)
    {
        for (int i = 1; i <= 10; i++)
        {
            int result = (i * number);
            System.out.println(i + " * " + number + " = " + result);
        }
    }

    public static void main(String[]args){
        Scanner newobj = new Scanner(System.in);
        while (true)
        {
            System.out.print("Input multiplication number: ");
            int number = newobj.nextInt();
            if (number <= 0 || number > 10)
                System.out.println("please input numbers from only 1 to 10");
            else
            {
                print_table(number);
                break;
            }
        }
        newobj.close();
    }
}
