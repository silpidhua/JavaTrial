package interview.question;

public class StaticAndInstanceVariable {
	
	static String statStr = "I am static";
	public String instanceStr = "I am instance";
	 
	public static void statMethod(StaticAndInstanceVariable obj) {
		System.out.println("I am static Method");
		obj.instanceStr = "I am not unstance";
	} 
	
	public void instanceMnethod() {
		System.out.println("I am instance method");
		statStr = "I am not static";
	}
	
	public static void main(String[] args) {
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
		
		StaticAndInstanceVariable obj = new StaticAndInstanceVariable();
		obj.instanceStr = "hello world";
		
		StaticAndInstanceVariable obj1 = obj;
		System.out.println(obj1.instanceStr);
		obj1.instanceStr = "goodmorning";
		System.out.println(obj.instanceStr);
		
		
	}

}
