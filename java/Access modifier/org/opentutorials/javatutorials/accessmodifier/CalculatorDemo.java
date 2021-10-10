package org.opentutorials.javatutorials.accessmodifier;

class Calculator {
	private int left, right;

	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	private int _sum() {
		return this.left + this.right;
	}

	public void sumDecoPlus() {
		System.out.println("++++" + _sum() + "++++");
	}

	public void sumDecoMinus() {
		System.out.println("----" + _sum() + "----");
	}

}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 20);
		c1.setOprands(10, 20);
		c1.sumDecoPlus(); // ++++30++++	
		c1.sumDecoMinus(); // ----30----
	}

}
