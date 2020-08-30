package samplejavaprogram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Hashseteg {

	public static void main(String[] args) {
		Set<String> var = new HashSet<String>(); 
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
