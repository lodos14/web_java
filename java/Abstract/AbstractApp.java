abstract class A{
	public abstract int b();
	// 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	//public abstract int c(){System.out.println("Hello")}
	//추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재할 수 있다.
	public void d() {
		System.out.println("world");
	}
}
class B extends A{
	public int b() { // 부모에 있던 추상 메소드를 자식에서 정의 해줘야함
		return 1;
	}
}
public class AbstractApp {

	public static void main(String[] args) {
		
		// A obj = new A(); // 추상클래스는 반드시 상속해서 사용해야 한다.
		B obj = new B();

	}

}
