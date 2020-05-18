package interview.question;

import java.util.Arrays;

public class PositionOfRobot {
	public int[] findMovement(String s){
		int xaxis = 0;
		int yaxis = 0;
		int[] arr = new int[2];
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)== 'U') {
				xaxis++;
			}
			else if(s.charAt(i)=='D') {
				xaxis--;
			}
			else if(s.charAt(i)=='R') {
				yaxis++;
			}
			else if(s.charAt(i)=='L') {
				yaxis--;
			}
		}
		arr[0] = xaxis;
		arr[1] = yaxis;
		return arr;
		
	}

	public static void main(String[] args) {
		PositionOfRobot obj = new PositionOfRobot();
		
		System.out.println(Arrays.toString((obj.findMovement("UULDDRR"))));

	}

}
