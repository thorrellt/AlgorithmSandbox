package TestFiles;

//import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsNull.*;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

//import org.hamcrest.core.IsNull;
import org.junit.*;

import sourceFiles.*;

public class SelectSortTest {
    
    public static ArrayMaker testClass;
    public static int[] testArray;
    public static SelectSort selectSort;

    @Before
    public void Setup()
    {
        testClass = new ArrayMaker();
        testArray = testClass.makeArray();
        selectSort = new SelectSort(testArray);
    }
    
    @Test
    public void SelectSort() {
        
        
        selectSort = new SelectSort(testArray);
        
        //constructor makes an identical copy of testArray T/F
        assertThat(selectSort.getArray(),equalTo(testArray));
        
        //constructor makes a deep copy of testArray T/F
        assertNotSame(selectSort.getArray(),testArray);
        
        
    }
    
    @Test
    public void testRunSelectSort() {
   
        selectSort.runSelectSort();
        
        System.out.println("Raw Array::");
        ArrayMaker.print(testArray);
        System.out.println();
        System.out.println("Select Sort Array::");
        selectSort.print();
        
        //the array is now sorted T/F?
        assertTrue(isSorted(selectSort.getArray()));
    }
        
    
    
    public boolean isSorted(int[] sortedArray) {
        
        boolean isSorted = true;
        for(int i = 0; i < sortedArray.length-1; i++) {
            
            if (sortedArray[i]> sortedArray[i+1]) {
                isSorted = false;
            }
        }
        return isSorted;
    }
}

