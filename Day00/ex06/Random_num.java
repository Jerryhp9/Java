package Day00.ex06;

import java.util.Random;
import java.util.Scanner;

public class Random_num {

    public static int generator(int randy){
        Random  rand = new Random();
        while (true)
        {
            randy = rand.nextInt();
            if (randy >= 1 && randy <= 100)
                break;
        }
        return (randy);
    }
    public static void main(String[]args)
    {
        Scanner newobj = new Scanner(System.in);
        int randy = 0;
        randy = generator(randy);
        System.out.println("Welcome to the Number Guessing Game!\n" + randy);
        while (true)
        {
            System.out.println("Guess the number between 1-100");
            System.out.print("Input Guess: ");
            int number = newobj.nextInt();
            if (number < 1 || number > 100)
                System.out.println("Oops, you've guessed out of range, try again\n");
            else if (randy == number)
            {
                System.out.println("Congratulations, you have won the guessing game, Cheers!\n");
                break;
            }
            else
                System.out.println("Oops, wrong answer\n");
        }
        newobj.close();
    }
}
