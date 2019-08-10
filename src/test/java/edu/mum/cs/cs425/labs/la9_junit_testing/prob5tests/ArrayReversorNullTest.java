package edu.mum.cs.cs425.labs.la9_junit_testing.prob5tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.labs.la9_junit_testing.prob5.ArrayReversor;
import edu.mum.cs.cs425.labs.la9_junit_testing.prob5.service.ArrayFlattenerService;

public class ArrayReversorNullTest {

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
		int[][]a_in = null;
		when(arrayFlattenerService.flattenArray(a_in)).thenReturn(null);
		int[] actuals = arrayReversor.reverseArray(a_in);
		int[] expecteds = null;
		Assert.assertArrayEquals(expecteds, actuals);
		verify(arrayFlattenerService).flattenArray(a_in);
	}

}
