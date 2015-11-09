package com.starkc.adderizer;

public class Adderizer {

	public static void main(String[] args ) {
	
		if( args == null || args.length != 2 ) {
			System.out.println( "Invalid parameters, aborting..." );
			return;
		}
		
		Integer num1 = Integer.parseInt( args[0] );
		Integer num2 = Integer.parseInt( args[1] );
		
		System.out.println( num1 + num2 );
	}
}
