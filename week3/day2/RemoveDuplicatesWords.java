package week3.day2;

import static org.testng.Assert.assertEquals;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {
public static void main(String[] args) {
	
	StringBuilder stringBuilder = new StringBuilder();
	String text = "We learn java basics as part of java sessions in java week1";
	
	String[] res=text.split(" ");
	
	Set<String> fnl = new LinkedHashSet<String>();
	for(String val: res)
	{
	fnl.add(val);
	}
		
	System.out.println("Set -> " + fnl);
}
}
