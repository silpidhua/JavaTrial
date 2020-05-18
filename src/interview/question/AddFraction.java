package interview.question;

import java.math.BigInteger;
import java.util.Arrays;

public class AddFraction {
	public int[] addFraction(int[] fraction1, int[] fraction2) {
		int [] result = new int[2];
		
		BigInteger n1 = new BigInteger(""+fraction1[0]);
		BigInteger d1 = new BigInteger(""+fraction1[1]);
		BigInteger n2 = new BigInteger(""+fraction2[0]);
		BigInteger d2 = new BigInteger(""+fraction2[1]);
		
		BigInteger gcd = d1.gcd(d2);
		BigInteger lcm = new BigInteger(""+(d1.intValue()*d2.intValue())/gcd.intValue());
		
		result[1] = lcm.intValue();
		result[0] = ((lcm.intValue()*fraction1[0])/fraction1[1])+ ((lcm.intValue()*fraction2[0])/fraction2[1]);
		
		BigInteger rgcd = new BigInteger (""+lcm.gcd(new BigInteger(""+result[0])));
		if(rgcd.intValue()>1) {
			result[0]  = result[0] /rgcd.intValue();
			result[1] = result[1] /rgcd.intValue();
		}
	
		return result;
	}

	public static void main(String[] args) {
		AddFraction obj = new AddFraction();
		System.out.println(Arrays.toString(obj.addFraction(new int[] {2,3}, new int[] {2,6})));

	}

}
