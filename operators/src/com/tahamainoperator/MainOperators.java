package com.tahamainoperator;
import com.tahaoperators.*;
public class MainOperators {
	public static void main(String args[]) {
		BitwiseOperators bitwiseoperator = new BitwiseOperators();
		bitwiseoperator.setOperand1(-5);
		bitwiseoperator.setOperand2(3);
		//System.out.println(bitwiseoperator.andOperation());
	//	System.out.println(bitwiseoperator.xorOperation());
		//System.out.println(bitwiseoperator.orOperation());
//	System.out.println(bitwiseoperator.leftShiftOperation());
	//System.out.println(bitwiseoperator.rightShiftOperation());
		//System.out.println(bitwiseoperator.unsignedRightOperation());
	

		UnaryOperators unary=new UnaryOperators();
int temp=unary.postIncrement() + unary.preIncrement() +unary.postDecrement() +unary.preDecrement();
//System.out.println(temp);
//System.out.println(unary.getOperator1());//yaha pr varibale q liye ?
	


	TernaryOperators ternary=new TernaryOperators();
	ternary.setOperator1(40);
	ternary.setOperator2(20);
	//System.out.println("Greater No:"+ternary.ternaryOperation());
	}
}