package xxxxx;

public class ��Ǯ�ټ� {
	public static void main(String[] args) {
		int cock, hen, chick;
		for (cock = 1; cock <= 20; cock++) {
			for (hen = 1; hen <= 33; hen++) {
				for (chick = 3; chick <= 99; chick += 3) {
					if (cock * 5 + hen * 3 + chick / 3 == 100 && cock + hen + chick == 100) {// ��Ǯ
						System.out.println("����" + cock + ",ĸ��" + hen + ",С��" + chick);

					}
				}
			}
		}

	}
}
