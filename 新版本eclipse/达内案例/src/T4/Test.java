package T4;

public class Test {
	public static void main(String[] args) {
		Warrior warrior = new Warrior(0, 100);
		BloodWarrior bloodWarrior = new BloodWarrior(0, 120);
		warrior.win();
		System.out.println("---------------");
		warrior.injure(98);
		System.out.println("---------------");
		bloodWarrior.win();
		System.out.println("---------------");
		bloodWarrior.injure(30);
	}
}
