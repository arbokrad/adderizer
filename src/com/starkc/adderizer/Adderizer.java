package com.starkc.adderizer;

/**
 * 	Test harness for adding two numbers together
 *  	- run with two integers to add them together
 * @author Chris
 *
 */
public class Adderizer {

	public static void main(String[] args ) {
	
		// sanity check on command line args
		if( args == null || args.length != 2 ) {
			System.out.println( "Invalid parameters, aborting..." );
			return;
		}
		
		// grab both params
		Integer num1 = Integer.parseInt( args[0] );
		Integer num2 = Integer.parseInt( args[1] );
		
		// add and print the results
		System.out.println( num1 + num2 );
	}
}
