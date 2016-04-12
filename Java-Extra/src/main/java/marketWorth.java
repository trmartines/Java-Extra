		import java.util.Scanner;
public class marketWorth {
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter An Integer For item worth. for value in keys type zero.   ");
		double itemWorth = input.nextDouble();
		if(itemWorth == 0)
		{
			System.out.print("Type item worth in keys");
			double itemKeyWorth = input.nextDouble();
			System.out.println( itemKeyWorth * 2.5 + "is what your items $ price is");
		}
		else
		{
			System.out.print("Type 'Keys' for price in keys or 'Profit' for profit of market sell or 'Percent' for a certain percent of market price ");
			String ChooseType1 = input.next();	
			if (ChooseType1.equalsIgnoreCase("keys"))
			{
				System.out.println(itemWorth / 2.5 + " keys is 100% market price " +  (itemWorth / 2.5 * .85) + " keys is 85% market price");
			}
			else if (ChooseType1.equalsIgnoreCase("Profit"))	
			{
				System.out.println( "Your profit from selling this item would be " + itemWorth * .85);
			}
			else if (ChooseType1.equalsIgnoreCase("Percent"))
			{ 
				System.out.print( "type what percent you would like");
				double percent = input.nextDouble();
				System.out.print("%");
				System.out.println( percent + " % " + " of " + itemWorth + " is " + itemWorth * percent / 100 );
			}	
		}
		System.out.print( "Finished");				
	}
}



