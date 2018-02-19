import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Service {
	private static int counter = 0;
	private static HashMap<Integer, String> Hmap = new HashMap<Integer, String>();
	public void names (String firstName, String lastName, String accountNumber) {
		String FullDetails = firstName+" "+lastName+" "+accountNumber;
		counter++;
		
		
		Hmap.put(counter, FullDetails);
		
		
	}
	
	public void accountRetrieve (int number) {
		int Number =number;
		 String Retrieve= Hmap.get(Number);
		 System.out.println(Retrieve);
	}
	//it is code
	public void jsonRetrieve () {
		 Gson JsonMap = new GsonBuilder().create();
		 String PrintJsonMap = JsonMap.toJson(Hmap);
		 System.out.println(PrintJsonMap);
		
	}
}
