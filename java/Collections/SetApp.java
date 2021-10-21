
import java.util.ArrayList;
import java.util.HashSet;
 
import java.util.Iterator;
 
public class SetApp {
 
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
         
        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);
         
        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);
        
        // 부분집합
        System.out.println(A.containsAll(B)); // false  B가 A에 모두 포함 되는지 여부
        System.out.println(A.containsAll(C)); // true   C가 A에 모두 포함 되는지 여부
         
        //A.addAll(B); // A와 B를 합쳐서 A를 만든다.(합집합)
        //A.retainAll(B); // 공통적으로 가지는 원소. (교집합)
        //A.removeAll(B); // A에서 B에 있는 원소를 뺸다. (차집합)
         
        Iterator hi = A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
 
}
