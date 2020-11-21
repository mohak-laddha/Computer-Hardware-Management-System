package myPackage1;

import java.util.*;

class CustomException extends Exception		//userdefined exception
{	 
	public CustomException(String message)
	{
		super(message);		// call the constructor of parent Exception
	    
	  }
}

public class Login		//Class that uses above CustomException 
{	
	public void login()		//function login
	{
		Scanner sc = new Scanner(System.in);

		try
		{
		
		String pass;
		String user;

		System.out.println("Enter user name: ");
		user=sc.next();
		System.out.println("Enter password: ");
		pass =sc.next();

		if(user.equals("root") && pass.equals("toor"))
		{
 			System.out.println("Credential Accepted ");
			int i = 3;
			while (i>0)
			{
			System.out.println("Logging in " + i + " seconds");
			try
			{
				i--;
				Thread.sleep(1000L);	//thread implementation
			 }
			catch (InterruptedException e) {}

			}
		}
		else
		{
			throw new CustomException("Wrong username and password!");		// Throw an object of user defined exception 
			
		}
		}
		catch (CustomException e)
		{
			System.out.println("" + e + "Exception");		// Print the message from CustomException object
			System.out.println("Enter 0 to exit and 1 to continue: ");
			int ex = sc.nextInt();
			if (ex == 0)
			{
				System.exit(0);
			}
			else
				login();
		}
	
	}
}  