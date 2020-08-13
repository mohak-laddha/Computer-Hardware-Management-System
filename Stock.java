import java.util.*;
import java.util.Scanner;
class Stock
{
	public static void main(String args[])
	{
		System.out.print("Hello World");
		Scanner in = new Scanner(System.in);
		
		String product_id[];
		String name[];
		int qty[];
		int Price[];
		
		System.out.println("Enter 1 for adding stock");
		System.out.println("Enter 0 to exit");
	
	
		int choice=in.nextInt();
	
		
		if(choice==1)
		{
			System.out.println("You have entered one");
			System.out.println("Enter the number of products you wants to enter: ");
			

		}	
		else
			System.exit(0);

	
	}

}