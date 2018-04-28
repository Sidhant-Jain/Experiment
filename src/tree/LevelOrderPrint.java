package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderPrint {

	class Tree{
		int key;
		Tree left, right;
		
		Tree(int item){
			key=item;
			left=right=null;
		}
	}
	
	static Tree root;
	
	LevelOrderPrint(){
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
		LevelOrderPrint lop= new LevelOrderPrint();
		
		Queue<Tree> queue=new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for(int i=0; i<size;i++){
			al.add(sc.nextInt());
		}
		

		for(int i=0; i<al.size(); i++){
			lop.bstConstruct(al.get(i));
		}
		
//		lop.printTree();
		queue.add(root);
		
		while(queue.size()!=0){
			Tree temp =queue.poll();
			System.out.println(temp.key);
			if(temp.left!=null){
				queue.add(temp.left);
			}
			if(temp.right!=null){
				queue.add(temp.right);
			}
		}
	}
}
