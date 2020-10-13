package T4;

/**
 * 肉战士
 * 
 * @author 123
 *
 */
public class BloodWarrior {
	private int experience;// 经验值
	private int blood;// 血量

	public BloodWarrior(int experience, int blood) {
		this.experience = experience;
		this.blood = blood;
	}

	public void win() {
		experience += 1;
		System.out.println("战斗胜利!经验增加1");
	}

	public int injure(int x) {
		blood -= x;
		System.out.println("战斗失败!损失" + x + "点生命值");
		if (blood < Fightable.MAX / 2) {
			System.out.println("血线过低!危险!");
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
