package interview.question;

public class LongestPalindrome {
	public int palindromeRecurrsion(String s) {
		boolean flag = true;
		if(s.length() ==1) {
			return 1;
		}
		for(int i = 0,j=s.length()-1; i<s.length() && j>=0; i++,j--) {
				if((s.charAt(i))!=(s.charAt(j))) {
					flag = false;
					break;
			}
		}
		if(flag)
			return s.length();
		else {
			int left = palindromeRecurrsion(s.substring(0, s.length()-1));
			int right = palindromeRecurrsion(s.substring(1, s.length()));
			if(left>right) {
				return left;
			}else return right;
		}
	}
	
	public boolean palindrome(String s) {
		boolean flag = true;
		if(s.length() ==1) {
			return true;
		}
		for(int i = 0,j=s.length()-1; i<s.length() && j>=0; i++,j--) {
				if((s.charAt(i))!=(s.charAt(j))) {
					flag = false;
					break;
			}
		}
			return flag;
	}
	public String palindromeDynamic(String s) {
		int sPos=-1,ePos=-1,max=-1;
		if(palindrome(s)) {
			return s;
		}
		for(int i = 0; i<s.length()-1; i++) {
			for(int j = i+1; j<s.length(); j++) {
				if(palindrome(s.substring(i, j))) {
					if(j-i>max) {
						max = j-i;
						sPos=i;
						ePos=j;
					}
				}
			}
		}
		return s.substring(sPos,ePos);
	
	}
	public static void main(String[] args) {
		LongestPalindrome obj = new LongestPalindrome();
		//System.out.println(obj.palindromeRecurrsion("ABCDCBAKMALYALAM123454321MALAYLAMJABAA"));
		System.out.println(obj.palindromeDynamic("ABCDCBA"));

	}

}
