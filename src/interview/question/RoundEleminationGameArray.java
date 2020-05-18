package interview.question;

import java.util.Arrays;

public class RoundEleminationGameArray {
	
	public int solution(int n, int k) {
		boolean arr[] =new boolean[n];
		for(int i = 0; i<n; i++) {
			arr[i] = true;
		}
		
		for(int j= 0; j<n-1; j++) {
			int pos = 0;
			int kPos = 0;
			while(true) {
				if(kPos==k-1) {
					arr[pos]= false;
					break;
				}
				if(arr[pos]) {
					pos=pos+1;
					kPos=kPos+1;
				}
				else if (!arr[pos]){
					pos=pos+1;
				}
				if(pos==n) {
					pos=0;
				}
				
			}
		}
		
		for(int i= 0; i<n-1; i++) {
			if(arr[i]==true) {
				return i+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		RoundEleminationGameArray obj = new RoundEleminationGameArray();
		System.out.println(obj.solution(4, 6));

	}

}
