import java.util.ArrayList;

public class ArrauListApp {

	public static void main(String[] args) {
		
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		//arrayObj[2] = "three"; // ������ �߻��Ѵ�.
		
		for(int i = 0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList al1 = new ArrayList();
		al1.add("one");  // ArrayList�� Object ���·� �����͸� ����
		al1.add("two");
		al1.add("three");
		for(int i = 0; i < al1.size(); i++ ) {
			String value = (String)al1.get(i); // Object Ÿ���� ������ ���·� ����ȯ
			System.out.println(value);
		}
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("one");  
		al2.add("two");
		al2.add("three");
		for(int i = 0; i < al2.size(); i++ ) {
			String value = al2.get(i);  // ���׸����� Ÿ���� �����ϸ� ����ȯ�� ���ص� �ȴ�.
			System.out.println(value);
		}	
	}
}
