package samplejavaprogram;

public class Polymorphismeg {
	void info()
	{
		System.out.println("Today is Thurs");
	}
	void info(String ashwin)
	{
	System.out.println(ashwin);
	}
	public static void main(String[] args) {
		Polymorphismeg poly= new Polymorphismeg();
		poly.info();
		poly.info("ash win");
	}

}
