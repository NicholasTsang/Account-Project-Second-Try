
public class Project_main {

	public static void main (String Args[]) {
		AccountCreation Account = new AccountCreation();
		Service details = new Service();
		Account.createAccount("Jane", "Doe", "jd001"); 
		int number = 1;
		details.accountRetrieve(number);
		System.out.println("Hello World");
		
		details.jsonRetrieve();
		
		
	}
}
