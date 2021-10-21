
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
        
        // �κ�����
        System.out.println(A.containsAll(B)); // false  B�� A�� ��� ���� �Ǵ��� ����
        System.out.println(A.containsAll(C)); // true   C�� A�� ��� ���� �Ǵ��� ����
         
        //A.addAll(B); // A�� B�� ���ļ� A�� �����.(������)
        //A.retainAll(B); // ���������� ������ ����. (������)
        //A.removeAll(B); // A���� B�� �ִ� ���Ҹ� �A��. (������)
         
        Iterator hi = A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
 
}
