package Day00.ex01;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = obj.nextInt();
        System.out.println("Enter another number");
        double num2 = obj.nextInt();
        System.out.println("Enter an operator +,-,*,/");
        int flag = 0;
        while (flag != 1)
        {
            String op = obj.next();
            obj.useDelimiter("\n");
            if (op.isBlank() || op.isEmpty())
                System.out.println("Empty input, try again");
            else if (Objects.equals("+", op))
            {
                System.out.println(num + num2);
                flag = 1;
            }
            else if (Objects.equals("-", op))
            {
                System.out.println(num - num2);
                flag = 1;
            }
            else if (Objects.equals("*", op))
            {
                System.out.println(num * num2);
                flag = 1;
            }
            else if (Objects.equals("/", op))
            {
                System.out.println(num / num2);
                flag = 1;
            }
            else
                System.out.println("Invalid operator, try again");
        }
        obj.close();
    }
}
