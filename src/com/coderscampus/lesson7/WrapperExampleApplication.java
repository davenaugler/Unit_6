package com.coderscampus.lesson7;

public class WrapperExampleApplication {

	public static void main(String[] args) {
		// what is a wrapper class?
		
		/**
		 * byte    -> Byte
		 * short   -> Short
		 * int     -> Integer
		 * long    -> Long
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
		
		String someNumber = "123";
		String someOtherNumber = "456";
		
		// a safer way to do a string comparison to avoid
		// a NullPointerException
		if ("456".equals(someNumber)) {
//			System.out.println();
		}
		
		
		System.out.println(someNumber + someOtherNumber);
		System.out.println(Integer.parseInt(someNumber) + (Integer.parseInt(someOtherNumber)));
		
		Integer anotherIntWrapper = Integer.valueOf(9);
		
		Boolean someBoolean = null;
		
		// a safer way to do a Boolean evaluation to avoid
		// a NullPointerException
		if (Boolean.TRUE.equals(someBoolean)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		long firstLong = 10L;
		long secondLong = 10L;
		
		if (firstLong == secondLong) {
			System.out.println("Primitive long comparison works!");
		}
		
		Long firstLongWrapper = new Long(10);
		Long secondLongWrapper = Long.valueOf(10);
		
		// Here's a typical GOTCHA! scenario when comparing object 
		// wrapper values, be sure to use .equals(), not ==. Use == when using primitives.
		// Default to .equals() to do any comparison. You'll never be wrong. If .equals() isn't available
		// the compiler will underline it in red and tell you, that it needs to be fixed prior to running.
		if (firstLongWrapper.equals(secondLongWrapper)) {
			System.out.println("Object wrapper Long comparison works");
		} else {
			System.out.println("Object wrapper Long comparison DOES NOT work");
		}
		
	}

}
