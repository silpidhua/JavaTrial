package interview.question;

public class PowerOfTen {
	public boolean findPowerOfTen(int i) {
		double intermediateResult = Math.pow(i, 0.1);
		if(((int)intermediateResult)== intermediateResult) {
			return true;
		}
		else return false;
	}

	public static void main(String[] args) {
		PowerOfTen obj = new PowerOfTen();
		System.out.println(obj.findPowerOfTen(-1024));

	}

}