import java.util.Objects;
import java.util.Scanner;

public class atm_machine {
	public static double Withdraw(double Balance, double amount){
		if (Balance > 0)
		{
			if ((Balance - amount) > (Balance - 10))
				System.out.println("exceeded balance amount");
			else
				Balance = Balance - amount;
		}
		return (Balance);
	}

	public static double Deposit(double Balance, double depo) {
		Balance = Balance + depo;
		System.out.println(depo + " is added into Balance");
		return (Balance);
	}

	public static void Check(double Balance) {
		System.out.println("Balance: " + Balance);
	}

	public static double machine(String command, double Balance) {
		Scanner newobj = new Scanner(System.in);

		if (Objects.equals(command, "Check Balance"))
		{
			Check(Balance);
			return (Balance);
		}
		else if(Objects.equals(command, "Withdraw"))
		{
			while (true)
			{
				System.out.print("Withdraw amount: ");
				double amount = newobj.nextDouble();
				if (amount < 0)
					System.out.println("invalid amount, try again");
				else if (amount > 1500)
					System.out.println("Amount exceeded(1500 max), try again");
				else
				{
					Balance = Withdraw(Balance, amount);
					return (Balance);
				}
			}
		}
		else if	(Objects.equals(command, "Deposit"))
		{
			int flag = 0;
			double input = 0;
			while (flag == 0)
			{
				System.out.print("Deposit amount: ");
				input = newobj.nextDouble();
				if (input <= 0)
					System.out.println("invalid amount, try again");
				else if (input > 20000.00)
					System.out.println("Amount exceeded(20000 max), try again");
				else
					flag = 1;
			}
			Balance = Deposit(Balance, input);
			return (Balance);
		}
		newobj.close();
		return (1);
	}
}
