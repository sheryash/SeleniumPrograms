package samplejavaprogram;

import java.util.ArrayList;

public class Arraylisteg {

	public static void main(String[] args) {
    ArrayList<String> var = new ArrayList<String>() ; 
	var.add("3");
	var.add("4");
	var.add("3");
	var.add("Hi");
	var.add("Hello");
	var.add("Hello");
	for (String list:var)
	{
	System.out.println(list);
	}
}
}
