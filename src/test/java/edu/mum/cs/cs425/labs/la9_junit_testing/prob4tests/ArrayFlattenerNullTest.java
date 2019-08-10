package edu.mum.cs.cs425.labs.la9_junit_testing.prob4tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.labs.la9_junit_testing.prob4.ArrayFlattener;

public class ArrayFlattenerNullTest {
	
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
	        int[][] a_in = null;
	        int[] actuals = arrayFlattener.flattenArray(a_in);
	        int[] expecteds = null;
	        Assert.assertArrayEquals(expecteds,actuals);
	    }

}
