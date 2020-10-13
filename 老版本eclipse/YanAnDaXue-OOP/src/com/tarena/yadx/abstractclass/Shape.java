package com.tarena.yadx.abstractclass;
/**
 * 根据周长算面积的抽象类
 * @author 123
 *
 */
public abstract class Shape {
	private double c;
	public Shape(double c){
		this.c=c;
	}
	public abstract double area();
}
