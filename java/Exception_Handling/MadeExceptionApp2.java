import java.io.IOException;

class E {
	void throwArithmeticException() { // ArithmeticException�� ����ó���� �������� �ʴ´�.
		throw new ArithmeticException();
	}

	void throwIOException1() { // IOException �� ����ó���� �����Ѵ�.
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

