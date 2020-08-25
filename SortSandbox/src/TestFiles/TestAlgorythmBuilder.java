package TestFiles;

import static org.junit.Assert.*;

import org.junit.Test;

import sourceFiles.ArrayMaker;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsNull.*;
import org.hamcrest.core.IsNull;
import org.junit.*;
import org.junit.Test;

public class TestAlgorythmBuilder {

    public static ArrayMaker testClass;
    public static int[] testArray;
    
    @BeforeClass
    public static void Setup()
    {
        testClass = new ArrayMaker();
        testArray = testClass.makeArray();
    }
    
    
    @Test
    public void testLength() {
       
        assertThat(testClass.getLength(), equalTo(testArray.length));
        
    }
    
    @Test
    public void testArrayFill() {
        
        System.out.println("testClass Length:: " + testClass.getLength());
        System.out.println("testArray Length:: " + testArray.length);
        System.out.println("cell 0:: " + testArray[0]);
        
        
        testClass.print(testArray);
        
        assertThat(testClass.getLength(), equalTo(testArray.length));
        

        
    }

}
