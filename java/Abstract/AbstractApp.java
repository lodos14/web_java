abstract class A{
	public abstract int b();
	// ��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
	//public abstract int c(){System.out.println("Hello")}
	//�߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ������ �� �ִ�.
	public void d() {
		System.out.println("world");
	}
}
class B extends A{
	public int b() { // �θ� �ִ� �߻� �޼ҵ带 �ڽĿ��� ���� �������
		return 1;
	}
}
public class AbstractApp {

	public static void main(String[] args) {
		
		// A obj = new A(); // �߻�Ŭ������ �ݵ�� ����ؼ� ����ؾ� �Ѵ�.
		B obj = new B();

	}

}
