
class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person2<T>{
    public T info;
    Person2(T info){ this.info = info; }
    
    public <U> void getInfo(U info) {
		System.out.println(info);
	}
}
public class GenericApp2 {
    public static void main(String[] args) {	
        Person2 p1 = new Person2(new EmployeeInfo(1));
        EmployeeInfo ei = (EmployeeInfo)p1.info;
        System.out.println(ei.rank); // 1
        // p1.<EmployeeInfo>getInfo(ei.rank);
        p1.getInfo(ei.rank);
    }
  }