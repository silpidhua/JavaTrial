package DynamicProgramming;

public class FriendsPairingProblem {
	
	public int countFriendsPairing(int n) {
		if(n<0) {
			return n;
		}
		else return countFriendsPairing(n-1)+ (n-1)*countFriendsPairing(n-2);
		
	}
	public static void main(String[] args) {
	FriendsPairingProblem obj = new FriendsPairingProblem();
	System.out.println(obj.countFriendsPairing(4));

	}

}
