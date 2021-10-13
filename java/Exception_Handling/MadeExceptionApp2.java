import java.io.IOException;

class E {
	void throwArithmeticException() { // ArithmeticException는 예외처리를 강제하지 않는다.
		throw new ArithmeticException();
	}

	void throwIOException1() { // IOException 는 예외처리를 강제한다.
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void throwIOException2() throws IOException {
		throw new IOException(); //
	}
}

