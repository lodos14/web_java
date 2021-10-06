import javax.swing.JOptionPane;

public class AuthApp2 {

	public static void main(String[] args) {
		
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
		
	}

}
