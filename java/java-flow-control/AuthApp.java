import javax.swing.JOptionPane;

public class AuthApp {

	public static void main(String[] args) {
		
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
		
	}

}
