package com.java.acct;

interface IGreet{
	public void greet(String s);
}
interface IMessage{
	public MethodReferenceEx getMessage(String s);
}
public class MethodReferenceEx {
	MethodReferenceEx(String s){
		System.out.println("Message: "+s);
	}
	public static void greetProgrammer(String s) {
		System.out.println("Hello World "+s);
	}
	public void greetHuman(String s) {
		System.out.println("hello "+s);
	}
	public static void main(String[] args) {
		
		// Reference to a static method.
		IGreet objStatic = MethodReferenceEx::greetProgrammer;
		objStatic.greet("Silpi");
		
		// Reference to an instance method.
		// IGreet objInstance = new MethodReferenceEx()::greetHuman;
		// objInstance.greet("Silpi");
		
		// Reference to a constructor 
		IMessage objConstructor = MethodReferenceEx::new;
		objConstructor.getMessage("this is a constructor reference");
	}

}
