package samplejavaprogram;

public class Constructorexample {
	void constructor () {
		System.out.println("Hi");
	}
	 Constructorexample()
	 {
		 int a = 1;
		 System.out.println(a);
	 }
	public static void main(String[] args) {
		Constructorexample con =new Constructorexample();
con.constructor();
	}

}
