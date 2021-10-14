
class A{
    public int id;
    A(int id){
        this.id = id;
    }
}
public class ReferenceApp {
    
    static void _value(int b){
        b = 2;
    }
     
    public static void runValue(){
        int a = 1;
        _value(a); // int b = a  -> 1�� ����ż� b�� ��� -> b�� �ٽ� 2�� ���
        System.out.println("runValue, "+a); // ������ �ǵ��� ����
    }
     
    static void _reference1(A b){
        b = new A(2);
    }
     
    public static void runReference1(){
        A a = new A(1);
        _reference1(a); // A b = a -> a�� ����Ű�°� b�� ����Ŵ -> b�� A(1)�� ����Ű�� A(2)�� ����Ŵ
        System.out.println("runReference1, "+a.id);     
    }
     
    static void _reference2(A b){
        b.id = 2;
    }
 
    public static void runReference2(){
        A a = new A(1);
        _reference2(a); // A b = a -> a�� ����Ű�°� b�� ����Ŵ -> b�� ����Ű�� id���� 2�� �ٲ�
        System.out.println("runReference2, "+a.id);     // -> b�� ����Ű�°� a�� ����Ű�°Ŵ� a.id�� �ٲ�
    }
     
    public static void main(String[] args) {
        runValue(); // runValue, 1
        runReference1(); // runReference1, 1
        runReference2(); // runReference2, 2
    }
 
}