import static org.junit.Assert.*;

import org.junit.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Project_TDD_Red {
	private int NameCounter = 0;
	@Before
	public void setup() {
		
		AccountCreation Account = new AccountCreation();
		
		Account.createAccount("joe", "Doe", "jd001"); 
		Account.createAccount("aetj", "Doe", "jd001"); 
		Account.createAccount("joe", "Doe", "jd001"); 
		Account.createAccount("trwtrt", "Doe", "jd001"); 
		Account.createAccount("joe", "Doe", "jd001"); 
		Account.createAccount("joe", "Doe", "jd001"); 
		
		
	}
	

	@Test
	public void createAccountTest() {
		Service details = new Service();
		int number = 1;
		details.accountRetrieve(number);
		
	}
	
	@Test
		public void jsonRetrieveTest() {
		 Gson JsonMap = new GsonBuilder().create();
		 String PrintJsonMap = JsonMap.toJson(Hmap);
		 System.out.println(PrintJsonMap);
		
	}
	
	@Test
		
		public void nameCounterTest() {
		String Name =  (Hmap.get(NameCounter)).subString(0,3);
		 for (int j = 0; j >= NameCounter; j++) {
			if (Name.equals("joe")) {
			Name =  (Hmap.get(NameCounter)).subString(0,3);
				NameCounter++;
				
			}
			
		}
		System.out.println(NameCounter);
	}

	@After 
	public void cleanup() {
		
	}
}
