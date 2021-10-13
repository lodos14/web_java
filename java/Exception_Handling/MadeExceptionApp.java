
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
