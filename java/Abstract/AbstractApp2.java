
abstract class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	int _sum() {
		return this.left + this.right;
	}
	public abstract void sum();

	public abstract void avg();

	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator {
	public void sum() {
		System.out.println("+ sum : " + _sum());
	}

	public void avg() {
		System.out.println("+ avg : " + _sum() / 2);
	}
}
class CalculatorDecoMinus extends Calculator {
	public void sum() {
		System.out.println("- sum : " + _sum());
	}

	public void avg() {
		System.out.println("- avg : " + _sum() / 2);
	}
}

public class AbstractApp2 {

	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();
	}

}