package T6;

public class Print implements interfaceA, interfaceB {

	public void printLowercaseLetter() {
		for (int i = 97; i < 123; i++) {
			char c = (char) i;
			System.out.print(c + "	");
		}
	}

	public void printCapitalLetter() {
		for (int i = 65; i < 91; i++) {
			char c = (char) i;
			System.out.print(c + "	");
		}

	}

}
