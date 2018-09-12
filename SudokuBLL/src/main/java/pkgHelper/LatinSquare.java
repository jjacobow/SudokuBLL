package pkgHelper;

import java.util.Arrays;
public class LatinSquare {
	private int[][] myLatinSquare;	//2D integer array
	
	public LatinSquare(int[][] twoDimArray) {
		this.myLatinSquare=twoDimArray;
	}
	public int[][] getLatinSquare(){
		return myLatinSquare;
	}
	public void setLatinSquare(int[][] latinsquare) {
		this.myLatinSquare = latinsquare;
	}
	public boolean hasDuplicates(int[] arr) {
		int[] nArr = arr;
		for(int i = 0; i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(nArr[i]==nArr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean doesElementExist(int[] arr, int iValue) {
		for(int i:arr){
			if(i == iValue)
				return true;
		}
		return false;	
	}
	public boolean hasAllValues(int[] arr1, int[] arr2) {
		int[] nArr1 = new int[arr1.length];
		int[] nArr2 = new int[arr1.length];
		for(int i= 0;i<arr1.length;i++){
			nArr1[i]=arr1[i];
			nArr2[i]=arr2[i];
		}
		Arrays.sort(nArr1);
		Arrays.sort(nArr2);
		for (int i = 0; i < arr1.length; i++) {
			if (nArr1[i] == nArr2[i]) {
				continue;
			}
			return false;
		}
		return true;
	}
	public int[] getColumn(int iCol) {
		int col[] = new int [myLatinSquare.length];
		int x = 0;
		for(int[] i : myLatinSquare)
		{
			col[x]=i[iCol];
			x++;
		}
		return col;
	}
	
	public int[] getRow(int iRow) {
		return myLatinSquare[iRow];
	}
	public boolean isLatinSquare() {
		//checks for duplicates in row
		int[] row;
		for(int i = 0;i<myLatinSquare.length;i++) {
			row = getRow(i);
			if(hasDuplicates(row)) {
				return false;
			}
		}
		//checks for duplicates in column
		int[] col;
		for(int i =0; i<myLatinSquare.length;i++) {
			col = getColumn(i);
			if(hasDuplicates(col)) {
				return false;
			}
		}
		
		//checks to see if all values of first row is in each row
		int[] arr1 = myLatinSquare[0];
		for(int i = 1;i<myLatinSquare.length;i++) {
			System.out.println(Arrays.toString(myLatinSquare[i]));
			if(!hasAllValues(arr1,myLatinSquare[i])){
				return false;
			}
		}
		//checks to see if all values of first col is in each col
		col = getColumn(0);
		int[] col2;
		for(int i = 1;i<arr1.length;i++) {
			col2= getColumn(i);
			if(!hasAllValues(col,col2)) {
				return false;
			}
		}
		return true;
	}
	public boolean ContainsZero() {
		for(int col=0; col< myLatinSquare.length;col++) {
			for(int row=0; row< myLatinSquare.length;row++) {
				if(myLatinSquare[col][row]==0)
					return true;
			}
		}
		return false;
	}
}

