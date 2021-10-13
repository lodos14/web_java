
class DivdeException extends Exception{ // checked�� Exception�� ��� �ް�
										// unchecked �� RuntimeException�� ��� �޴´�.
	int left, right;
	DivdeException(){					
		super();
	}
	DivdeException(String message, int left, int right){
		super(message);
		this.left = left;
		this.right =  right;
	}
	void getNumberInfo(){ // �̷������� ���� ������ �� ��ü������ ����ؼ� �Լ� ���� ����
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
			throw new DivdeException("0���� ���� �� �����ϴ�.", this.left, this.right);	
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
			System.out.println(e.getMessage()); // 0���� ���� �� �����ϴ�.
			e.getNumberInfo();
		}      
    }
}
