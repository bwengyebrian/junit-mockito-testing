package edu.mum.cs.cs425.labs.la9_junit_testing.prob5;

import java.util.Arrays;

import edu.mum.cs.cs425.labs.la9_junit_testing.prob5.service.ArrayFlattenerService;

public class ArrayReversor {
	
	private ArrayFlattenerService arrayFlattenerService;

	public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
		
		this.arrayFlattenerService = arrayFlattenerService;
	}
	
	public int[] reverseArray(int[][] a) {
		int[] flat = arrayFlattenerService.flattenArray(a);
		if(flat == null) return null;
		int size = flat.length;
		int[] rev_a = new int[size];
		for(int i = 1;i<= size ; i++) {
			rev_a[size-i] = flat[i-1];
		}
		return rev_a;
	}

}
