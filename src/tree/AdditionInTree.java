package tree;

public class AdditionInTree {

	class Node{
		int key;
		Node left,right;
		
		public Node(int item){
			key=item;
			left=right=null;
		}
	}
	
	Node root;
	
	public AdditionInTree(){
		root=null;
	}
	
	public void insert(int key){
		root=insertRec(root, key);
	}
	
	Node insertRec(Node root, int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
		
		if(key<root.key){
			root.left=insertRec(root.left, key);
		}
		else if(key>root.key){
			root.right=insertRec(root.right, key);
		}
		return root;
	}
	
	boolean isLeaf(Node node){
		if(node==null){
			return false;
		}
		if(node.left==null && node.right==null){
			return true;
		}
		return false;
	}
	
	public void findNode(){
		int value=0;
		findNodeRec(root);
	}
	
	public void findNodeRec(Node root){
		if(root!=null){
			int res=0;
			
			System.out.println(root.key);
			findNodeRec(root.right);
			
		}
	}
	
	public static void main(String[] args) {
		AdditionInTree at= new AdditionInTree();
		at.insert(10);
		at.insert(5);
		at.insert(15);
		at.insert(2);
		at.insert(6);
		
		at.findNode();
	}
}
