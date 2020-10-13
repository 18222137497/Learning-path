package com.tarena.yadx.abstractclass;
/**
 * 计算正方形面积
 * @author 123
 *
 */
public class Square {
	private double c;
	public Square(double c) {
		this.c=c;
	}
	public double area(){
		return c/4*c/4;
	}
}
