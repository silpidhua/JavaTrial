/*21.	Write a code to compare two string irrespective of order and case in sensitive:
String = “Abcdre”
String2 = bdcare”
Both are equal string
*/
package interview.question;

import java.util.HashMap;

public class CompareStringIrrespectiveOfOrderAndCase {

	public static boolean compareString(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		if(str1.length()==str2.length()) {
			for(int i =0; i<str1.length(); i++){
				if(hm.get(str1.charAt(i))== null) {
					hm.put(str1.charAt(i), 1);
				}else {
					hm.put(str1.charAt(i), hm.get(str1.charAt(i))+1);
				}
			}
		}
		for(int i =0; i<str2.length();i++) {
			if(!hm.containsKey(str2.charAt(i))) {
				return false;
			}else {
				if(hm.get(str2.charAt(i))==1) {
					hm.remove(str2.charAt(i));
				}else {
					hm.put(str2.charAt(i), hm.get(str2.charAt(i))-1);
				}
			}
		}
		System.out.println("hashMap:"+hm);
		if (hm.size()==0) {
			return true;
		}
		System.out.println(hm);
		return false;
	}
	public static void main(String[] args) {
		System.out.println(compareString("Abcdre", "bdcare"));
        } 
	}


