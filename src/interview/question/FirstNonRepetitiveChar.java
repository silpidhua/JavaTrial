package interview.question;

import java.util.HashMap;

public class FirstNonRepetitiveChar {
	public char findNonRepetitiveChar(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i<s.length(); i++) {
			if(hm.get(s.charAt(i))== null) {
				hm.put(s.charAt(i), 1);
			}
			else hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
		}
		for(int i = 0; i<s.length(); i++){
			if(hm.get(s.charAt(i))==1) {
				return s.charAt(i);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		FirstNonRepetitiveChar obj = new FirstNonRepetitiveChar();
		System.out.println(obj.findNonRepetitiveChar("aasghsgji"));
		  

	}

}
