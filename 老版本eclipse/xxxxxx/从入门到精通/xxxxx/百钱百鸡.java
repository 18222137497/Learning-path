package xxxxx;

public class 百钱百鸡 {
	public static void main(String[] args) {
		int cock, hen, chick;
		for (cock = 1; cock <= 20; cock++) {
			for (hen = 1; hen <= 33; hen++) {
				for (chick = 3; chick <= 99; chick += 3) {
					if (cock * 5 + hen * 3 + chick / 3 == 100 && cock + hen + chick == 100) {// 百钱
						System.out.println("公鸡" + cock + ",母鸡" + hen + ",小鸡" + chick);

					}
				}
			}
		}

	}
}
