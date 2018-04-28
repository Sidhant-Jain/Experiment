package tree;

import java.util.ArrayList;
import java.util.Scanner;

public class BSTConstruction {

	class Tree{
		int key;
		Tree left, right;
		
		Tree(int item){
			key=item;
			left=right=null;
		}
	}
	
	Tree root;
	
	BSTConstruction(){
		root = null;
	}
	
	public void bstConstruct(int value){
		root=bstConstructRec(root, value);
	}
	
	public Tree bstConstructRec(Tree root, int value){
		if(root==null){
			root=new Tree(value);
			return root;
		}
		
		if(value<root.key){
		 root.left=bstConstructRec(root.left,value);
		}
		
		if(value>root.key){
		 root.right=bstConstructRec(root.right, value);
		}
		return root;
	}
	
	public void printTree(){
		printTreeRec(root);
	}
	
	public void printTreeRec(Tree root){
		if(root!=null){
			System.out.println(root.key);
			printTreeRec(root.left);
			printTreeRec(root.right);
		}
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for(int i=0; i<size;i++){
			al.add(sc.nextInt());
		}
		
		BSTConstruction bstc= new BSTConstruction();
		for(int i=0; i<al.size(); i++){
			bstc.bstConstruct(al.get(i));
		}
		
		bstc.printTree();
	}

}
