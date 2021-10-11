class A{
	public String x() {return "A";}
}

class B extends A{
	public String x() {return "B";}
	public String y() {return "y";}
}
public class PolymorphismApp1 {

	public static void main(String[] args) {
		// 자식클래스의 타입을 부모 타입으로 인스턴스 생성을 할 수 있다.
		A obj = new B(); // 클래스 B를 인스터스 생성했지만 데이터 타입은 A이다.
		System.out.println(obj.x());
		
		// 자식의 타입이 부모이므로 부모에 없는 함수는 실행 안됨
		// 그러므로 밑에 코드는 오류
		//System.out.println(obj.y());
			
	}
}
