package interview.question;

import java.util.Stack;

public class RepeatingReplacedByStar {
	
	public void replaceByStar(String s) {
		Stack<String> stack = new Stack<String>(); 
		for(int i = 0; i<=s.length(); i++) {
			stack.add(""+s.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ABABCABDABCD 
	}

}
