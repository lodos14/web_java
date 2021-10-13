
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
class Calculator2 {
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide() throws DivdeException{
    	if(right == 0) {	
			throw new DivdeException("0으로 나눌 수 없습니다.", this.left, this.right);	
    	}
    	System.out.print(this.left/this.right);
    }
    
} 
public class MadeExceptionApp3 {
    public static void main(String[] args) throws CloneNotSupportedException  {
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
