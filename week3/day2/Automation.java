package week3.day2;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleLangauge ml= new MultipleLangauge();
		System.out.println("------MultipleLangauge Class with both the interfaces------");
		ml.Java();
		ml.JavaScript();
		ml.python();
		ml.Ruby();
		ml.Selenium();
		
		
		TestTool tt=new MultipleLangauge();
		System.out.println("-----TestTool Interface list--------");
		tt.Selenium();
		
		Language l=new MultipleLangauge();
		System.out.println("-----List of Languages--------");
		l.Java();
		l.JavaScript();
		l.Ruby();
	}

}
