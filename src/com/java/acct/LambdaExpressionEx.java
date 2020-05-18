package com.java.acct;

interface FuncInterface{
	public void say(String x);
}

interface FuncInterface1{
	public void draw(int x);
}
public class LambdaExpressionEx implements FuncInterface{
	public void say(String x) {
		System.out.println("Hello:"+x);
	}
	public static void main(String[] args) {
		//FuncInterface funcObj = (String x)->System.out.println("Hello "+x);
		//funcObj.say("Silpi");
		
		LambdaExpressionEx obj = new LambdaExpressionEx();
		obj.say("Silpi");
		
		//lambda expression
		FuncInterface1 obj1 = (int x)-> System.out.println("rea:"+x*x);
		obj1.draw(5);
	}

}
