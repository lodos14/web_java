
import java.util.*;
 
class Computer implements Comparable{  // sort를 사용하기 위해 Comparable를 구현해야함
    int serial;
    String owner;
    Computer(int serial, String owner){
        this.serial = serial;
        this.owner = owner;
    }
    public int compareTo(Object o) { // 인스턴스 강제
    	// 메소드 sort를 실행하면 내부적으로 compareTo를 실행하고
    	// 그 결과에 따라서 객체의 선후 관계를 판별하게 된다.
        return this.serial - ((Computer)o).serial; // 객체별 serial 비교 1 0 -1 
    }
    public String toString(){
        return serial+" "+owner;
    }
}
 
public class MapApp2 {
     
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "egoing"));
        computers.add(new Computer(200, "leezche"));
        computers.add(new Computer(3233, "graphittie"));
          
        Iterator i = computers.iterator();
        System.out.println("before");
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Collections.sort(computers);
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
 
}
