
import java.util.Objects;
import java.util.Scanner;

public class atm {
	public static void main(String[]args)
	{
		Scanner newobj = new Scanner(System.in);
		System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n");
		System.out.print("Choice: ");
		String prompt = newobj.nextLine();
		if (Objects.equals(prompt, "Check Balance") || Objects.equals(prompt, "Deposit")
		|| Objects.equals(prompt, "Withdraw"))
			
		newobj.close();
	}
}