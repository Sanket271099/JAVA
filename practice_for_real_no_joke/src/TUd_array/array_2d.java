package TUd_array;
import java.util.Scanner;
public class array_2d {
	public static int [][] array2d(int row,int col){
		Scanner s=new Scanner(System.in);
	int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}
	public static void printarrray2d(int arr[][]) {
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
     	int row=s.nextInt();
			int col=s.nextInt();
	int arr[][]=array2d(row, col);
printarrray2d(arr);
}
}
