
public class Casting {

	public static void main(String[] args) {
		
		int a = 1;
		double b = a;  // �̰��� double b = (double) 1; �̶� ����
		System.out.println(b); // 1.0
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) d; // �Ǽ��� ���������� int������ �ٲ��� �Ҽ��� ������ ������
		System.out.println(e); // 1
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());  // class java.lang.String - getClass() -> ������ Ÿ���� �˷���
		
		// 1.1 to String
		String g = Double.toString(1.1);
		System.out.println(g.getClass());
	}

}
