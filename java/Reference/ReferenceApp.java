
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
        _value(a); // int b = a  -> 1이 복사돼서 b에 담김 -> b에 다시 2가 담김
        System.out.println("runValue, "+a); // 원본은 건들지 않음
    }
     
    static void _reference1(A b){
        b = new A(2);
    }
     
    public static void runReference1(){
        A a = new A(1);
        _reference1(a); // A b = a -> a가 가리키는걸 b도 가리킴 -> b가 A(1)을 가리키다 A(2)를 가리킴
        System.out.println("runReference1, "+a.id);     
    }
     
    static void _reference2(A b){
        b.id = 2;
    }
 
    public static void runReference2(){
        A a = new A(1);
        _reference2(a); // A b = a -> a가 가리키는걸 b가 가리킴 -> b가 가리키는 id값을 2로 바꿈
        System.out.println("runReference2, "+a.id);     // -> b가 가리키는게 a도 가리키는거니 a.id도 바뀜
    }
     
    public static void main(String[] args) {
        runValue(); // runValue, 1
        runReference1(); // runReference1, 1
        runReference2(); // runReference2, 2
    }
 
}