/*a)Can a static method access instance variable
b) Can a method access static variable. How are static variables stored?*/
package interview.question;

public class StaticAndInstanceVariable {
	
	static String statStr = "I am static";
	public String instanceStr = "I am instance";
	 //static method accessing instance variables and Method
	public static void staticMethod(StaticAndInstanceVariable obj) {
		System.out.println("I am static Method");
		obj.instanceStr = "I am not instance";
		obj.instanceMnthod();
	} 
	public static void staticMethod() {
		System.out.println("I am static method");
	}
	
	public void instanceMnthod() {
		System.out.println("I am instance method");
		statStr = "I am not static";
	}
	
	public static void main(String[] args) {
		StaticAndInstanceVariable obj = new StaticAndInstanceVariable();
		//accessing instance variable using object of class StaticAndInstanceVariable
		System.out.println(obj.instanceStr);
		
		//accessing static variable using object of class
		System.out.println(obj.statStr);
		//accessing static variable using object of class
		obj.staticMethod();
		
		
		/*StaticAndInstanceVariable obj1 = obj;
		System.out.println(obj1.instanceStr);
		obj1.instanceStr = "goodmorning";
		System.out.println(obj.instanceStr);*/
		
		
		String a = "I am a";
		String b = a+" hello";
		 //b = "I am b";
		System.out.println(a);
		System.out.println(b);
		
		StringBuilder sa = new StringBuilder("I am a");
		StringBuilder sb = sa.append("Hello");
		 //b = "I am b";
		System.out.println(sa);
		System.out.println(sb);
		
		
	}

}
