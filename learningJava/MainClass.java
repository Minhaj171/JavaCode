package learningJava;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
			
		//StudentDetails student = new StudentDetails(101, "minhaj", "Daffodil");
		ArrayList<StudentDetails> arraylist = new ArrayList<StudentDetails>();
		
		arraylist.add(new StudentDetails(108, "minhaj", "Daffodil"));
		arraylist.add(new StudentDetails(102, "bisal", "stamfford"));
		arraylist.add(new StudentDetails(101, "radhio", "buet"));
		arraylist.add(new StudentDetails(109, "avi", "eastwest"));
		
		Collections.sort(arraylist);
		
		for (StudentDetails str : arraylist) {
			System.out.println(str);
		}
	}
	
}
