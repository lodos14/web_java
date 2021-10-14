/*
class fruit{
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
	private Fruit(){}
	
	�������� ���� �����ڰ� private�̴�. 
	�װ��� Ŭ���� Fruit�� �ν��Ͻ��� ���� �� ���ٴ� ���� �ǹ��Ѵ�.
	�ٸ� �뵵�� ����ϴ� ���� �����ϰ� �ִ� ���̴�.
	
 	�������� �̿� ���� ������ ������.
}
*/
// ������
enum Fruit { // ���� fruit�� ����.
	APPLE("red"), PEACH("pink"), BANANA("yellow"); // ���ڰ� ������ �Ű������� ��
	private String color;
	
	public String getColor() {
		return this.color;
	}
	Fruit(String color) { // ������ 3���̹Ƿ� 3�� �����
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

		switch (type) { // switch���� APPLE Ÿ���� Fruit��� ���� �ȴ�.
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
