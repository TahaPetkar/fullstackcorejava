package com.tahaoperators;

public class UnaryOperators {
	private int operator1;
	public UnaryOperators() {}
	
	public UnaryOperators(int operator1) { 
		this.operator1=operator1;

		}
	public void setOperator1(int operator1) {
		this.operator1=operator1;
		
		}
	
	public int getOperator1() {
	return operator1;
	}
	public int postIncrement() {
		return operator1++;
	
	}
	
	public int preIncrement() {
		return ++operator1;

	}
	public int  postDecrement() {
		return operator1--;
	
	}
	
	public int preDecrement() {
		return --operator1;

	}
}