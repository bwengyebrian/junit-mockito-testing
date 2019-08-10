package edu.mum.cs.cs425.labs.la9_junit_testing.prob4tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.labs.la9_junit_testing.prob4.ArrayFlattener;


public class ArrayFlattenerTest {
	
    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp(){
        this.arrayFlattener = new ArrayFlattener();
    }

    @After
    public void tearDown(){
        this.arrayFlattener = null;
    }

    @Test
    public void testFlattenArray(){
        int[][] a_in = new int [][]{{1,3},{0},{4,5,9}};
        int[] actuals = arrayFlattener.flattenArray(a_in);
        int[] expecteds = new int[]{1,3,0,4,5,9};
        Assert.assertArrayEquals(expecteds,actuals);
    }


}
