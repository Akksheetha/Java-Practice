package Practice_Java;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] book_no = new int[3][];
		book_no[0] = new int[]{1,2,3};
		book_no[1] = new int[] {4,6};
		book_no[2] = new int[] {3,5,7,9};
		for(int i = 0;i<book_no.length;i++) {
			for(int j = 0;j<book_no[i].length;j++) {
				System.out.print(book_no[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
