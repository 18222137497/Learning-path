package com.tedu.shootgame;
/**
 * 奖励接口：
 *  双倍火力
 *  生命值
 * @author 123
 *
 */
public interface Award {
	/*
	 * 定义奖励属性
	 * 定义活力值和生命值
	 * 利用随机产生的数字0或1完成奖励发放
	 *  0 双倍火力值
	 *  1 生命值
	 */
	public int DOUBLE_FIRE=0;//火力
	public int LIFE=1;//生命值
	/*提供获取奖励的方法*/
	public int getAwardType();
}
