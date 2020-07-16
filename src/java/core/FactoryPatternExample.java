package java.core;

interface Interface12 {
	// returns the first/last digit of string
	int func1(String s); 
}

class intermediateClass12 implements Interface12{
	//return the last digit if a string
	@Override
	public int func1(String s) {
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				return Integer.parseInt(""+s.charAt(i));
			}
		}
		return -1;
	}
}
class intermediateClass22 implements Interface12{
	//returns first digit of string
	@Override
	public int func1(String s) {
		for(int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				return Integer.parseInt(""+s.charAt(i));
			}
		}
		return -1;
	}
}
class SupplierClass12{
	public static Interface12 getObject(String s) {
		if(s=="length") {
			return new intermediateClass12();
		}
		else if(s=="digit") {
			return new intermediateClass22();
		}else return null;
	}
}
public class FactoryPatternExample {

	public static void main(String[] args) {
		
		Interface12 interfaceTypeClassObject = SupplierClass12.getObject("digit");
		System.out.println(interfaceTypeClassObject.func1("12abc6th"));
	}
}
