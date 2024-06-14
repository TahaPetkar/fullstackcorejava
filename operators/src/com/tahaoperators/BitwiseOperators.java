package com.tahaoperators;

	public class BitwiseOperators {
		private int operand1;
		private int operand2;//then intenstance variable
	// hiding the state and showing the behaver encapsulation
		public BitwiseOperators() {}

			public BitwiseOperators(int operand1,int operand2){// first private to local virable{
				//variable shadowing
				this.operand1=operand1;
				this.operand2=operand2;
			}
				public void setOperand1(int operand1) {
					this.operand1=operand1;
				}
				public void setOperand2(int operand2) {// setmethod me void q liye 
					this.operand2=operand2;
				}
					public int getOperand1() {//getmethod me int q liye
						return operand1;
					}
					
					public int getOperand2() {
						return operand2;
				}
					public int andOperation() {
					return operand1&operand2;	
					}	
					public int xorOperation() {
						return operand1^operand2;	
						}	
					public int orOperation() {
						return operand1|operand2;	
						}
					public int leftShiftOperation() {
						return operand1<<1;
					}
					public int rightShiftOperation() {
						return operand2>>1;
					}
					public int unsignedRightOperation() {
						return operand2>>>1;
					}
					
}
