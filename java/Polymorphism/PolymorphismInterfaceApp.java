interface I1{
	public String A();
}
interface I2{
	public String B();
}

class C implements I1, I2 {
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}

public class PolymorphismInterfaceApp {

	public static void main(String[] args) {
		 
		C obj = new C();
		// � Ŭ������ � �������̽��� ����ߴٸ�
		// �ν��Ͻ� ������ Ÿ���� �������̽��� �� �� �ִ�.
		I1 objI1 = new C();
		I2 objI2 =new C();
		
		obj.A();
		obj.B();
		
		objI1.A();
		//objI1.B(); I1�� B() ���� -> ����ȵ�
		
		//objI2.A(); I2�� A() ���� ->����ȵ�
		objI2.B();
	}

}
