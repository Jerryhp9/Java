package Day04.Menu_system;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Menu {

    public static void subtract(Scanner obj) {
        while (true)
        {
            try {
                System.out.println("\nEnter first number:");
                String first = obj.nextLine().trim();
                if (first.isEmpty())
                {
                   System.out.println("first number has an empty input, try again");
                    continue;
                }
                System.out.println("\nEnter second number:");
                String second = obj.nextLine().trim();
                if (second.isEmpty())
                {
                   System.out.println("second number has an empty input, try again");
                    continue; 
                }
                int result = Integer.parseInt(first) - Integer.parseInt(second);
                System.out.println("\nresult:\n" + result + "\n");
                break;
            } 
            catch (NoSuchElementException | NumberFormatException e) {
                if (e instanceof NoSuchElementException)
                {
                    System.out.println("Detected end of input exiting...");
                    System.exit(1);
                }
                System.out.println("Required numeric input, try again");
            }
        }
    }

    public static void add(Scanner obj) {
        while (true)
        {
            try {
                System.out.println("\nEnter first number:");
                String first = obj.nextLine().trim();
                if (first.isEmpty())
                {
                    System.out.println("first number has an empty input, try again");
                    continue;
                }
                System.out.println("\nEnter second number:");
                String second = obj.nextLine().trim();
                if (second.isEmpty())
                {
                    System.out.println("second number has an empty input, try again");
                    continue;
                }
                int result = (Integer.parseInt(first)) + (Integer.parseInt(second));
                System.out.println("Result:\n" + result + "\n");
                break;
            }
            catch (NoSuchElementException | NumberFormatException e) {
                if (e instanceof NoSuchElementException)
                {
                    System.out.println("Detected end of input exiting...");
                    System.exit(1);
                }
                System.out.println("Required numeric input, try again");
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner newobj = new Scanner(System.in))
        {
            while (true)
            {
                try {
                    System.out.println("1. Add\n2. Subtract\n3. Exit\n");
                    System.out.print("Choice: ");
                    String input = newobj.nextLine().trim();
                    if (input.isEmpty())
                    {
                        System.out.println("input is empty, try again");
                        continue;
                    }
                    int choice = Integer.parseInt(input);
                    switch (choice) {
                        case 1:
                            add(newobj);
                            break;
                        case 2:
                            subtract(newobj);
                            break;
                        case 3:
                            System.exit(1);
                        default:
                            System.out.println("invalid choice, try again");
                    }
                } 
                catch (NoSuchElementException | NumberFormatException e) {
                    if (e instanceof NoSuchElementException)
                    {
                        System.out.println("Detected end of input exiting...");
                        System.exit(1);
                    }
                    System.out.println("required number as input, try again");
                }
            }
        }

    }
}
