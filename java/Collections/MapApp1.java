import java.util.*;

public class MapApp1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> a = new HashMap<String, Integer>();
			  // key     value
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		
		System.out.println(a.get("one")); // 1
		System.out.println(a.get("two")); // 2
		System.out.println(a.get("three")); // 3
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
		
	}
	
	static void iteratorUsingForEach(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	 static void iteratorUsingIterator(HashMap map){
	        Set<Map.Entry<String, Integer>> entries = map.entrySet();
	        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
	        while(i.hasNext()){
	            Map.Entry<String, Integer> entry = i.next();
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	    }
}
