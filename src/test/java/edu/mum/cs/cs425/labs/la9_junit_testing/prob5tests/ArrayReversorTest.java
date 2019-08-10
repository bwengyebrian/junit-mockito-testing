package edu.mum.cs.cs425.labs.la9_junit_testing.prob5tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.labs.la9_junit_testing.prob5.ArrayReversor;
import edu.mum.cs.cs425.labs.la9_junit_testing.prob5.service.ArrayFlattenerService;

import static org.mockito.Mockito.*;

public class ArrayReversorTest {
	
	private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
	private ArrayReversor arrayReversor;

	@Before
	public void setUp() throws Exception {
		this.arrayReversor = new ArrayReversor(arrayFlattenerService);
	}

	@After
	public void tearDown() throws Exception {
		this.arrayReversor = null;
	}

	@Test
	public void testReverseArray() {
		int[][]a_in = new int[][] {{1,3},{0},{4,5,9}};
		when(arrayFlattenerService.flattenArray(a_in)).thenReturn(new int[] {1,3,0,4,5,9});
		int[] actuals = arrayReversor.reverseArray(a_in);
		int[] expecteds = new int[] {9,5,4,0,3,1};
		Assert.assertArrayEquals(expecteds, actuals);
		verify(arrayFlattenerService).flattenArray(a_in);
	}

}
