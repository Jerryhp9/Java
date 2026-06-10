package Day03.ex11;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class palindrome {

    public static void panlindrome_checker(String input) {
        int i = 0;
        int j = input.length() - 1;

        System.out.println("\nOutput:");
        while (i < input.length() && j > 0)
        {
            if (input.charAt(i) == input.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                System.out.println("Not a palindrome\n");
                return;
            }
        }
        System.out.println("Palindrome\n");
    }
    public static void main(String[] args) {
        try (Scanner newobj = new Scanner(System.in)) {
            while (true)
            {
                try {
                    System.out.println("Input:");
                    String input = newobj.nextLine().trim();
                    if (input.isEmpty())
                    {
                        System.out.println("Empty input, try again");
                        continue;
                    }
                    if (input.equals("Exit"))
                        break;
                    panlindrome_checker(input);
                }
                catch (NoSuchElementException e) {
                    if (e instanceof NoSuchElementException)
                    {
                        System.out.println("Detected end of input, exiting...");
                        return;
                    }
                }
            }
        }
    }
}
