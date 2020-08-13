import java.util.*;
import java.util.Scanner;
class Stock
{
	public static void main(String args[])
	{
		System.out.print("Hello World");
		Scanner sc = new Scanner(System.in);
		
		int product_id[];
		String name[];
		int qty[];
		int price[];
		int i=0,num=0;
		
		System.out.println("Enter 1 for adding stock");
		System.out.println("Enter 0 to exit");
		
		int choice=sc.nextInt();
			
		if(choice==1)
		{
			System.out.println("You have entered one");
			System.out.println("Enter the number of products you wants to enter: ");
			num=sc.nextInt();
			
			product_id = new int[num];
			name= new String[num];
			price = new int[num];
			qty = new int[num];

			for(i = 0;i < num; i++)
			{
				System.out.println("Enter product_id: ");
				product_id[i]=sc.nextInt();

				System.out.println("Enter Product Name: ");
				name[i]=sc.next();

				System.out.println("Enter Product Quantity: ");
				qty[i]=sc.nextInt();

				System.out.println("Enter Price of Product: ");
				price[i]=sc.nextInt();
			}	

			System.out.println("Product Id " + "Name " + "Quantity" + "Price");
			for(i = 0;i < num;i++)
			{
				System.out.println(product_id[i] + "     " + name[i] + "     " + price[i] + "     " + qty[i]);
			}

		}	
		else
			System.exit(0);

	
	}

}
