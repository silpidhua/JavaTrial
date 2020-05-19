/*9.Find whether a sentence is a pangram sentence, is a sentence that contains every letter of the alphabet at least once. - 
If it is not a pangram then need to print the letters that are missing in it.*/

package interview.question;

import java.util.ArrayList;
import java.util.Arrays;

public class PangramChecking {
	public boolean checkPangram(String s) {
		boolean[] mark = new boolean[26];
		boolean flag = true;
		int count =0;
		int index = 0;
		for(int i =0; i<s.length(); i++) {
			if('A'<=s.charAt(i) && s.charAt(i)<='Z') {
				index = s.charAt(i)-'A';
				count++;
			}
			else if( s.charAt(i) >= 'a' &&  s.charAt(i) <= 'z') {
	            index = s.charAt(i) - 'a'; 
	            count++;
			}			
			mark[index]= true;
			
			}
			for(int i=0; i<26; i++) {
				if(mark[i]==false) {
					flag = false;
						System.out.print((char) (65+i));
					}
			}
			if(flag == false) {
				return false;
			}else return true;
	}
	public static void main(String[] args) {
		PangramChecking obj = new PangramChecking();
		System.out.println(obj.checkPangram("A quick"));
		
	}

}
