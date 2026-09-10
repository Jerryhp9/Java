
class Character {
	private String _name;
	private int _health;
	private int _attackPower;


	public Character(String name, int health, int attackPower) {
		_name = name;
		_health = health;
		_attackPower = attackPower;
	}

	public int getAttackPower() {
		return (_attackPower);
	}

	public void attack(String name) {
		System.out.println(_name + " is going to attack " + name + "\n");
	}

	public void takeDamage(int damage) {
		System.out.println(_name + " has taken " + damage + " points of damage" + "\n");
		if (damage < _health)
			this._health -= damage;
		else
		{
			this._health = 0;
			System.out.println(_name + " had taken significant damage and died" + "\n");
		}
	}

	public void displayStatus() {
		System.out.println(_name + " has " + _health + " points of health and " + _attackPower + " points of attack power" + "\n");
	}
}

public class main {
	public static void main(String args[]) {
			Character knight = new Character("Knight", 100, 20);
			Character org = new Character("Org", 500, 30);
			Character wizard =  new Character("Wizard", 80, 100);
			Character pawn = knight;

			pawn.displayStatus();
			org.attack("Knight");
			knight.takeDamage(org.getAttackPower());
			knight.displayStatus();
			wizard.attack("Org");
			org.takeDamage(wizard.getAttackPower());
			org.displayStatus();
			wizard.attack("Knight");
			knight.takeDamage(wizard.getAttackPower());
			knight.displayStatus();
			org.attack("Wizard");
			wizard.takeDamage(org.getAttackPower());
			wizard.displayStatus();
	}
}
