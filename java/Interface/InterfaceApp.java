class CalculatorDummy implements Calculatable {
	public void setOprands(int first, int second, int third) {

	}

	public int sum() {
		return 60;
	}

	public int avg() {
		return 20;
	}
}

public class InterfaceApp {

	public static void main(String[] args) {

		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(10, 20, 30);
		System.out.println("Че : " + c.sum());
		System.out.println("ЦђБе : " + c.avg());

	}

}
