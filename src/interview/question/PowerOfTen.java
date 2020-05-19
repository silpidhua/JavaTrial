/*5.Write a program to find if a number is power of ten.*/
package interview.question;

public class PowerOfTen {
	public boolean findPowerOfTen(int i) {
		double intermediateResult = Math.pow(i, 0.1);
		if(((int)intermediateResult)== intermediateResult) {
			return true;
		}
		else return false;
	}
	public boolean findPowerOfTenEstimationTechnique(double n) {
		int counter =0;
		if(n>1) {
			double remainder=0, result=n;
			while(true) {
				if(remainder != 0 && result>=1) {
					return false;
				}
				if(remainder == 0 && result ==1) {
					System.out.println(counter);
					return true;
				}
				remainder = result%10;
				result = result/10;
				counter++;
			}
			
		}
		else if(n==1) {
			return true;
		}
		else {
			double integral=0, fraction=n;
			while(true) {
				System.out.println("integral"+integral);
				System.out.println("fraction"+fraction);
				if(integral ==1 && fraction ==1) {
					System.out.println(counter);
					return true;
				}if(integral >1) {
					return false;
				}
				fraction = fraction*10;
				integral = Math.floor(fraction);
				counter--;
			}
		}
		
	}

	public static void main(String[] args) {
		PowerOfTen obj = new PowerOfTen();
		//System.out.println(obj.findPowerOfTenEstimationTechnique(1024));
		System.out.println(obj.findPowerOfTenEstimationTechnique(100));

	}

}