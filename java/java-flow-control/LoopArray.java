
public class LoopArray {

	public static void main(String[] args) {

		String[] users = new String[3];
		users[0] = "kim";
		users[1] = "pack";
		users[2] = "oh";

		for (int i = 0; i < users.length; i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}

	}

}
