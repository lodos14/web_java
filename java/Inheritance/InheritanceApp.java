class Cal {
	int v1, v2;

	Cal(int v1, int v2) {
		System.out.println("Cal init");
		this.v1 = v1;
		this.v2 = v2;
	}

	public int sum() {
		return v1 + v2;
	}
}

class Cal3 extends Cal {

	Cal3(int v1, int v2) {
		super(v1, v2); // �θ�Ŭ������ �����ڸ� ���� ��Ų��.
		System.out.println("Cal3 init!!");
	}

	public int minus() {
		return v1 - v2;
	}
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c1 = new Cal(2, 1);
		Cal3 c3 = new Cal3(2, 1);
		System.out.println(c1.sum()); // 3
		System.out.println(c3.minus()); // 1
	}

}
