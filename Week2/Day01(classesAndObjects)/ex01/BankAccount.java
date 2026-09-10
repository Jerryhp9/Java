import java.lang.Exception;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String m) {
		super(m);
	}
}

public class BankAccount {
	private int _balance;
	private String _owner;
	
	public BankAccount(int Balance, String name) {
		_balance = Balance;
		_owner = name;
	}

	public void displayAccount() {
		if (_balance > 0)
			System.out.println("Balance: " + _balance);
	}

	public static void balanceCheck(int Balance, int amount) throws InsufficientBalanceException {
		if (Balance - amount < 0)
			throw new InsufficientBalanceException("Insuffient balance amount to withdraw");
	}

	public void withdraw(int Balance) {
		if (Balance > 0)
		{
			try {
				balanceCheck(_balance, Balance);
				_balance -= Balance;
			}
			catch (InsufficientBalanceException e) {
				System.out.println("Withdraw failed, reason: " + e.getMessage());
			}
		}
	}

	public void deposit(int Balance) {
		if (Balance > 0)
		{
			_balance += Balance;
		}
	}

	public static void main(String args[]) {
		BankAccount Ac1 = new BankAccount(10, "Bob");
		BankAccount Ac2 = new BankAccount(50, "Ally");
		BankAccount Ac3 = new BankAccount(20, "Tim");

		Ac1.deposit(60);
		Ac1.displayAccount();

		Ac2.withdraw(60);
		Ac2.displayAccount();

		Ac3.deposit(100);
		Ac3.withdraw(50);
		Ac3.displayAccount();
	}
}