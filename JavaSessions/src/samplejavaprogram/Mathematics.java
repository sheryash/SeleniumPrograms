package samplejavaprogram;

public class Mathematics {
	void add() {
	int A = 5 ;
	int B = 10;
	int C = A+B ;
	   System.out.println(C);
	}
	void sub() {
		int A = 100 ;
		int B = 50;
		int C = A-B ;
		System.out.println(C);
	}
	void mul() {
		int A = 3 ;
		int B = 50;
		int C = A*B ;
		System.out.println(C);
	}
	public static void main(String[] args) {
        System.out.println("today is tuesday");
        Mathematics mat=new Mathematics(); 
        mat.add();
        mat.sub();
        mat.mul();
        mat.add();
	}
}
