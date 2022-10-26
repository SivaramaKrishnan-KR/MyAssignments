package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {
public static void main(String[] args) {
	Set<String> names=new HashSet();
	
	names.add("Siva");
	names.add("Bala");
	names.add("Abi");
	names.add("Vetri");
	names.add("gowtham");
	names.add("Santhosh");
	names.add("Madhan");
	
	System.out.println(names);
	
	//convert set to list
	/*list - list, set - set
	 * set - list list - set
	 * 
	 * 
	 */
	//List<String> list=new ArrayList<String>(names);
	List<String> list=new ArrayList<String>();
	list.addAll(names);
}
}
