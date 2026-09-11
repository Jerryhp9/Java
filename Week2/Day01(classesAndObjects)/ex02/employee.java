public class employee {
	private static int employeeCount;

	public employee() {
		employeeCount++;
		System.out.println("Employee created");
		System.out.println("Total employees: " + employeeCount + "\n");
	}

	public static void main(String args[]) {
		employee one = new employee();
		employee two = new employee();
		employee three = new employee();
		employee four = new employee();
		employee five = new employee();
		employee six = new employee();
		employee seven = new employee();
		employee eight = new employee();
		employee nine = new employee();
		employee ten = new employee();
	}
}
