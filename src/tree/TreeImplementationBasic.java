package tree;

public class TreeImplementationBasic {

	class Node{
		int key;
		Node left, right;
		
		public Node(int item){
			key = item;
			left = right = null;
		}
	}

	Node root;
	
	TreeImplementationBasic(){
		root = null;
	}
	
	public void insert(int key){
		root = insertRec(root, key);
	}
	
	Node insertRec(Node root, int key){
		
		if(root == null){
			root = new Node(key);
			return root;
		}
		
		if(key < root.key){
			root.left = insertRec(root.left, key);
		}
		else if(key > root.key){
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	
	void readNodes(){
		readNodesRec(root);
	}
	
	void readNodesRec(Node root){
		if(root != null){
			System.out.println(root.key);
	//		readNodesRec(root.left);
			readNodesRec(root.right);
		}
	}
	
	public static void main(String[] args){
		TreeImplementationBasic tib= new TreeImplementationBasic();
		tib.insert(20);
		tib.insert(30);		
		tib.insert(10);		
		tib.insert(5);
		tib.insert(25);
		tib.insert(15);
		tib.insert(35);
		tib.readNodes();
	}
}
