package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList list=new ArrayList();
		List<Integer> oddNum=new ArrayList();
		List<String> names=new ArrayList();
		
		oddNum.add(23);
		oddNum.add(54);
		oddNum.add(67);
		oddNum.add(55);
		oddNum.add(66);
		oddNum.add(42);
		oddNum.add(27);
		oddNum.add(89);
		
		for (int i:oddNum)
		{
			
			if(i%2 !=0)
			{
				System.out.println(i);
			}
		}
		oddNum.set(5, 18);
		oddNum.add(88);
		oddNum.remove(55);
		oddNum.clear();
		Collections.sort(oddNum);
		
		names.add("Arun");
		names.add("Deepa");
		names.add("Maria");
		names.add("Deepa");
		names.add("Sharmila");
		names.add("Muthu");
		names.add("Chinrasu");
		
		for(String nms:names)
		{
			if(nms.startsWith("M"))
			{
				System.out.println(nms);
			}
		}
		
		Collections.reverse(names);
		System.out.println("--Reversed--");
		System.out.println(names);
	
	}

}
