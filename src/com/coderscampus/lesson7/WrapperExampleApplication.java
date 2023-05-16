package com.coderscampus.lesson7;

public class WrapperExampleApplication {

	public static void main(String[] args) {
		// what is a wrapper class?
		
		/**
		 * byte    -> Byte
		 * short   -> Short
		 * int     -> Integer
		 * float   -> Float
		 * double  -> Double
		 * char    -> Character
		 * boolean -> Boolean
		 * 
		 * 
		 */
		
		int primitiveInt = 9;
		Integer wrapperInt = 9; // auto-boxing is happening here
		/** Autoboxing is the automatic conversion that the Java compiler
		makes between the primitive types and their corresponding 
		object wrapper classes. For example, converting an int to an 
		Integer, a double to a Double, and so on. If the conversion goes
		the other way, this is called unboxing.
		**/
		Integer anotherIntWrapper = Integer.valueOf(9);
		
		
		
	}

}
