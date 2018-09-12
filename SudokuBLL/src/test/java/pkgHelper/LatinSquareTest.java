package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void ContainsZeroTest() {
		int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);
		
		int[][] myArray2 = {{1,0,3},{2,3,1},{3,1,2}};
		LatinSquare ls2 = new LatinSquare(myArray2);
		
		assertFalse(ls.ContainsZero());
		assertTrue(ls2.ContainsZero());
	}
	@Test
	public void DoesElementExistTest() {
		int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);
		
		int[] myIntArray = {1,2,3,4,5};
		int iValue = 4;
		assertTrue(ls.doesElementExist(myIntArray, iValue));
		assertFalse(ls.doesElementExist(myIntArray, 0));
	}
	
	@Test
	public void GetColumnTest() {
		int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);
		int[] expect = {3,1,2};
		assertArrayEquals(ls.getColumn(2),expect);
	}
	@Test
	public void GetLatinSquare() {
		int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
		int[][] myArray2 = {{1,2,4},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);
		assertArrayEquals(ls.getLatinSquare(),myArray);
		assertFalse(Arrays.equals(ls.getLatinSquare(), myArray2));
	}
	@Test
	public void GetRow() {
		int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);
		int[] expect = {1,2,3};
		assertArrayEquals(ls.getRow(0),expect);
	}
	@Test
	public void HasAllValuesTest() {
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,4,3};
		int[] arr3 = {1,4,3};
		int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);
		assertFalse(ls.hasAllValues(arr1, arr2));
		assertTrue(ls.hasAllValues(arr3, arr2));
	}
	@Test
	public void HasDuplicatesTest() {
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,1,1};
		int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);
		assertFalse(ls.hasDuplicates(arr1));
		assertTrue(ls.hasDuplicates(arr2));
	}
	@Test
	public void IsLatinSquareTest() {
		int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);//this is a Latin Square
		
		int[][] myArray1 = {{5,5,6},{5,6,4},{6,4,5}};
		LatinSquare DupRow = new LatinSquare(myArray1);//Duplicate values in row
		
		int[][] myArray2 = {{7,8,9},{8,9,7},{9,7,10}};
		LatinSquare NAVal = new LatinSquare(myArray2);//not all rows have the same values
		
		int[][] myArray3 = {{10,11,12},{10,12,11},{11,12,10}};
		LatinSquare DupCol = new LatinSquare(myArray3);//Dup value in column
		
		int[][] myArray4 = {{10,11,12},{11,12,10},{12,10,9}};
		LatinSquare FailCol = new LatinSquare(myArray4);//not all columns have the same values
		
		assertFalse(DupRow.isLatinSquare());
		assertFalse(NAVal.isLatinSquare());
		assertFalse(DupCol.isLatinSquare());
		assertFalse(FailCol.isLatinSquare());
		assertTrue(ls.isLatinSquare());
	}
	

	

}
