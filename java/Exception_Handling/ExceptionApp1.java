
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
        System.out.println("Divide End");
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
      	 */
    }
}
