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
		// 어떤 클래스가 어떤 인터페이스를 사용했다면
		// 인스턴스 데이터 타입을 인터페이스로 할 수 있다.
		I1 objI1 = new C();
		I2 objI2 =new C();
		
		obj.A();
		obj.B();
		
		objI1.A();
		//objI1.B(); I1에 B() 없음 -> 실행안됨
		
		//objI2.A(); I2에 A() 없음 ->실행안됨
		objI2.B();
	}

}
