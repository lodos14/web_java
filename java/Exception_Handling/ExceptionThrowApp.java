import java.io.*;


class C{
	
	void run() throws FileNotFoundException, IOException{ // 예상되는 예외처리를 다음 사용자에게 강제
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