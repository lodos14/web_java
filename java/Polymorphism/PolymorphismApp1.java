class A{
	public String x() {return "A";}
}

class B extends A{
	public String x() {return "B";}
	public String y() {return "y";}
}
public class PolymorphismApp1 {

	public static void main(String[] args) {
		// �ڽ�Ŭ������ Ÿ���� �θ� Ÿ������ �ν��Ͻ� ������ �� �� �ִ�.
		A obj = new B(); // Ŭ���� B�� �ν��ͽ� ���������� ������ Ÿ���� A�̴�.
		System.out.println(obj.x());
		
		// �ڽ��� Ÿ���� �θ��̹Ƿ� �θ� ���� �Լ��� ���� �ȵ�
		// �׷��Ƿ� �ؿ� �ڵ�� ����
		//System.out.println(obj.y());
			
	}
}
