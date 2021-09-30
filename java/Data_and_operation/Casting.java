
public class Casting {

	public static void main(String[] args) {
		
		int a = 1;
		double b = a;  // 이것은 double b = (double) 1; 이랑 같음
		System.out.println(b); // 1.0
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int) d; // 실수를 강제적으로 int형으로 바꿔줌 소숫점 밑으로 버려짐
		System.out.println(e); // 1
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());  // class java.lang.String - getClass() -> 데이터 타입을 알려줌
		
		// 1.1 to String
		String g = Double.toString(1.1);
		System.out.println(g.getClass());
	}

}
