package TestFiles;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsNull.*;
import org.hamcrest.core.IsNull;
import org.junit.*;

import sourceFiles.*;

public class BubbleSortTest {
    
    public static ArrayMaker testClass;
    public static int[] testArray;
    public static BubbleSort bubbleSort;

    @BeforeClass
    public static void Setup()
    {
        testClass = new ArrayMaker();
        testArray = testClass.makeArray();
        bubbleSort = new BubbleSort(testArray);
    }
    
    @Test
    public void testRunBubbleSort() {

        System.out.println("Raw Array::");
        ArrayMaker.print(testArray);
        
        bubbleSort.runBubbleSort();
        System.out.println();
        System.out.println("Bubble Sort Array::");;
        bubbleSort.print();
        
    }

}
