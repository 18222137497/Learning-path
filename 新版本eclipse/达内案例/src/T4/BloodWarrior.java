package T4;

/**
 * ��սʿ
 * 
 * @author 123
 *
 */
public class BloodWarrior {
	private int experience;// ����ֵ
	private int blood;// Ѫ��

	public BloodWarrior(int experience, int blood) {
		this.experience = experience;
		this.blood = blood;
	}

	public void win() {
		experience += 1;
		System.out.println("ս��ʤ��!��������1");
	}

	public int injure(int x) {
		blood -= x;
		System.out.println("ս��ʧ��!��ʧ" + x + "������ֵ");
		if (blood < Fightable.MAX / 2) {
			System.out.println("Ѫ�߹���!Σ��!");
		}
		return x;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

}
