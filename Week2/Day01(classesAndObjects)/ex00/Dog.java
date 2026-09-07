import java.util.Scanner;

public class Dog {
	private String _name;
	private int _age;

	public Dog() {
		_name = "Unknown";
		_age = 1;
	}
	
	public Dog(String name, int age) {
		_name = name;
		_age = age;
	}

	public void changeName(String name) {
		_name = name;
	}

	public void changeAge(int age) {
		_age = age;
	}

	public void displayInfo() {
		System.out.println("Dog's name: " + _name + "\n" + "Dog's age: " + _age);
	}

	public static void main(String[] args) {
		Dog Kyle = new Dog("Kyle", 2);
		Dog d = new Dog();
		Kyle.displayInfo();
		d.displayInfo();

		System.out.println("Enter dog's name: ");
		Scanner newobj = new Scanner(System.in);
		String name = newobj.nextLine();
		d.changeName(name);
		try {
			System.out.println("Enter dog's age: ");
			int age = Integer.parseInt(newobj.nextLine());
			d.changeAge(age);
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid integer input");
		}
		d.displayInfo();
		newobj.close();
	}

}
