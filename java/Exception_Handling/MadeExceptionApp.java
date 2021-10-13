
class Calculator1{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	if(right == 0) {
    		// throw �������� ���� ������ ����	
			throw new ArithmeticException("0���� ���� �� �����ϴ�.");
			// throw ���� ���� �ڵ�� ������ �ȵȴ�.	
    	}
        try {
            System.out.print("������� ");
            System.out.print(this.left/this.right);
            System.out.print(" �Դϴ�.");
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
			System.out.println(e.getMessage()); // 0���� ���� �� �����ϴ�.
		}
        
    }
}
