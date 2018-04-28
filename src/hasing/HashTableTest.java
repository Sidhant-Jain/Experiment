//Implement hash table

package hasing;

import java.util.Scanner;

// function insert, clear, contain, delete, genrate next prime number, given prime number

public class HashTableTest {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		
		HashTable ht = new HashTable(sc.nextInt());
		
		char ch;
		
		// perform operation
		
		do{
			System.out.println("\nHashTable Operation");
			System.out.println("1. insert");
			System.out.println("2. delete");
			System.out.println("3. clear");
			System.out.println("4. contains");
			
			int choice = sc.nextInt();
			switch(choice){
			case 1:
                System.out.println("Enter integer element to insert");
                ht.insert( sc.nextInt() ); 
				break;
				
			case 2:
				System.out.println("Enter integer element to delete");
                ht.delete( sc.nextInt() ); 
				break;
				
			case 3: 
				System.out.println("Enter integer element to check if present");
                System.out.println("Contains : "+ ht.contain(sc.nextInt() ));
				break;
				
			case 4: 
				ht.clear();
				System.out.println("Hash Table clear");
				break;
			
			default :
				System.out.println("wrong Entry");
				break;
			}
			
			ht.printTable();
			
			System.out.println("\n do you want to continue then enter y else n");
			ch = sc.next().charAt(0);
		}while( ch == 'y');
		
	}
}

class HashTable{
	
	int arr[];
	int capacity;
	//for constructor
	public HashTable(int capacity){
		this.capacity = nextPrime(capacity);
		arr = new int[this.capacity];
	}
	
	
	//for insert
	public void insert(int ele){
		arr[ele % capacity] = ele;
	}
	
	// for clear
	public void clear(){
		arr = new int[capacity];
	}
	
	// for contain	
	public boolean contain(int ele){
		return arr[ele % capacity] == ele;
		
	}
	
	// for delete
	public void delete(int ele){
		if(arr[ele % capacity] == ele){
			arr[ele % capacity] = 0;
		}
		else
		System.out.println("error");
	}
	
	
	//genrate the next number for prime
	public int nextPrime(int n){
		if(n%2 == 0){
			n++;
		}
		
		for(; !isPrime(n); n += 2);
		return n;
	}
	
	// checking prime number
	public boolean isPrime(int n){
		if(n==2 || n==3 ){
			return true;
		}
		for(int i=2; i<=n; i++){
			if(i==n){
				return true;
			}
			if (n%i == 0){
				return false;
			}
		}
		
		return false;
	}
	
	public void printTable(){
		System.out.println("Hash Table =");
		for(int i = 0; i < capacity; i++){
			System.out.println(arr[i] + " ");
			System.out.println();
		}
	}
	
}
