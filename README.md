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
