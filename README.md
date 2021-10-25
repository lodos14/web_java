# Java

## 1. 자바 동작원리

자바의 소스코드는 .java 확장자는 컴퓨터가 이해하지 못하는 형태이다. 그래서 컴퓨터가 이해할 수 있도록 컴파일을 하면 .class 확장자로 변환이 되고 이 변환된 파일을 실행하면 자바 가상 머신(JVM)이 이것을 읽어 컴퓨터에 실행한다.

![자바 실행](https://user-images.githubusercontent.com/81665608/135426587-ea4b0373-a9a1-420a-803b-c7046ca08fd4.png)

## 2. 데이터 타입 기본

### 2.1 숫자

    System.out.println(6); // Number
  
### 2.2 문자 및 문자(String,  Char)

문자는 '작은 따옴표' "문자열은 큰 따옴표"<br>
"H" -> 문자 하나도 길이 1의 문자열이 될 수 있으므로 큰 따옴표 사용 가능 <br>
그러나  "H" 와 'H' 의 타입은 다름 

    System.out.println("Hello World!!"); // String 문자열
    System.out.println('H'); // Char 문자

## 3. 숫자와 연산

### 3.1 Operator(연산자)

	System.out.println(6 + 2); // 8
	System.out.println(6 - 2); // 4
	System.out.println(6 * 2); // 12
	System.out.println(6 / 2); // 3 
    
### 3.2 Math 활용 예제

    System.out.println(Math.PI); // 3.141592....
    System.out.println(Math.floor(Math.PI)); // 3.0 // Math.floor(변수) 내림
    System.out.println(Math.ceil(Math.PI)); // 4.0 // Math.ceil(변수) 올림

## 4. 문자열 다루기

### 4.1 자
바에서 코드 작성 시 문자열이 밑줄로 빠지는 경우 아래와 같이 작성해야 한다. 

    System.out.println("Hello "   // Hello World
        + "World");

### 4.2 new line(\n)

출력을 줄 바꿈 할 경우 줄 바꿔줄 부분 앞에 <strong>\n</strong>을 붙인다.

    System.out.println("Hello \nWorld");  // Hello    출력 줄 바꿈
                                          // World

### 4.3 역 슬래시 (\)
문자열안에 작은 따옴표 또는 큰 따옴표를 포함하고 싶은 경우 기능을 하는 문자 앞에 <strong>\\</strong>(역 슬래시)를 붙인다.

    System.out.println("Hello \"World\""); // Hello "World"

### 4.4 length()

문자열의 길이를 세어줌

    System.out.println("Hello World".length()); // 11
    
### 4.5 replace( 0, 0 )

문자열 내부의 지정 문자열을 원하는 문자열로 교체

    System.out.println("Hello, dog".replace("dog", "cat")); // Hello, cat

## 5. 변수

### 5.1 변수의 정의
자바는 최초 변수 사용시 먼저 변수의 타입을 지정해 줘야한다.

    int a = 1;  // Number -> integer(정수)
    System.out.println(a);

    double b = 1.1; // real number -> double (실수)
    System.out.println(b);

    String c = "Hello World"; // String 문자열
    System.out.println(c);

### 5.2 변수의 효용

변수를 사용하면 일일이 다 변경해주지 않아도 변수의 값만 바꿔주면 변수를 사용한 모든 곳의 값을 바꿔 줄 수 있다.<br>
그리고 변수를 사용하면 나중에 이 값이 어떤 값인지 직접적으로 알아볼 수 있기 때문에 변수를 사용해야 한다.

    String name = "dog";
    System.out.println("Hello, " + name + " ... " + name + " ... dog ... bye");
    // Hello, dog ... dog ... dog ... bye

    double VAT = 10.0;
    System.out.println(VAT); // 10.0

### 5.3 데이터 Casting

int 를 double로 변환하는 경우
    
    double a = 1
    double b = (double) a; // int를 double로 변환하는 경우 생략 가능하지만 명시적으로 써줌 (double b = 1;) 
    System.out.println(b); // 1.0
    
    
double를 int로 변환하는 경우 
    
    double d = 1.1;
    int e = (int) d; // 실수를 강제적으로 int형으로 바꿔줌 소숫점 밑으로 버려짐
    System.out.println(e); // 1
    
int를 String로 변환

    // 1 to String
    String f = Integer.toString(1);
    System.out.println(f.getClass());  // class java.lang.String  //  getClass() -> 데이터 타입을 알려줌
    
double를 String로 변환 
    
    
    // 1.1 to String
    String g = Double.toString(1.1);
    System.out.println(g.getClass()); 
    
    
## 6. 패키지 사용

패키지 구성이 다음과 같을 때

\- org <br>
&nbsp;&nbsp;\- opentutorials <br>
&nbsp;&nbsp;&nbsp;&nbsp;\- iot <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\- Elevator <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\- Security <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\- Lighting <br>

### 예제
동작 설명 <br>
1. 집으로 가는 과정
2. 목적지는 JAVA APT 507
3. 엘레베이터를 1층으로 부른다.
4. 보안을 종료한다.
5. 홀 라이드와 바닥 라이트를 on 한다.

        import org.opentutorials.iot.Elevator;
        import org.opentutorials.iot.Lighting;
        import org.opentutorials.iot.Security;

        public class OkJavaGoInHome {

          public static void main(String[] args) {

            String id = "JAVA APT 507";

            // Elevator call
            Elevator myElevator = new Elevator(id);
            myElevator.callForUp(1);

            // Security off
            Security mySecurity = new Security(id);
            mySecurity.off();

            // Light on
            Lighting hallLamp = new Lighting(id + " / Hall Lamp");
            hallLamp.on();

            Lighting floorLamp = new Lighting(id + " / floorLamp");
            floorLamp.on();

          }

        }
        
## 7. 사용자 입력(input)

### 7.1 args
main의 매개변수로 들어가는 args를 사용자 입력으로 넣어 줄 수 있다.

    public static void main(String[] args) // args를  String[]로 정의

run 버튼의 확장 -> Run Configurations -> 원하는 프로그램 클릭 -> Arguments -> program arguments 칸에 입력<br>
ex) "JAVA APT 507" "15.0" 를 입력하면 args = \[ "JAVA APT 507", "15.0"]

    public static void main(String[] args) {
      String id = args[0]
      String value = args[1]
      
      System.out.println(id)  // JAVA APT 507
      System.out.println(value)  // 15.0
    }
   
Run Configurations에 있는 프로그램 이름들은 파일 이름이 아니라 실행 이름이므로 <br>
arguments를 다르게 입력한 실행 프로그램을 변수 값을 이름에 추가해 여러개 만들고 리스트에 추가해서 편리하게 사용할 수 있다.

### 7.2 JOptionPane

GUI 형태로 사용자 입력을 받을 수 있다.

    String id = JOptionPane.showInputDialog("Enter a ID"); // 데이터 타입은 String로 입력된다.

![사용자입력](https://user-images.githubusercontent.com/81665608/135511231-fc2fae95-cd11-4532-b4bf-2f458bbe2891.png)

## 8. 제어문

### 8.1 Boolean data type
<strong>true</strong>, <strong>false</strong> (참, 거짓)

contains()

    String foo = "Hello world";		
    System.out.println(foo.contains("world"));  // true
    System.out.println(foo.contains("dog")); // false

### 8.2 비교연산자
\>, <, ==, <=, >=, != <br>

    System.out.println(1 > 1); // false
    System.out.println(1 == 1); // true
    System.out.println(1 < 1); // false
    System.out.println(1 >= 1); // true
    System.out.println(1 <= 1); // true
    System.out.println(1 != 1); // false
    
문자열은  == 대신에 equals를 사용한다.
    
    String name = "dog";
    String inputName = JOptionPane.showInputDialog("Enter a Name");

    System.out.println("Hi");
    
    if(inputName.equals(name)) {
        System.out.println("Master!");
    } else {
        System.out.println("Who are you?");
    }
 
문자열에 대한 비교는 여러가지가 있으므로 찾아볼것

### 8.3 AND, OR, NOT

AND : 두 개의 대상이 모두 true면 true, 그 외는 false <br>
OR : 두 개의 대상 중 하나라도 true면 true 모두 false면 false <br>
NOT : !true = false, !false = true  

AND : && <br>
OR : || <br>
NOT : !

    String name = "dog";
    String inputName = JOptionPane.showInputDialog("Enter a Name");

    String pass = "1111";
    String inputPass = JOptionPane.showInputDialog("Enter a Pass");

    System.out.println("Hi");

    if(inputName.equals(name) && inputPass.equals(pass)) {
        System.out.println("Master!");
    } else {
        System.out.println("Who are you?");
    }

### 8.4 반복문

while : 보통 무한 
 
    System.out.println("=== while ===");
    int i = 0;		
    while(i < 3) {
        System.out.println(2);
        System.out.println(3);
        i++;
    }
    
for : 정해진 횟수에 사용

    System.out.println("=== for ===");
    for(int j = 0; j < 3; j++) {
        System.out.println(2);
        System.out.println(3);
    }
    
### 8.5 배열

반복적으로 처리할 때 사용하는 데이터 형태

    String[] users = new String[3];	   // 배열의 타입과 공간 먼저 선언하는 경우
    users[0] = "kim";
    users[1] = "pack";
    users[2] = "oh";

    System.out.println(users[1]); // pack
    System.out.println(users.length); // 3

    int[] scores = {10, 100, 100};  // 한번에 데이터까지 선언하는 경우
    System.out.println(scores[1]);  // 100
    System.out.println(scores.length); // 3
 
반복문과의 활용

    String[] users = new String[3];
    users[0] = "kim";
    users[1] = "pack";
    users[2] = "oh";

    for (int i = 0; i < users.length; i++) {   // 배열의 길이만큼 반복
        System.out.println("<li>"+users[i]+"</li>");
    }

### 8.5 제어문 종합 예제

사용자 입력과 유저 배열을 활용한 예제

    String[] users = {"kim", "pack", "oh"};		
    String inputId = JOptionPane.showInputDialog("Enter a ID");

    boolean isLogined = false;
    for(int i= 0; i < users.length; i++) {
        String currentId = users[i];
        if(currentId.equals(inputId)) {
            isLogined = true;
            break;
        }
    }

    System.out.println("Hi");
    if(isLogined) {
        System.out.println("Master!!");
    } else {
        System.out.println("Who are you?");
    }
    
이중배열을 활용한 Passward 추가

    // String[] users = {"kim", "pack", "oh"};
    String[][] users = {
            {"kim", "1111"},
            {"pack", "2222"},
            {"oh", "3333"}
    };
    String inputId = JOptionPane.showInputDialog("Enter a ID");
    String inputPass = JOptionPane.showInputDialog("Enter a Pass");

    boolean isLogined = false;
    for(int i= 0; i < users.length; i++) {
        String[] current = users[i];
        if(current[0].equals(inputId) && current[1].equals(inputPass)) {
            isLogined = true;
            break;
        }
    }

    System.out.println("Hi");
    if(isLogined) {
        System.out.println("Master!!");
    } else {
        System.out.println("Who are you?");
    }

## 9. Method

특정 기능을 하는 코드의 집합 

### 9.1 기본형태

    public static void printTwoTimesA() {
        System.out.println("-");
        System.out.println("a");
        System.out.println("a");
    }

### 9.2 함수의 입력

    public static void main(String[] args) {

                      // 인자, argument
        printTwoTimesA("a", "-");
        printTwoTimesA("a", "*");
        printTwoTimesA("a", "&");
        printTwoTimesA("b", "!");
        
    }
                                     // 매개변수, parameter
    public static void printTwoTimesA(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
 
### 9.3 함수의 출력

    public static String a() {
        return "a";
    }
    public static int one() {
        return 1;
    }
    public static void main(String[] args) {

        System.out.println(a());  // a
        System.out.println(one()); // 1

    }
    
### 9.4 함수 예제

    public class AccountingApp {
        // 공급가액
        public static double valueOfSupply = 10000.0;

        // 부가가치세율 
        public static double vatRate = 0.1;

        public static double getVAT() {
            return valueOfSupply * vatRate;
        }
        public static double getTotal() {
            return valueOfSupply + getVAT();
        }

        public static void main(String[] args) {

            System.out.println("Value of supply : " + valueOfSupply);
            System.out.println("VAT : " + getVAT());
            System.out.println("Total : " + getTotal());

        }

    }
    
## 10 객체지향

서로 연관된 함수와 변수를 그룹핑한 것을 Class라고 하고 Class를 중심으로 프로그램의 구조를 만드는 것을<br>
객체 지향 프로그래밍 이라고 한다.

### 10.1 class 기본형

    class Print {
        public static String delimiter;
        public static void A() {
            System.out.println(delimiter);
            System.out.println("A");
            System.out.println("A");
        }
        public static void B() {
            System.out.println(delimiter);
            System.out.println("B");
            System.out.println("B");
        }
    }

    public class MyOOP {

        public static void main(String[] args) {

            Print.delimiter = "----";
            Print.A();
            Print.A();
            Print.B();
            Print.B();

            Print.delimiter = "****";
            Print.A();
            Print.A();
            Print.B();
            Print.B();
        }	
    }

### 10.2 인스턴스

클래스의 복제본으로 클래스의 현재 생성된 오브젝트를 가리킨다. <br>
인스턴스를 사용하면 내부 변수가 다른 여려개의 객체를 생성해서 사용할 수 있다. <br>
인스턴스의 생성은 new를 사용한다.

    class Print {
        public String delimiter;
        public void A() {
            System.out.println(delimiter);
            System.out.println("A");
            System.out.println("A");
        }
        public void B() {
            System.out.println(delimiter);
            System.out.println("B");
            System.out.println("B");
        }
    }

    public class MyOOP {

        public static void main(String[] args) {

            Print p1 = new Print();
            p1.delimiter= "****";
            p1.A();
            p1.A();
            p1.B();
            p1.B();

            Print p2 = new Print();
            p2.delimiter= "****";
            p2.A();
            p2.A();
            p2.B();
            p2.B();

            p1.A();
            p2.A();
            p1.A();
            p2.A();
        }

    }
 
## 10.3 static
1. class 안에static이 있는건 클래스소속<br>
2. static가 없는건 인스턴스 소속 <br>
3. static이 붙지 않은 건 인스턴스 생성 시 생성됨
4. 일반적인 Class 호출 시 static이 없는 변수나 함수는 호출할 수 없음 <br>
5. static이 없는 건 인스턴스를 생성해서 접근 가능 <br>
6. 인스턴스로 생성해서 static의 함수나 변수에 접근 가능 하지만 <br>
7. 일반적인 방법으로 호출하도록 해야함
8. static이 붙은 변수를 변경하면 클래스 자체가 변경되므로 복제품인 모든 인스턴스의 변수도 변경됨
10. static이 붙지 않은 변수는 인스턴스 소속이므로 class자체가 아니라 변경한 인스턴스만 변수가 변경됨

        class Foo{
            public static String classVar = "I class var";
            public String instanceVar = "I instance var";
            public static void classMethod() {
                System.out.println(classVar); // Ok
                //      System.out.println(instanceVar); // Error
            }
            public void instanceMethod() {
                System.out.println(classVar); // Ok
                System.out.println(instanceVar); // Ok
            }
        }
        public class StaticApp {

            public static void main(String[] args) {
                System.out.println(Foo.classVar); // OK
                //      System.out.println(Foo.instanceVar); // Error
                Foo.classMethod();
                //      Foo.instanceMethod();

                Foo f1 = new Foo();
                Foo f2 = new Foo();
                //      
                System.out.println(f1.classVar); // I class var // 예시용이고 Foo.classVar로 접근 해야함
                System.out.println(f1.instanceVar); // I instance var
                //      
                f1.classVar = "changed by f1"; // 예시용이고 Foo.classVar로 접근 해야함
                System.out.println(Foo.classVar); // changed by f1
                System.out.println(f2.classVar);  // changed by f1
                //      
                f1.instanceVar = "changed by f1";
                System.out.println(f1.instanceVar); // changed by f1
                System.out.println(f2.instanceVar); // I instance var
            }

        }
        
## 10.4 생성자와 this
생성자 : 인스턴스를 생성할 때 해야할 초기화 작업을 정의
this : 자기자신의 클래스의 변수 또는 함수를 가르킴

    class Print {
        public String delimiter="!!!!" ;
        public Print() { // 생성자 매개변수를 빈 값으로 넣으면 기본 값으로 설정됨

        }
        public Print(String _delimiter) { // 매개변수를 넣으면 사용자가 인자를 전달한 값으로 설정가능
            this.delimiter = _delimiter; // this = 자신 클래스의 변수
        }

        public void A() {
            System.out.println(this.delimiter);
            System.out.println("A");
            System.out.println("A");
        }
        public void B() {
            System.out.println(this.delimiter);
            System.out.println("B");
            System.out.println("B");
        }
    }
    public class MyOOP {

        public static void main(String[] args) {

            Print p1 = new Print("----");	
            p1.A();
            p1.A();
            p1.B();
            p1.B();

            Print p2 = new Print("****");	
            p2.A();
            p2.A();
            p2.B();
            p2.B();

            p1.A();
            p2.A();
            p1.A();
            p2.A();
        }
    }

## 11. 상속
어떤 클래스가 가지고 있는 메소드와 변수를 다른 클래스가 상속받아 사용할 수 있는 것

    class Cal {
        public int sum(int v1, int v2) {
            return v1 + v2;
        }
    }
    class Cal3 extends Cal { // 상속받을 클래스 뒤에 extends + 상속할 클래스

    }
    public class InheritanceApp {

        public static void main(String[] args) {
            Cal c1 = new Cal();
            System.out.println(c1.sum(2, 1)); // 3
            
            Cal3 c3 = new Cal3();
            System.out.println(c3.sum(2, 1)); // 3
        }

    }

### 11.1 Overriding
부모가 가지고 있는 기능을 재정의 하는 것, 부모가 가진 함수의 내용만 재정의 하는 것

	class Cal {
		public int sum(int v1, int v2) {
		    return v1 + v2;
		}
	}

	class Cal3 extends Cal {
		public int minus(int v1, int v2) {
		    return v1 - v2;
		}
		// 부모가 가지고 있는 기능 재정의(Overriding) 즉 부모가 가진 함수를 내용만 재정의 하는 것
		public int sum(int v1, int v2) { 
		    System.out.println("Cal3!!");
		    return v1 + v2;
		}
	}
	public class InheritanceApp {

		public static void main(String[] args) {
		    Cal c1 = new Cal();
		    System.out.println(c1.sum(2, 1)); // 3

		    Cal3 c3 = new Cal3();
		    System.out.println(c3.sum(2, 1)); // Cal3!! 3
		    System.out.println(c3.minus(2, 1)); // 1
		}

	}

### 11.2 Overloading
같은 이름의 메서드를 매개변수의 갯수와 타입이 다른 함수를 정의 하는 것<br>
overloading는 상속에만 국한되는게 아니라 같은 클래스 안에서도 일어남

    class Cal {
        public int sum(int v1, int v2) {
            return v1 + v2;
        }
        // 같은 이름의 메서드를 매개변수의 갯수와 타입이 다른 함수를 정의 하는 것 (Overloading)
        public int sum(int v1, int v2, int v3) { 
            return v1 + v2 + v3;
        }
    }

    class Cal3 extends Cal {
        // 같은 이름의 메서드를 매개변수의 갯수와 타입이 다른 함수를 정의 하는 것 (Overloading)
        public int sum(int v1, int v2, int v3) { 
            return v1 + v2 + v3;
        }
    }
    
	public class InheritanceApp {

		public static void main(String[] args) {
			Cal c1 = new Cal();
			System.out.println(c1.sum(2, 1)); // 3
			System.out.println(c1.sum(2, 1, 1)); // 4	
		}

	}

### 11.3 super와 this
super : 부모클래스를 가리킴 <br>
this : 자기 자신을 가리킴

    class Cal {
        public int sum(int v1, int v2) {
            return v1 + v2;
        }

        // 같은 이름의 메서드를 매개변수의 갯수와 타입이 다른 함수를 정의 하는 것 (Overloading)
        public int sum(int v1, int v2, int v3) {
            return this.sum(v1, v2) + v3; // this -> 자기 자신을 가리킴
        }
    }

    class Cal3 extends Cal {

        // 부모가 가지고 있는 기능 재정의(Overriding) 즉 부모가 가진 함수를 내용만 재정의 하는 것
        public int sum(int v1, int v2) {
            int a = super.sum(v1, v2); // super-> 부모클래스를 가리킴
            return a + 3;  
        }
    }

    public class InheritanceApp {

        public static void main(String[] args) {
            Cal c1 = new Cal();
            System.out.println(c1.sum(2, 1)); // 3
            System.out.println(c1.sum(2, 1, 1)); // 4

            Cal3 c3 = new Cal3();
            System.out.println(c3.sum(2, 1)); // 6		
        }

    }

### 11.4 상속과 생성자
부모클래스에 생성자가 있으면 자식 클래스는 부모클래스의 생성자를 실행해야 한다.

    class Cal {
        int v1, v2;

        Cal(int v1, int v2) {
            System.out.println("Cal init");
            this.v1 = v1;
            this.v2 = v2;
        }

        public int sum() {
            return this.v1 + v2;
        }
    }

    class Cal3 extends Cal {

        Cal3(int v1, int v2) {
            super(v1, v2); // 부모클래스의 생성자를 실행 시킨다.
            System.out.println("Cal3 init!!");
        }

        public int minus() {
            return this.v1 - this.v2;
        }
    }

    public class InheritanceApp {

        public static void main(String[] args) {
            Cal c1 = new Cal(2, 1);
            Cal3 c3 = new Cal3(2, 1);
            System.out.println(c1.sum()); // 3
            System.out.println(c3.minus()); // 1
        }

    }

## 12. 컴파일

개발도구를 거치지 않고 컴파일 하는 방법

1. cmd
2. java 파일 경로 이동
3. javac 파일명.java

파일 실행은 java 파일명을 입력

## 13. 접근제어자

### 13.1 public, private

접근 제어자는 클래스의 맴버(변수와 메소드)들의 접근 권한을 지정한다. <br>
public : 클래스 밖에서 접근할 수 있다. <br>
private : 클래스 밖에서 접근할 수 없다.

	class A {
	    public String y(){
		return "public void y()";
	    }
	    private String z(){
		return "public void z()";
	    }
	    public String x(){
		return z();
	    }
	}
	public class AccessDemo1 {
	    public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		// 아래 코드는 오류가 발생한다.
		//System.out.println(a.z());
		
		// 하지만 같은 클래스의 함수를 이용하면 private 함수에 접근이 가능 하다.
		System.out.println(a.x()); // public void z()
	    }
	}
	
![접근제어](https://user-images.githubusercontent.com/81665608/136708203-1c432e74-1041-4cbd-b3f9-ff96cbc3c3f4.png)


### 13.2 클래스 접근 제어자

public : public를 붙이는 경우 모든 곳에서 접근이 가능하다. <br>
default : default는 접근 제어자를 붙이지 않은 경우 default가 된다.

#### 즉 접근 제어자가 public인 클래스는 다른 패키지의 클래스에서도 사용할 수 있고, default인 경우는 같은 패키지에서만 사용 가능하다.

## 14. 추상클래스(abstract)
추상 클래스는 상속을 강제하기 위한 것이다. 즉 부모 클래스에는 메소드의 시그니처만 정의해놓고 그 메소드의 실제 동작 방법은 이 메소드를 상속 받은 하위 클래스의 책임으로 위임하고 있다. <br>
클래스에 하나라도 추상함수가 있으면 그를 포함하는 클래스는 자동으로 추상 클래스가 된다.

	abstract class A{
		public abstract int b();
		// 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
		//public abstract int c(){System.out.println("Hello")}
		//추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재할 수 있다.
		public void d() {
			System.out.println("world");
		}
	}
	class B extends A{
		public int b() { // 부모에 있던 추상 메소드를 자식에서 정의 해줘야함
			return 1;
		}
	}
	public class AbstractApp {

		public static void main(String[] args) {

			// A obj = new A(); // 추상클래스는 반드시 상속해서 사용해야 한다.
			B obj = new B(;)

		}

	}
	
## 15. final
실행되는 과정에서 한 번 값이 정해진 이후에는 변수 내의 값이 바뀌지 않도록 하는 규제

### 15.1 final 변수

	class Calculator {
		static final double PI =3.14; // 변경 불가
		int left, right;

		public void setOprands(int left, int right) {
			this.left = left;
			this.right = right;
			//Calculator.PI = 6;
		}

		public void sum() {
			System.out.println(this.left + this.right);
		}
		public void avg() {
			System.out.println((this.left + this.right) / 2);
		}
	}

	public class FinalApp {

		public static void main(String[] args) {

			Calculator c1 = new Calculator();
			System.out.println(c1.PI);
			// Calculator.PI = 10; // 에러발생

		}

	}

### 15.2 final 함수
final 메소드는 final 변수 만큼 사용 빈도가 높지는 않다. 아래의 코드는 final 메소드 b를 상속하려하기 때문에 오류가 발생한다.

	class A{
		final void b(){}
	}
	class B extends A{
		void b(){}
	}
	
### 15.3 final 클래스
아래 코드는 final 클래스를 상속하려하고 있다. 따라서 오류가 발생한다.

	final class C{
		final void b(){}
	}
	class D extends C{}


## 16. interface

어떤 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면 그 객체는 반드시 인터페이스의  메소드들을 구현해야 한다. 만약 인터페이스에서 강제하고 있는 메소드를 구현하지 않으면 이 에플리케이션은 컴파일 조차 되지 않는다.<br>
인터페이스의 멤버는 무조건 public이다. <br>

	interface I1 {
		public void x();
	}
	interface I2 {
		public void z();
	}

	class A implements I1, I2 {
		public void x() { // interface 구현
		}
		public void z() { // interface 구현
		}
	}

인터페이스에 필드를 작성하는 것은 public final stati이 암시됨<br>


인터페이스는 상속이 된다.

	interface I3{
		public void x();
	}

	interface I4 extends I3{
		public void z();
	}

	class B implements I4{
		public void x(){}
		public void z(){}   
	}

사용 용도의 예는 클래스를 구현하는 사람과 그 클래스를 이용해서 프로그램을 구성하는 두명의 사람이 인터페이스를 통해 서로 클래스 구현 구성을 약속하는 용도로 사용한다.

먼저 아래와 같이 인터페이스를 구성하기로 약속했을 때

	public interface Calculatable {
		public void setOprands(int first, int second, int third);
		public int sum();
		public int avg();
	}
	
클래스를 구현하는 사람은 아래와 같이 코드를 작성해서 인터페이스에 있는 함수를 구현하고

	class Calculator implements Calculatable {
		int first, second, third;

		public void setOprands(int first, int second, int third) {
			this.first = first;
			this.second = second;
			this.third = third;

		}

		public int sum() {
			return this.first + second + third;
		}

		public int avg() {

			return this.sum() / 2;
		}

	}

만들어진 클래스를 이용해서 프로그램을 구성하는 사람은 아래와 같이 코드를 작성해서 가짜 클래스 CalculatorDummy 를 구현 후 프로그램을 구성한 뒤에 클래스를 구현하는 사람이 작업을 완료하면 main 부분CalculatorDummy 대신 Calculator로 바꾸어만 주면 된다.

	class CalculatorDummy implements Calculatable {
		public void setOprands(int first, int second, int third) {

		}

		public int sum() {
			return 60;
		}

		public int avg() {
			return 20;
		}
	}

	public class InterfaceApp {

		public static void main(String[] args) {

			CalculatorDummy c = new CalculatorDummy();
			c.setOprands(10, 20, 30);
			System.out.println("합 : " + c.sum());
			System.out.println("평균 : " + c.avg());

		}

	}

이런식으로 인터페이스를 사용하면 사용하는 함수나 매개변수 등을 고정적으로 사용하므로 작업을 나누더라도 실수를 줄일 수 있다.

## 17. 다형성(Polymorphism)
다형성의 가장 좋은 예는 overloading이다.

class O{
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
}

public class PolymorphismOverloadingApp {

	public static void main(String[] args) {
		O o = new O();
		// 각각의 데이터 형태에 따라 함수를 찾아 실행
		o.a(1);;
		o.a("one");
	}
	
}

다음은 클래스 다형성의 예이다. <br>
자식 클래스에 부모 클래스의 함수가 있다면 자식 클래스의 인스턴스 데이터 타입을 부모 클래스로 지정할 수 있다.

	class A{
		public String x() {return "A";}
	}

	class B extends A{
		public String x() {return "B";}
		public String y() {return "y";}
	}
	public class PolymorphismApp1 {

		public static void main(String[] args) {
			// 자식클래스의 타입을 부모 타입으로 인스턴스 생성을 할 수 있다.
			A obj = new B(); // 클래스 B를 인스턴스 생성했지만 데이터 타입은 A이다.
			System.out.println(obj.x());

			// 자식의 타입이 부모이므로 부모에 없는 함수는 실행 안됨
			// 그러므로 밑에 코드는 오류
			//System.out.println(obj.y());

		}
	}

이것의 사용 예로는 다음 코드를 참조

	public static void excute(Calculator cal) {
			System.out.println("실행결과");
			cal.run();
		}
		public static void main(String[] args) { 
		
			// CalculatorDecoPlus, CalculatorDecoMinus 타입을 각각 만들면
			// excute함수를 오버로드해서 2개의 함수를 만들어야 하지만
			// 데이터 타입을 통일함으로서 excute 함수 하나로 실행가능  
			
			Calculator c1 = new CalculatorDecoPlus();
			c1.setOprands(10, 20);

			Calculator c2 = new CalculatorDecoMinus();
			c2.setOprands(10, 20);

			excute(c1);
			excute(c2);
		}
		
다음은 인터페이스의 다형성이다.<br>
어떤 클래스가 가진 기능 중 어떤 특정한 인터페이스의 기능만 사용하고자 한다면 데이터 타입을 그 인터페이스로 지정을 해서 그 멤버를 제외한 나머지 것들은 신경쓰지 않고 사용할 수 있다. 즉 필요한 인터페이스 기능만 제공

	interface I1{
		public String A();
	}
	interface I2{
		public String B();
	}

	class C implements I1, I2 {
		public String A() {
			return "A";
		}
		public String B() {
			return "B";
		}
	}

	public class PolymorphismInterfaceApp {

		public static void main(String[] args) {

			C obj = new C();
			// 어떤 클래스가 어떤 인터페이스를 사용했다면
			// 인스턴스 데이터 타입을 인터페이스로 할 수 있다.
			I1 objI1 = new C();
			I2 objI2 =new C();

			obj.A();
			obj.B();

			objI1.A();
			//objI1.B(); I1에 B() 없음 -> 실행안됨

			//objI2.A(); I2에 A() 없음 ->실행안됨
			objI2.B();
		}

	}

인터페이스 다형성의 예제

	interface father{}
	interface mother{}
	interface programmer{
		public void coding();
	}
	interface believer{}
	class Steve implements father, programmer, believer{
		public void coding(){
			System.out.println("fast");
		}
	}
	class Rachel implements mother, programmer{
		public void coding(){
			System.out.println("elegance");
		}
	}
	public class Workspace{
		public static void main(String[] args){
			programmer employee1 = new Steve();
			programmer employee2 = new Rachel();

			employee1.coding();
			employee2.coding();
		}
	}

## 18. 예외 처리(Exception Handling)
예외(Exception)란 프로그램을 만든 프로그래머가 상정한 정상적인 처리에서 벗어나는 경우에 이를 처리하기 위한 방법이다.

### 18.1 예외처리 기본 방식

	class Calculator {
		int left, right;

		public void setOprands(int left, int right) {
			this.left = left;
			this.right = right;
		}

		public void divide() {
			try { // 오류가 예측되는 부분에 try로 감싼다.
				System.out.print("계산결과는 ");
				System.out.print(this.left / this.right);
				System.out.print(" 입니다.");
			} catch (Exception e) { // 오류가 발생하면 catch라는 함수에 오류 정보(예외클래스 인스턴스)를 매개변수로 넘겨줌 
				System.out.println("오류가 발생했습니다 : " + e.getMessage());
				// 계산결과는 오류가 발생했습니다 : / by zero
			}
		}
	}

	public class ExceptionApp1 {
		public static void main(String[] args) {
			Calculator c1 = new Calculator();
			c1.setOprands(10, 0);
			c1.divide();
		}
	}

### 18.2 뒷 수습
getMessage() : 간단한 오류 메세지 출력<br>
toString() : 구체적인 오류 메세지 출력<br>
printStackTrace() : 오류에 대한 모든 메세지 출력

	class Calculator{
		int left, right;
		public void setOprands(int left, int right){
			this.left = left;
			this.right = right;
		}
		public void divide(){
			try {
				System.out.print("계산결과는 ");
				System.out.print(this.left/this.right);
				System.out.print(" 입니다.");
			} catch(Exception e){
				System.out.println("\n\ne.getMessage()\n"+e.getMessage());
				System.out.println("\n\ne.toString()\n"+e.toString());
				System.out.println("\n\ne.printStackTrace()");
				e.printStackTrace();
			}
			System.out.println("Divide End");  // 오류가 나더라도 catch를 실행 후 그 다음 로직을 실행함
		}
	} 
	public class ExceptionApp1 {
		public static void main(String[] args) {
			Calculator c1 = new Calculator();
			c1.setOprands(10, 0);
			c1.divide();
			/*
			계산결과는 

			e.getMessage()
			/ by zero


			e.toString()
			java.lang.ArithmeticException: / by zero


			e.printStackTrace()
			java.lang.ArithmeticException: / by zero
				at Calculator.divide(ExceptionApp1.java:11)
				at ExceptionApp1.main(ExceptionApp1.java:25)
			Divide End
			*/
		}
	}

### 18.3 다양한 예외들
catch는 조건문의 else if처럼 여러 개의 catch를 하나의 try 구문에서 사용할 수 있다.<br>
아래와 같이 여러가지 예외가 발생 가능한 경우가 있을 때 오류 종류에 따라 다른 코드를 실행하고 싶은 경우 사용한다. 

	class A {
		private int[] arr = new int[3];

		A() {
			arr[0] = 0;
			arr[1] = 10;
			arr[2] = 20;
		}

		public void z(int first, int second) {
			try {
				System.out.println(arr[first] / arr[second]);			
			} catch(ArithmeticException e) {
				System.out.println("ArithmeticException e");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException e");
			} catch(Exception e) {
				System.out.println("Exception e");
			}
		}
	}

	public class ExcepitonApp2 {
		public static void main(String[] args) {
			A a = new A();
			a.z(1, 0);  // 전달하는 인자에 따라서 여러가지 오류 발생
		}
	}

### 18.4 Finally
예외와 상관없이 실행한다. 주로 데이터베이스의 접속을 끊어줄 때 사용한다. 로직이 정상적으로 실행 되거나 예외가 발생해도 데이터베이스와 접속을 끊어야 하기 때문이다.

	try {
		System.out.println(arr[first] / arr[second]);
	} catch(ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndexOutOfBoundsException");
	} catch(ArithmeticException e){
		System.out.println("ArithmeticException");
	} catch(Exception e){
		System.out.println("Exception");
	} finally { // 데이터베이스
		System.out.println("finally");
	}

### 18.5 throws
throws는 다음 사용자에게 예외처리를 넘기는 것이다.

	class C{
		void run() throws IOException{ // 예상되는 예외처리를 다음 사용자에게 강제
			BufferedReader bReader = null;
			String input = null;
			bReader = new BufferedReader(new FileReader("out.txt")); // FileReader에서 FileNotFoundException 발생가능
			input = bReader.readLine();  // readLine에서 IOException 발생가능
			System.out.println(input); 
		}
	}
	class D{
		void run() throws FileNotFoundException, IOException{ // 예상되는 예외처리를 다음 사용자에게 강제
			C c = new C();
			c.run();	
		}
	}
	public class ExceptionThrowApp {
		public static void main(String[] args) { // 예외처리를 넘겨 받았으니 여기서 예외처리
			 D d = new D();
			 try {
				d.run();
			} catch (FileNotFoundException e) {		
				e.printStackTrace();
			} catch (IOException e) {	
				e.printStackTrace();
			}
		}   
	}

### 18.5 예외 직접 발생 시키기

throw 구문을 통해 직접 예외를 직접 발생 시킬 수 있다. 

	class Calculator1{
		int left, right;
		public void setOprands(int left, int right){
			this.left = left;
			this.right = right;
		}
		public void divide(){
			if(right == 0) {
				// throw 구문으로 예외 종류를 생성	
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
				// throw 구문 다음 코드는 실행이 안된다.	
			}
			try {
				System.out.print("계산결과는 ");
				System.out.print(this.left/this.right);
				System.out.print(" 입니다.");
			} catch(Exception e){
				System.out.println("\n\ne.getMessage()\n"+e.getMessage());
				System.out.println("\n\ne.toString()\n"+e.toString());
				System.out.println("\n\ne.printStackTrace()");
				e.printStackTrace();
			}
		}
	} 
	public class MadeExceptionApp {
		public static void main(String[] args) {
			Calculator1 c1 = new Calculator1();
			c1.setOprands(10, 0);        	
			try {
				c1.divide();        	
			}catch (ArithmeticException e) {
				System.out.println(e.getMessage()); // 0으로 나눌 수 없습니다.
			}

		}
	}

![예외종류](https://user-images.githubusercontent.com/81665608/137113213-0a745e12-c64b-4984-b37b-da4280769f26.png)

### 18.6 예외 직접 만들기
checked 예외 : RuntimeException을 제외한 Exception의 하위 클래스 <br>
unchekced 예외 : RuntimeException의 하위 클래스<br>

예외를 만들기 전에 해야 할 것은 자신의 예외를 checked로 할 것인가? unchecked로 할 것인가를 정해야 한다.<br>

API 쪽에서 예외를 던졌을 때 API 사용자 쪽에서 예외 상황을 복구 할 수 있다면 checked 예외를 사용한다. checked 예외는 사용자에게 문제를 해결할 기회를 주는 것이면서 예외처리를 강제하는 것이다. <br>

사용자가 API의 사용방법을 어겨서 발생하는 문제거나 예외 상황이 이미 발생한 시점에서 그냥 프로그램을 종료하는 것이 덜 위험 할 때 unchecked를 사용한다. 

	class DivdeException extends Exception{ // checked는 Exception을 상속 받고
											// unchecked 는 RuntimeException을 상속 받는다.
		int left, right;
		DivdeException(){					
			super();
		}
		DivdeException(String message, int left, int right){
			super(message);
			this.left = left;
			this.right =  right;
		}
		void getNumberInfo(){ // 이런식으로 오류 정보를 더 구체적으로 명시해서 함수 구현 가능
			System.out.println("left : " + this.left);
			System.out.println("right : " + this.right);
		}
	}
	class Calculator2{
		int left, right;
		public void setOprands(int left, int right){
			this.left = left;
			this.right = right;
		}
		public void divide() throws DivdeException{
			if(right == 0) {
				// DivdeException는 Exception을 상속 받았기 때문에 checked
				throw new DivdeException("0으로 나눌 수 없습니다.", this.left, this.right);	
			}
			System.out.print(this.left/this.right);
		}
	} 
	public class MadeExceptionApp3 {
		public static void main(String[] args) {
			Calculator2 c2 = new Calculator2();
			c2.setOprands(10, 0);        	
			try {
				c2.divide();        	
			}catch (DivdeException e) {
				System.out.println(e.getMessage()); // 0으로 나눌 수 없습니다.
				e.getNumberInfo();
			}      
		}
	}
## 19. Object클래스
기본적으로 클래스는 Object 클래스의 후손이다. 그 중 사용하는 몇가지 방법이다.

### 19.1 equals 구현

	class Student{
		String name;
		Student(String name){
			this.name = name;
		}
		public boolean equals(Object obj) { // Object는 모든 객체의 부모
			Student _obj = (Student)obj;  // 부모를 자식으로 형변환 해줘야 타입 변경 가능
			return name == _obj.name;
		}
	}

	class ObjectDemo {
		public static void main(String[] args) {
			Student s1 = new Student("egoing");
			Student s2 = new Student("egoing");
			System.out.println(s1.equals(s2));
		}
	}

더 많은 equals을 구현하고 싶으면 hashCode를 공부할 것

### 19.2 finalize
객체가 소멸될 때 호출되기로 약속된 메소드이다. 어떤 인스턴스를 만들었고, 그것을 변수에 담았다. 그런데 그 변수를 사용하는 곳이 더 이상 없다면 이 변수와 변수에 담겨있는 인스턴스는 더 이상 메모리에 머물고 있을 필요가 없는 것이다. 이 작업을 자동화한 것을 가비지 컬렉션이라고 한다.

### 19.3 clone
객체 복제

	class Student implements Cloneable{ // 인스턴스로 Cloneable를 추가해야한다. 복제 가능한 상태라는걸 알려준다.
		String name;
		Student(String name){
			this.name = name;
		}
		// Object에 있는 clone는 protected 이므로 다른 패키지에서 사용하려면 상속 받아 재정의 해서 사용
		// protected는 다른 패키지에서 사용할 수 없기 때문에 다른 패키지에서 사용 시 오버라이드 해줘야함
		public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
	}
	
	class ObjectDemo {

		public static void main(String[] args) {
			Student s1 = new Student("kim");
			try {
				Student s2 = (Student)s1.clone(); // 리턴값이 Object이므로 형변환
				System.out.println(s1.name); // kim
				System.out.println(s2.name); // kim
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
	}

## 20. enum

열거형은 연관된 값들을 저장한다. 또 그 값들이 변경되지 않도록 보장한다. 뿐만 아니라 열거형 자체가 클래스이기 때문에 열거형 내부에 생성자, 필드, 메소드를 가질 수 있어서 단순히 상수가 아니라 더 많은 역할을 할 수 있다.

- 코드가 단순해진다.
- 인스턴스 생성과 상속을 방지한다.
- 키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다.

### 20.1 기본형태

	/*
	class fruit{  // 변수의 값이 겹치는 경우를 방지하기 위한 독립적인 값을 가지는 방법
		public static final Fruit APPLE = new Fruit();
		public static final Fruit PEACH = new Fruit();
		public static final Fruit BANANA = new Fruit();
	}
	*/
	// 열거형
	enum Fruit { // 위에 fruit와 같다.
		APPLE, PEACH, BANANA
	}

	enum Company {
		GOOGLE, APPLE, ORACLE
	}

	public class EnumApp {

		public static void main(String[] args) {

			Fruit type = Fruit.APPLE;

			switch (type) { // switch문이 APPLE 타입이 Fruit라는 것을 안다.
			case APPLE:
				System.out.println(57 + " kcal");
				break;
			case PEACH:
				System.out.println(34 + "kcal");
				break;
			case BANANA:
				System.out.println(93 + " kcal");
			}

		}

	}
	
### 20.2 enum 활용

	enum Fruit { 
		APPLE("red"), PEACH("pink"), BANANA("yellow"); // 인자가 생성자 매개변수로 들어감
		private String color;

		public String getColor() {
			return this.color;
		}
		Fruit(String color) { // 변수가 3개이므로 3번 실행됨
			System.out.println("Call Constructor " + this);
			this.color =  color;
		}
	}

	enum Company {
		GOOGLE, APPLE, ORACLE
	}

	public class EnumApp {
		public static void main(String[] args) {
		
			Fruit type = Fruit.APPLE;
			switch (type) { // switch문이 APPLE 타입이 Fruit라는 것을 안다.
			case APPLE:
				System.out.println(57 + " kcal, color : "+Fruit.APPLE.getColor()); // 57 kcal, color : red
				break;
			case PEACH:
				System.out.println(34 + "kcal, color : "+Fruit.PEACH.getColor());
				break;
			case BANANA:
				System.out.println(93 + " kcal, color : "+Fruit.BANANA.getColor());
				
			}
		}
	}
	
	for(Fruit2 f : Fruit2.values()) {
			System.out.println(f);
		}
				//APPLE
				//PEACH
				//BANANA
	}

## 21. 참조(reference)

변수에 담겨있는 데이터가 기본형이면 그 안에는 실제 데이터가 들어있고, 기본형이 아니면 변수 안에는 데이터에 대한 참조 방법이 들어있다고 할 수 있다. 변수가 값을 가리킨다. 가리키는 변수가 많아도 저장된 데이터의 크기는 커지지 않으므로 메모리 저장을 줄일 수 있다. 

	class A{
		public int id;
		A(int id){
		this.id = id;
		}
	}
	public class ReferenceApp {

		public static void runValue(){
		int a = 1;
		int b = a; // 1 이 복사해서 b에 담김
		b = 2;
		System.out.println("runValue, "+a);  
		}

		public static void runReference(){
		A a = new A(1); // 인스턴스 같은 경우 a에 담기는게 아니라 인스턴스 위치를 가리킴 (참조 reference)
		A b = a;        // b도 a가 가리키는 인스턴스를 가리킴(참조 reference)
		b.id = 2;      // 그래서 b를 바꾸면 인스턴스 자체를 바꿈
		System.out.println("runReference, "+a.id); 
		}

		public static void main(String[] args) {
		runValue(); // 1
		runReference(); // 2
		}

	}

## 21.1 참조 데이터 형과 매개 변수

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


## 22. Generic

제네릭은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법

	class Person<T>{ // 제네릭은 <T>로 구현
	    public T info;
	}

	public class GenericApp {

	    public static void main(String[] args) {
		Person<String> p1 = new Person<String>(); // <String> 데이터 타입을 String로 정하겠다.
		Person<StringBuilder> p2 = new Person<StringBuilder>(); // <StringBuilder> 데이터 타입을 StringBuilder로 정하겠다.
	    }
	}

### 22.1 사용이유

 컴파일 언어의 기본은 모든 에러는 컴파일이 발생할 수 있도록 유도해야 한다는 것이다. 런타임은 실제로 애플리케이션이 동작하고 있는 상황이기 때문에 런타임에 발생하는 에러는 항상 심각한 문제를 초래할 수 있기 때문이다. 타입에 따른 에러를 컴파일 단계에서 발생할 수 있도록 하기위해 제네릭을 사용한다.

- 컴파일 단계에서 오류가 검출된다.
- 중복의 제거와 타입 안전성을 동시에 추구할 수 있게 되었다.

### 22.2 기본예제

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
	}
	public class GenericApp2 {
		public static void main(String[] args) {
			// EmployeeInfo의 새로운 객체를 EmployeeInfo 타입의 인자를 새로운 Person2 객체에 전달해서 인스턴스 p1 생성
			Person2<EmployeeInfo> p1 = new Person2<EmployeeInfo>(new EmployeeInfo(1));
			// p1 객체에 있는  info를 EmployeeInfo 타입의 ei에게도 참조시킴
			EmployeeInfo ei = p1.info;
			System.out.println(ei.rank); // 1
		}
	 }

### 22.3 복수의 제네릭

클래스 내에서 여러개의 제네릭을 사용하는 경우

	class EmployeeInfo{
		public int rank;
		EmployeeInfo(int rank){ this.rank = rank; }
	}
	class Person<T, S>{ // 제네릭은 참조형 데이터만 올 수 있다.
						// 원시 데이터 형을 사용할 경우 래퍼(wrapper) 클래스를 사용해서 우회해야 한다.
		public T info;
		public S id;
		Person(T info, S id){ 
			this.info = info; 
			this.id = id;
		}
	}
	public class GenericDemo {
		public static void main(String[] args) {
			Integer id = new Integer(1) // wrapper 클래스 사용
			Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id);
		}
	}

### 22.4 제네릭 생략, 함수 단위 제네릭

	class EmployeeInfo{
		public int rank;
		EmployeeInfo(int rank){ this.rank = rank; }
	}
	class Person2<T>{
		public T info;
		Person2(T info){ this.info = info; }
		
		public <U> void printInfo(U info) { // 함수 단위에서 제네릭
			System.out.println(info);
		}
	}
	public class GenericApp2 {
		public static void main(String[] args) {	
			Person2 p1 = new Person2(new EmployeeInfo(1)); // 자바는 제네릭을 표기하지 않아도 어떤 타입인지 안다. (생략가능)
			EmployeeInfo ei = (EmployeeInfo)p1.info; // 근데 직접적으로 꺼내쓸 때는 형변환 해줘야 된다.
			System.out.println(ei.rank); // 1
			// p1.<EmployeeInfo>printInfo(ei.rank) // 1
			p1.printInfo(ei.rank); // 1    함수도 제네릭 생략가능
		}
	 }

### 22.5 제네릭의 제한

제네릭에 올 수 있는 타입을 제한할 수 있다. 모든 데이터 타입이 오는 것을 막고 필요한것만 사용

<strong>extends</strong>

	abstract class Info {
		public abstract int getLevel();
	}

	class EmployeeInfo2 extends Info { // Info를 상속받음
		public int rank;

		EmployeeInfo2(int rank) {
			this.rank = rank;
		}

		public int getLevel() {
			return this.rank;
		}
	}

	class Person3<T extends Info> { // Info와 그 자식의 데이터 타입만 제네릭으로 들어올 수 있다.
		public T info;

		Person3(T info) {
			this.info = info;
			info.getLevel(); // <T extends Info>를 하면 내부에 EmployeeInfo2 안에있는 함수도 사용 가능
		}
	}

	public class GenericApp3 {
		public static void main(String[] args) {
			Person3 p1 = new Person3(new EmployeeInfo2(1));
			// 밑에 문장은 에러
			// Person3<String> p2 = new Person3<String>("부장");
		}
	}

extends는 상속(extends)뿐 아니라 구현(implements)의 관계에서도 사용할 수 있다.

	interface Info {
		public abstract int getLevel();
	}

	class EmployeeInfo2 implements Info { // Info를 상속받음
		public int rank;

		EmployeeInfo2(int rank) {
			this.rank = rank;
		}

		public int getLevel() {
			return this.rank;
		}
	}

	class Person3<T extends Info> { // Info와 그 자식의 데이터 타입만 제네릭으로 들어올 수 있다.
		public T info;

		Person3(T info) {
			this.info = info;
			info.getLevel(); // <T extends Info>를 하면 내부에 EmployeeInfo2 안에있는 함수도 사용 가능
		}
	}

	public class GenericApp3 {
		public static void main(String[] args) {
			Person3 p1 = new Person3(new EmployeeInfo2(1));
			// 밑에 문장은 에러
			// Person3<String> p2 = new Person3<String>("부장");
		}
	}

## 23. Collection framework

배열의 몇가지 불편한 점을 보완하는 프레임워크<br>

컬렉션즈 프래임워크라는 것은 다른 말로는 컨테이너라고도 부른다. 즉 값을 담는 그릇이라는 의미이다. 그런데 그 값의 성격에 따라서 컨테이너의 성격이 조금씩 달라진다. 자바에서는 다양한 상황에서 사용할 수 있는 다양한 컨테이너를 제공하는데 이것을 컬렉션즈 프래임워크라고 부른다.

![컬렉션즈](https://user-images.githubusercontent.com/81665608/137536633-efab992f-3152-48c1-8876-75bcc6fd4776.png)

### 23.1 ArrayList

배열의 크기를 미리 지정하지 않고 사용 가능

	public class ArrauListApp {

		public static void main(String[] args) {
		
			// 일반 배열을 사용할 경우
			String[] arrayObj = new String[2];
			arrayObj[0] = "one";
			arrayObj[1] = "two";
			//arrayObj[2] = "three"; // 크기를 넘어서는 범위는 오류 발생

			for(int i = 0; i<arrayObj.length; i++) {
				System.out.println(arrayObj[i]);
			}
			
			// ArrayList 를 사용할 경우
			
			ArrayList al1 = new ArrayList();
			al1.add("one");  // ArrayList는 Object 형태로 데이터를 받음
			al1.add("two");
			al1.add("three");
			for(int i = 0; i < al1.size(); i++ ) {
				String value = (String)al1.get(i); // Object 타입을 저장할 형태로 형변환
				System.out.println(value);
			}

			ArrayList<String> al2 = new<String> ArrayList();
			al2.add("one");  
			al2.add("two");
			al2.add("three");
			for(int i = 0; i < al2.size(); i++ ) {
				String value = al2.get(i);  // 제네릭으로 타입을 지정하면 형변환을 안해도 된다.
				System.out.println(value);
			}	
		}
	}
	
### 23.2 iterator
메소드 iterator는 인터페이스 Collection에 정의되어 있다. 인터페이스 iterator는 아래 3개의 메소드를 구현하도록 강제하고 있는데 각각의 역할은 아래와 같다.

- boolean hasNext() =읽을 요소가 남아있는지 체크
- Object next() = 다음요소를 읽어온다. 
- remove() = next()로 읽어온 요소삭제한다. 반드시 next로 먼저 읽어와야한다(선택적 기능)

1. iterator은 일회용이다. 
2. List와 set 둘 다 사용가능

	public class IteratorApp {

		public static void main(String[] args) {
			
			// ArrayList나 Hashset는 Collection 인터페이스를 구현하고 있기 때문에
			// ArrayList나 Hashset 데이터 타입으로 Collection 가능하다.
			Collection<Integer> A = new ArrayList<Integer>();

			A.add(2);
			A.add(1);
			A.add(3);
			
			// Iterator 는 인터페이스다.
			// Iterator는 Collection 아래 그 기능을 강제하기 때문에 상관없이 실행가능
			Iterator<Integer> hi = A.iterator();

			while(hi.hasNext()) {
				System.out.println(hi.next());
			}
		}
	}
	
### 23.3 List와 Set의 차이점

set은 중복을 허용하지 않는다.

	public class ListSetApp {

		public static void main(String[] args) {
			ArrayList<String> al = new ArrayList<String>();
			al.add("one");
			al.add("two");
			al.add("two");
			al.add("three");
			al.add("three");
			al.add("five");
			Iterator ai = al.iterator();
			while(ai.hasNext()){
				System.out.println(ai.next());
				/*
					one
					two
					two
					three
					three
					five
				 */
			}

			HashSet<String> hs = new HashSet<String>();
			hs.add("one");
			hs.add("two");
			hs.add("two");
			hs.add("three");
			hs.add("three");
			hs.add("five");
			Iterator hi = hs.iterator();
			while(hi.hasNext()){
				System.out.println(hi.next());
				/*
					one
					two
					three
					five
				 */
			}     
		}
	}

### 23.4 set

Set은 한국어로 집합이라는 뜻이다. 여기서의 집합이란 수학의 집합과 같은 의미다.

값이 순서가 보장되지 않는다.

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

### 23.5 Map

Map 컬렉션은 key와 value의 쌍으로 값을 저장하는 컬렉션이다.

<strong>기본형태</strong>

Map에서 데이터를 추가할 때 사용하는 API는 put이다. put의 첫번째 인자는 값의 key이고, 두번째 인자는 key에대한 값이다. key를 이용해서 값을 가져올 수 있다.

	HashMap<String, Integer> a = new HashMap<String, Integer>();
		  // key     value
	a.put("one", 1);
	a.put("two", 2);
	a.put("three", 3);

	System.out.println(a.get("one")); // 1
	System.out.println(a.get("two")); // 2
	System.out.println(a.get("three")); // 3


<strong>map의 열거</strong>

메소드 entrySet은 Map의 데이터를 담고 있는 Set을 반환한다. 반환한 Set의 값이 사용할 데이터 타입은 Map.Entry이다. Map.Entry는 인터페이스인데 아래와 같은 API를 가지고 있다.

- getKey
- getValue

위의 API를 이용해서 Map의 key, value를 조회할 수 있다.

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
		// 기본형태
		static void iteratorUsingForEach(HashMap map) {
			Set<Map.Entry<String, Integer>> entries = map.entrySet();
			for (Map.Entry<String, Integer> entry : entries) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		// Iterator를 사용하는경우
		static void iteratorUsingIterator(HashMap map){
			Set<Map.Entry<String, Integer>> entries = map.entrySet();
			Iterator<Map.Entry<String, Integer>> i = entries.iterator();
			while(i.hasNext()){
				Map.Entry<String, Integer> entry = i.next();
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}


<strong>정렬</strong>

Collections.sort()

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








