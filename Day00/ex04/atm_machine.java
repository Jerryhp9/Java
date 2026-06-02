import java.util.Objects;
import java.util.Scanner;

public class atm_machine {
	public static void Withdraw(double Balance, double amount){
		//add code to finish up the function
	}
	public static void Deposit(double Balance, double depo) {
		Balance = Balance + depo;
		System.out.println(depo + "is added into Balance");
	}
	public static void Check(double Balance) {
		System.out.println("Balance: " + Balance);
	}
	public static void machine(String command) {
		double	Balance = 1000.00;

		if (Objects.equals(command, "Check Balance"))
			Check(Balance);
		else if(Objects.equals(command, "Withdraw"))
			Withdraw();
		else if	(Objects.equals(command, "Deposit"))
		{
			System.out.print("Deposit amount: ");
			Scanner newobj = new Scanner(System.in);
			int flag = 0;
			double input = 0;
			while (flag == 0)
			{
				input = newobj.nextDouble();
				if (input <= 0)
					System.out.println("invalid amount, try again");
				else if (input > 20000.00)
					System.out.println("Amount exceeded, please refer to the counter for deposit assistance Thank you");
				else
					flag = 1;
			}
			Deposit(Balance, input);
		}
	}
}
