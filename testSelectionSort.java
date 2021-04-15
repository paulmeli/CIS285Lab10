/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
//		testPositive();
//		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
    }

    public void testNegative(){

        /** Test data contains negative values only **/
    }

    public void testMixed(){
      /** Test data contains with both positive, negative and zeros **/
     int[] arr = new int[5];
       arr[0] = -8;
       arr[1] = 9;
       arr[2] = -7;
       arr[3] = 0;
       arr[4] = -2;

       int[] Sortedarr = new int[5];
       Sortedarr[0] = -8;
       Sortedarr[1] = -7;
       Sortedarr[2] = -2;
       Sortedarr[3] = 0;
       Sortedarr[4] = 9;

       SelectionSort temp1 = new SelectionSort();
       int[] testSortedArr = temp1.basicSelectionSort(arr);

       /** add tests to check for this unit test **/

       for (int i = 0; i < Sortedarr.length; i++)
         assertEquals("testMixed failed at " + i, Sortedarr[i], testSortedArr[i]);
    }

    public void testDuplicates(){
      /** Test data contains duplicates **/
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 7;
        arr[4] = -8;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -8;
        Sortedarr[2] = 2;
        Sortedarr[3] = 2;
        Sortedarr[4] = 7;

        SelectionSort temp1 = new SelectionSort();
        int[] testSortedArr = temp1.basicSelectionSort(arr);

        /** add tests to check for this unit test **/

        for (int i = 0; i < Sortedarr.length; i++)
        	assertEquals("testDuplicates failed at " + i, Sortedarr[i], testSortedArr[i]);
    }


}
