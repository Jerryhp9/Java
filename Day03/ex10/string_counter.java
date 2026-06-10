package Day03.ex10;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class string_counter {

    public static void print_counter(int[] counter) {
        System.out.println("\nLetters: " + counter[0]);
        System.out.println("Digits: " + counter[1]);
        System.out.println("Spaces: " + counter[2]);
        System.out.println("Special Characters: " + counter[3]);
    }

    public static void char_counter(String input) {
        int[] counter = new int[4];

        System.out.println();
        for (int i = 0; i < input.length(); i++)
        {
            if (Character.isLetter(input.charAt(i)))
            {
                System.out.println("Character " + i + ": " + input.charAt(i) + " -> Letter");
                counter[0] = counter[0] + 1;
            }
            else if (Character.isDigit(input.charAt(i)))
            {
                System.out.println("Character " + i + ": " + input.charAt(i) + " -> Digit");
                counter[1] = counter[1] + 1;
            }
            else if (Character.isWhitespace(input.charAt(i)))
            {
                System.out.println("Character " + i + ": '" + input.charAt(i) + "' -> Space");
                counter[2] = counter[2] + 1;
            }
            else
            {
                System.out.println("Character " + i + ": " + input.charAt(i) + " -> Special Character");
                counter[3] = counter[3] + 1;
            }
        }
        print_counter(counter);
    }
    public static void main(String[] args) {
        System.out.println("Enter text: \n");
        try (Scanner newobj = new Scanner(System.in)){
            while (true)
            {
                try {
                        String input = newobj.nextLine();
                        if (input.isEmpty())
                        {
                            System.out.println("Empty Input, try again");
                            continue;
                        }
                        char_counter(input);
                        break;
                }
                catch (NoSuchElementException e){
                    if (e instanceof NoSuchElementException)
                    {
                        System.out.println("detected end of input, exiting...");
                        return;
                    }
                }
            }
        }
    }
}
