package interview.question;

import java.util.HashMap;

public class LengthOfLongestTuple {
	
	public void findLength(String s) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		char start = s.charAt(0);
		int count = 1;
		int index = 0;
		for(int i = 1; i<s.length(); i++) {
			if(start == s.charAt(i)) {
				count++;
				start = s.charAt(i);
			}
			else if(start!= s.charAt(i)) {
				hm.put(""+start+index, count);
				start = s.charAt(i);
				count = 1;
				index= i;
			}
		}
		hm.put(""+start+index, count);
		System.out.println(hm);
		int length = 0;
		int pos = 0;
		for(String entry: hm.keySet()) {
			if(hm.get(entry)>length) {
				length = hm.get(entry);
				pos = Integer.parseInt(entry.substring(1));
			}
		}
		System.out.println("longest tuple: "+s.substring(pos, pos+length)+" index: "+pos+" Length: "+length);
	}

	public static void main(String[] args) {
		LengthOfLongestTuple obj = new LengthOfLongestTuple();
		obj.findLength("aaabbccddaaaaaa");
	}

}
