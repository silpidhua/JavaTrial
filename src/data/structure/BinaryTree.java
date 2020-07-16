package data.structure;

class BTNode{
	String data;
	BTNode left, right;
	
	 BTNode( String data) {
		this.data = data;
		left = right = null;
	}
}
public class BinaryTree {
	 int level = 0;
	//print the binary tree
	void printNodeAtLevel(BTNode n, int tempLevel) {
		if(tempLevel == 0) {
			System.out.print(" "+n.data);
		}
		else {
			printNodeAtLevel(n.left, tempLevel-1);
			printNodeAtLevel(n.right, tempLevel-1);
		}
	}
	// get level of binary tree
	void getMaxLevel(BTNode n, int thisLevel) {
		if(n!= null) {
			if(thisLevel> level) {
				level = thisLevel;
			}
		}
		if(n.left!= null) {
			getMaxLevel(n.left, thisLevel+1);
		}if(n.right!= null) {
			getMaxLevel(n.right, thisLevel+1);
		}
		
	}
	public static void main(String[] args) {
		BinaryTree obj = new BinaryTree();
		// creating binary tree
		BTNode a = new BTNode("A");
		BTNode b = new BTNode("B");
		BTNode c = new BTNode("C");
		BTNode d = new BTNode("D");
		BTNode e = new BTNode("E");
		BTNode f = new BTNode("F");
		BTNode g = new BTNode("G");
		a.left = b; a.right = c; b.left = d;b.right = e;c.left = f;c.right = g;
		
		obj.getMaxLevel(a,0);
		System.out.println(obj.level);
		for(int  i = obj.level; i>=0; i--) {
			System.out.print("Level "+i);
			obj.printNodeAtLevel(a, i);
			System.out.println();
		}
		
	}

}
