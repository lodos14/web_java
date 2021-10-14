/*
class fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
	private Fruit(){}
	
	생성자의 접근 제어자가 private이다. 
	그것이 클래스 Fruit를 인스턴스로 만들 수 없다는 것을 의미한다.
	다른 용도로 사용하는 것을 금지하고 있는 것이다.
	
 	열거형은 이와 같은 형상을 가진다.
}
*/
// 열거형
enum Fruit { // 위에 fruit와 같다.
	APPLE("red"), PEACH("pink"), BANANA("yellow"); // 인자가 생성자 매개변수로 들어감
	private String color;
	
	public String getColor() {
		return this.color;
	}
	Fruit(String color) { // 변수가 3개이므로 3번 실행됨
		System.out.println("Call Constructor " + this);
		this.color =  color;
	}
}

enum Company {
	GOOGLE, APPLE, ORACLE
}

public class EnumApp {

	public static void main(String[] args) {

		Fruit type = Fruit.APPLE;

		switch (type) { // switch문이 APPLE 타입이 Fruit라는 것을 안다.
		case APPLE:
			System.out.println(57 + " kcal, color : "+Fruit.APPLE.getColor());
			break;
		case PEACH:
			System.out.println(34 + "kcal, color : "+Fruit.PEACH.getColor());
			break;
		case BANANA:
			System.out.println(93 + " kcal, color : "+Fruit.BANANA.getColor());
		}

	}

}
