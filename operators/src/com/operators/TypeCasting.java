package com.operators;

public class TypeCasting {
//Widening is small data is converated to large data there is issue of lossing data
	public static void main(String args[]) {
		
		byte byteVariable =127;
		short shortVariable = byteVariable;
		int intVariable = shortVariable;
		long longVariable = intVariable;
		float floatVariable = longVariable;
		double doubleVariable = floatVariable ;
		//Narrowing
		floatVariable = (float) doubleVariable;
		char charVariable = (char) byteVariable;
		byteVariable = (byte) charVariable;
		shortVariable = (short) charVariable;
		intVariable = charVariable;
		System.out.println(floatVariable);
	}
	

}
