import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class test {

	public static void main(String[] args) {
		
		HashSet<Integer> ai = new HashSet<Integer>();
		
		for(int i = 0 ; i < 3; i++) {
			ai.add(i);
		}
		
		
		Iterator<Integer> num = ai.iterator();
		
		while(num.hasNext()) {
			System.out.println(num.next());
		}
	}

}
