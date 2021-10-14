
abstract class Info {
	public abstract int getLevel();
}

class EmployeeInfo2 extends Info {
	public int rank;

	EmployeeInfo2(int rank) {
		this.rank = rank;
	}

	public int getLevel() {
		return this.rank;
	}
}

class Person3<T extends Info> { // Info와 그 자식의 데이터 타입만 제네릭으로 들어올 수 있다.
	public T info;

	Person3(T info) {
		this.info = info;
		info.getLevel();
	}
}

public class GenericApp3 {
	public static void main(String[] args) {
		Person3 p1 = new Person3(new EmployeeInfo2(1));
		// 밑에 문장은 에러
		// Person3<String> p2 = new Person3<String>("부장");
	}
}