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

### 4.1 자바에서 코드 작성 시 문자열이 밑줄로 빠지는 경우 아래와 같이 작성해야 한다. 

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
>, <, ==, <=, >=, != <br>

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

## 8. 컴파일

개발도구를 거치지 않고 컴파일 하는 방법

1. cmd
2. java 파일 경로 이동
3. javac 파일명.java

파일 실행은 java 파일명을 입력

## 9. 인스턴스

클래스의 현재 생성된 오브젝트를 가리킨다.

    PrintWriter p1 = new PrintWriter("result1.txt");  //  p1 이라는 새로운 인스턴스 생성
    p1.write("Hello 1");
    p1.close();

    PrintWriter p2 = new PrintWriter("result2.txt");  // p2 라는 새로운 인스턴스 생성
    p2.write("Hello 2");
    p2.close();
        
이것의 쉬운 사용 예로는 사람의 이름, 몸무게, 키 등의 인적 사항을 가진 객체의 생성이 있다.

