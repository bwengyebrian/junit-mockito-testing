package edu.mum.cs.cs425.labs.la9_junit_testing.prob4;

import java.util.Arrays;

public class ArrayFlattener {

    public int[] flattenArray(int[][] a ){
    	if(a == null) return null;
        return Arrays.stream(a).flatMapToInt(ar->Arrays.stream(ar)).toArray();
    }


}
