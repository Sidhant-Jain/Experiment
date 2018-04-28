package arrayProblem;

import java.util.Arrays;
import java.util.HashSet;

public class CommonValue {

	public static void main(String[] args) {
//		Integer arr1[] = {1,2,3,15,8,6};
//		Integer arr2[] = {6,15,18,5};
////		for(int i=0; i<arr2.length; i++){
////			for(int j=0; j<arr1.length; j++){
////				if(arr2[i]==arr1[j]){
////					System.out.println(arr2[i]);
////					break;
////				}
////			}
////		}
//		HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(arr1));
//		HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(arr2));
//		hs1.retainAll(hs2);
//		System.out.println(hs1);
		
		int arr1[] = {1,2,5,15,8,6};
		int arr2[] = {6,15,8,4,3,4,7,9};
		//System.out.println("a " + arr1.length );
		
		HashSet<Integer> hs1 = new HashSet<>();
		for(int i=0; i<arr1.length; i++){
	//		System.out.println(hs1.add(arr1[i]));
		}
		for(int j=0; j<arr2.length; j++){
			if(!(hs1.contains(arr2[j]))){
				System.out.println(arr2[j]);
				System.out.println(arr1[j]);
			}
			else{
	//			System.out.println(arr2[j]);
			}
		}
		
	}
}
