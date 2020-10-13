package AirplaneWar;

public interface Award {
	/*定义奖励属性    接口
	 * 利用随机产生的数字0或1完成奖励发放
	 * 0火力加强
	 * 1生命增加
	 */
	public int DOUBLE_FIRE=0;//火力
	public int LIFE=1;//生命值
	/*提供获取奖励的方法*/
	public int getAwardType();

}
