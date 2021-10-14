
enum Fruit2 { 
	APPLE("red"), PEACH("pink"), BANANA("yellow"); 
	private String color;
	
	public String getColor() {
		return this.color;
	}
	Fruit2(String color) { 
		System.out.println("Call Constructor " + this);
		this.color =  color;
	}
}

enum Company2 {
	GOOGLE, APPLE, ORACLE
}

public class EnumApp2 {

	public static void main(String[] args) {

		for(Fruit2 f : Fruit2.values()) {
			System.out.println(f);
		}
				//APPLE
				//PEACH
				//BANANA
	}

}
