package interview.question;

class LengthEncoder{
	String lenEncode(String s) {
		StringBuilder sb = new StringBuilder();
		char item = s.charAt(0);
		int count = 1;
		for(int i=1; i<s.length(); i++) {
			if(item == s.charAt(i)) {
				count++;
			}
			else if (item != s.charAt(i)){
				sb.append(item).append(count);
				count=1;
				item = s.charAt(i);
			}
		}
		sb.append(item).append(count);
		return sb.toString();
		
	}
}

public class LengthEncodedString {

	public static void main(String[] args) {
		LengthEncoder obj = new LengthEncoder();
		System.out.println(obj.lenEncode("wwwjjkkkwert"));
		
	}

}
