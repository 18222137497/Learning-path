package com.tarena.yadx.interfaceimp;

public class RunnerImp implements Runner,Runner2{
	@Override
	public void showMe() {
		System.out.println("showMe");
	}
	@Override
	public void run() {
		System.out.println("run");
	}
	@Override
	public void run1() {
		System.out.println("run1");	
	}
	public static void main(String[] args){
		Runner r1=new RunnerImp();
		r1.run1();
		Runner2 r2=new RunnerImp();
		r2.showMe();
		RunnerImp r3=new RunnerImp();
		r3.showMe();
		r3.run();
	}
	@Override
	public void Runner() {
		// TODO Auto-generated method stub
		
	}
}
