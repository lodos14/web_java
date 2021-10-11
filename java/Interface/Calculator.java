
class Calculator implements Calculatable {
	int first, second, third;
	
	public void setOprands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
		
	}

	public int sum() {
		return this.first + second + third;
	}

	public int avg() {
		
		return this.sum() / 2;
	}
	
}
