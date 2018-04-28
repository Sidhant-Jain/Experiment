package tree;

public class BinarySearchTreeInsert {

	class Node{
		int key;
		Node left, right;
		
		public Node(int item){
			key=item;
			left=right=null;
		}
	}
	
	Node root;
	
	BinarySearchTreeInsert(){
		root=null;
	}
	
	public void insert(int key){
		root=insertRec(root, key);
	}
	
	Node insertRec(Node root, int key){
		
		if(root == null){
			root=new Node(key);
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
	
	void inorder(){
		inorderRec(root);
	}
	
	void inorderRec(Node root){
		if(root!=null){
			System.out.println(root.key);
			inorderRec(root.left);

			inorderRec(root.right);
			
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTreeInsert bstI= new BinarySearchTreeInsert();
		bstI.insert(36);
		bstI.insert(50);
		bstI.insert(90);
		bstI.insert(40);
		bstI.insert(100);
		bstI.insert(120);
		bstI.insert(20);
		bstI.insert(30);
		bstI.insert(10);
		bstI.insert(5);
		bstI.insert(15);
		
		
		// print the tree
		
		bstI.inorder();
		
	}

}
