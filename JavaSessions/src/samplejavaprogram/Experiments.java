package samplejavaprogram;

public class Experiments {
	void Today()
	{
	System.out.println("Today is Wednesday");
	}
public int add(int a1, int a2)
{
	int c= a1+a2;
	return c;
}
public int sub(int b1, int b2)
{
	int d= b1-b2;
	return d;
}
	public static void main(String[] args) {
		{
		Experiments exp = new Experiments();
		exp.Today();
		int result=exp.add(1,2);
		int res = exp.sub(14, 20);
		System.out.println(result);
		System.out.println(res);

	}
	}
}
