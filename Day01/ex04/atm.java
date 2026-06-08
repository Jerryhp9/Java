package Day01.ex04;

import java.util.Objects;
import java.util.Scanner;

public class atm {
	public static void main(String[]args)
	{
		Scanner newobj = new Scanner(System.in);
		double	Balance = 1000.00;
		while (true)
		{
			System.out.println("\n----------MYPiggyBank----------\n");
			System.out.println("Options:\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Cancel\n");
			System.out.print("Input: ");
			String prompt = newobj.nextLine();
			System.out.println();
			if (Objects.equals(prompt, "Check Balance") || Objects.equals(prompt, "Deposit")
			|| Objects.equals(prompt, "Withdraw"))
				Balance = atm_machine.machine(prompt, Balance);
			else if (Objects.equals(prompt, "Cancel"))
			{
				System.out.println("-- Thank you for choosing our service, have a nice day! --");
				break;
			}
			else
				System.out.println("Please type in the right input\n");
			System.out.println("\n-------------------------------");
		}
		newobj.close();
	}
}