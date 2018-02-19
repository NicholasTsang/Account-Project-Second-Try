
public class AccountCreation {

public void createAccount(String firstNames, String lastNames, String accountNumbers) {
	
	String firstName = firstNames;
	String lastName = lastNames;
	String accountNumber = accountNumbers;
	Service details = new Service();
	
	details.names(firstName,lastName,accountNumber);
	
}


}
