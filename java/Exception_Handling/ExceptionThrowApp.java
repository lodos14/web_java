import java.io.*;


class C{
	
	void run() throws FileNotFoundException, IOException{ // ����Ǵ� ����ó���� ���� ����ڿ��� ����
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();   
        System.out.println(input); 
    }
}
class D{
    void run() throws FileNotFoundException, IOException{
        C c = new C();
        c.run();	
    }
}
public class ExceptionThrowApp {
    public static void main(String[] args) {
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