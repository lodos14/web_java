import java.util.ArrayList;

public class ArrauListApp {

	public static void main(String[] args) {
		
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		//arrayObj[2] = "three"; // 오류가 발생한다.
		
		for(int i = 0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList al1 = new ArrayList();
		al1.add("one");  // ArrayList는 Object 형태로 데이터를 받음
		al1.add("two");
		al1.add("three");
		for(int i = 0; i < al1.size(); i++ ) {
			String value = (String)al1.get(i); // Object 타입을 저장할 형태로 형변환
			System.out.println(value);
		}
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("one");  
		al2.add("two");
		al2.add("three");
		for(int i = 0; i < al2.size(); i++ ) {
			String value = al2.get(i);  // 제네릭으로 타입을 지정하면 형변환을 안해도 된다.
			System.out.println(value);
		}	
	}
}
