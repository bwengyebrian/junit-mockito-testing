package edu.mum.cs.cs425.labs.la9_junit_testing;

import java.util.Arrays;

import edu.mum.cs.cs425.labs.la9_junit_testing.prob4.ArrayFlattener;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayFlattener af = new ArrayFlattener();
        System.out.println( Arrays.toString(af.flattenArray(new int [][]{{1,3},{0},{4,5,9}})));
    }
}
