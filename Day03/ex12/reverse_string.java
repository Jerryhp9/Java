package Day03.ex12;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class reverse_string {
    public static void string_reversing(String input) {
        int start = 0;
        int checkpoint = 0;
        int i = 0;
        StringBuilder reversed = new StringBuilder();
        while (i < input.length())
        {
            while (!Character.isWhitespace(input.charAt(i)) && i != input.length() - 1)
                i++;
            checkpoint = i;
            while (i >= start)
            {
                if (!Character.isWhitespace(input.charAt(i)))
                    reversed.append(input.charAt(i));
                i--;
            }
            if (Character.isWhitespace(input.charAt(checkpoint)))
                reversed.append(' ');
            checkpoint++;
            i = checkpoint;
            start = checkpoint;
        }
        System.out.println(reversed + "$\n");
    }
    public static void main(String[] args) {
        try (Scanner newobj = new Scanner(System.in)) {
            try {
                    while (true)
                    {
                        System.out.println("Input:");
                        String input = newobj.nextLine().trim();
                        if (input.isEmpty())
                        {
                            System.out.println("Empty input, try again");
                            continue;
                        }
                        if  (input.equals("Exit"))
                            break;
                        string_reversing(input);
                    }
            }
            catch (NoSuchElementException e) {
                if (e instanceof NoSuchElementException)
                {
                    System.out.println("Detected end of input, exiting...");
                }
            }
        }
    }   
}
