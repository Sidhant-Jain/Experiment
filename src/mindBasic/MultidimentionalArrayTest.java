package mindBasic;

public class MultidimentionalArrayTest {

	public static void main(String[] args) {
		int a[][]= {{2,3,4},{4,5,6,7}, {8,9}};
		System.out.println(a[0].length);
		System.out.println(a.length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		for(int i=0; i<a.length;i++){
			for(int j=0; j<a[i].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
			
		}
		
		int arr[][][]={{{2,3,4},{4,5,6,7}},{{8,9}}};
		System.out.println(arr[0].length);
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i].length);
			for(int j=0; j<arr[i].length;j++){
				System.out.println("i length : " + arr[i].length);
				for(int k=0; k<arr[j].length;k++){
					System.out.println("j length : " + arr[j].length);
					System.out.print(arr[i][j][k]);
				}
			}
			System.out.println();
			
		}
	}

}
