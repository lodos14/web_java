import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {

		// 인자, argument
		printTwoTimesA("a", "-");
		System.out.println(twoTimes("a", "*"));
		printTwoTimesA("a", "&");
		printTwoTimesA("b", "!");
		writeFileTwoTimes("a", "-");
	}
	public  static String twoTimes(String text, String delimiter) {
		String out;
		out = delimiter + "\n";
		out = out + text + "\n";
		out = out + text;
		
		return out;
	}

	// 매개변수, parameter
	public static void printTwoTimesA(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delimiter + "\n");
		fw.write(text + "\n");
		fw.write(text + "\n");
		fw.close();
	}
}
