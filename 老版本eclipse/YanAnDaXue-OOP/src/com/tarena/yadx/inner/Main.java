package com.tarena.yadx.inner;

public class Main {
	public static void main (String[] args){
		Action action=new Action(){

			public void execute() {
				System.out.println("hello");
				
			}
			
		};
		action.execute();
	}

}
