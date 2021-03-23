package classTasks;

class InvalidCountryException extends RuntimeException
{
	public InvalidCountryException(String msg) 
	{
		super(msg);
	}
	
}
public class UserRegistration 
{
	void registerUser(String username,String userCountry)
	{
		if(userCountry.equalsIgnoreCase("India"))
			System.out.println("User registration done successfully");
	    else
	    	throw new InvalidCountryException("User outside india cannot be registered");
		
	}
	public static void main(String[] args) 
	{
		UserRegistration ur=new UserRegistration();
		//ur.registerUser("sneha","usa");
		ur.registerUser("sneha","india");
	}

}
