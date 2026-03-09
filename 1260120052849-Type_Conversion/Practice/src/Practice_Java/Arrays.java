package Practice_Java;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		for(int i : arr) {
//			System.out.println("Element is "+ i);
//		}
//		
		// Using MultiDimensional Arrays(2D)
		int[][] arr = new int [2][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		//Printing the array elements
		for(int i = 0;i<2;i++) {
			for(int j = 0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
