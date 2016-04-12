import java.util.Scanner;
import javax.swing.JOptionPane;
public class floatConcept1 {

	public static void main(String[] args) {
		//all comments refer to lines below them
		//Initialize a scanner named "input"
		Scanner input = new Scanner(System.in);
		
	//	System.out.print("Input skin float (wear value) average. ");
	//	double average = input.nextDouble();
		
		
		/**
		 * todo list
		 * add in methods
		 * comments
		 */
		
		double total = 0;
		double average = 0;
		//assigns the numeric identifier word for future prints
		String[] numWord = {  "first", "second","third","fourth", "fifth","sixth","seventh","eigth","ninth","tenth"};
		//lets values be assigned to 10 different skinFloats
		String[] skinName = new String[20];
		double[] skinFloat = {1,2,3,4,5,6,7,8,9,10};	
		for(int timesDone = 0; timesDone < 10; timesDone++)
	{
		//asks for the user to enter the float for the nth skin
		 System.out.println("enter the float for the " + numWord[timesDone] + " skin you will trade up.");
		//gets the user input for 10 skins
		 skinFloat[timesDone] =  input.nextDouble();	
		//sets the total from the input skin float added to to the previous total value
		 total = skinFloat[timesDone] + total;
		 
	}
		//gets the average by dividing the total by 10
		average = total / 10;
		//asks the user to input the total number of received skins
		System.out.print("Input Number of Possible Recieved Skins");
		int numPossibleRecieved = input.nextInt();
		//initialize i before the for loop so it can be accessed later and in turn shortening the total code
		int i = 0;
		//Initializing max so it can be accessed outside the for loop
		double[] max = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};		//creating an array for min so it can have multiple values assigned to it
		double[] min = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		//creating an array for range so it can have multiple values assigned to it
		double[] range = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		//a for loop....
		for( i = 0; i < numPossibleRecieved; i++)
		{
			System.out.println("enter the " + numWord[i] + " possible recieved skins name");
			 skinName[i] = input.nextLine();
			//asks user for the min float of the nth item
			System.out.println("Input min possible float of " + numWord[i] + " possible recieved skin. ");
			//assigns the input value to the nth min term
			 min[i] = input.nextDouble();
			//asks user for the max float of the nth item
			System.out.println("input max possible float of " + numWord[i] + " possible recieved skin. ");
			//assigns the input value to the nth max term
			 max[i] = input.nextDouble();
			 //gets the range for each skin by assigning it to an array value
			 range[i] = max[i] - min[i];
			 
		}
			//initializes calcSkinFloat outside the for loop for ease of future access
			double[] calcSkinFloat = {1,2,3,4,5,6,7,8,9,10};
			//a for loop....
			for(int n = 0; n < numPossibleRecieved; n++)
			{
				//calculates the skinfloat for each possible recieved skin
				calcSkinFloat[n] = (average * range[n]) + min[n];
				System.out.println("If You get the " + skinName[n] + " it's float will be " + calcSkinFloat[n]);		
			}
		}

}
