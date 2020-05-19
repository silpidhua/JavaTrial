import java.util.Scanner;

interface Interface1 {
	// returns the first digit of string
	int func1(String s); 
	// returns the first digit of string
	int func2(String s); 
}
class IntermediateClass1 implements Interface1{
	// returns the last digit of string
	public int func1(String s) {
		return Integer.parseInt(""+s.charAt(0));
	}
	// // returns the first digit of string
	public int func2(String s) {
		return Integer.parseInt(""+s.charAt(s.length()-1));
	}
}

class IntermediateClass2 implements Interface1{
	// returns the last digit of string
	public int func2(String s) {
		for (int i = s.length()-1; i>=0; i--) {
			if ((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57) {
				return Integer.parseInt(""+s.charAt(i));
			}
		}
		return -1;
	}
	// // returns the first digit of string
	public int func1(String s) {
		for (int i = 0; i<s.length(); i++) {
			if ((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57) {
				return Integer.parseInt(""+s.charAt(i));
			}
		}
		return -1;
	}
}



class SupplierClass{
	public static Interface1 getMeAnObject(String s) {
		if (s.equals("1")) {
			return new IntermediateClass1();
		} 
		else if (s.equals("2")) {
			return new IntermediateClass2();
		}
		return null;
	}
}

public class ParentChildTypingAndFactoryPattern1{
	public static void main(String s[]) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.println("Enter 1 for simple mode or 2 for complex mode.");
		String str= sc.nextLine(); //reads string.
		Interface1 interfaceTypeButClassObject = SupplierClass.getMeAnObject(str);
		System.out.println("Enter a string as per thr mode you selected");
		String str2= sc.nextLine(); //reads string.
		System.out.println("First digit is "+ interfaceTypeButClassObject.func1(str2));
		System.out.println("Last digit is "+ interfaceTypeButClassObject.func2(str2));
	}
}