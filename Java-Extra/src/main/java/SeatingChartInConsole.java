import java.util.Objects;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class SeatingChartInConsole 
{
	static String[] name;
	static int[] number;
	static int numberForAskedNamesOrNumbers = 0;
	static int totalStudents = 0;
	static boolean askedStudentNumber = false;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int n;
/**
 * 									all comments refer to lines below them
 * 
 * 
 * 													 Todo:
 */
		
		testingArea();
		namesOrNumbers();
		
		
	}
	public static void start()
	{
		System.out.print("Are each of your desks 'single' or are they in 'groups'? \n");
		String seatingType = input.nextLine();		
		if (Objects.equals(seatingType, "single"))
			single();
		if (Objects.equals(seatingType, "groups"))
		{
			System.out.print("How many students would you like be in each group?");	 
			remainderPreCheck();
		}
		else
		{
			System.out.print("Please type 'groups' if your desks are in groups or 'single' if your desks are single. Press enter to retry.\n");
			input.nextLine();
			main(name);
		}
	}
	public static void namesOrNumbers() 
	{
		
		//if(doneNamesOrNumbers() == true)
		//{
		System.out.print("Would you like to 'type' each of the students names or have a 'number' assigned for each of them? \n");
		String typeNames = input.nextLine();
		if(Objects.equals(typeNames, "type"))
		{
			typeNames();
		}
		if(Objects.equals(typeNames, "number"))
		{
			asignNumber();
		}
		else
		{
			System.out.print("Please type 'type' if you want to type each students name please type 'number' if you want each student to be assigned a number that you can choose to assign however you choose. press enter to continue.\n");
			input.nextLine();
			namesOrNumbers();
		}
		//}
	}
	
	public static void single()
	{
		
	}
	
	
	public static void groups()
	{
				
	}
	
	public static boolean okayForSmallGroup()
	{
		System.out.println("there will be a group of " + remainder() + " is that 'okay' or would you rather 'distribute' those students into other groups?");
		int smallGroupOK = input.nextInt();
		if (Objects.equals(smallGroupOK, "okay"))
		{
			groups();
			return true;			
		}
		if (Objects.equals(smallGroupOK, "distribute"))
		{
			groups();
			return false;			
		}
		else
		{
			System.out.println("please input 'okay' to make a small group or 'distribute' to distribute them over multiple groups");
			okayForSmallGroup();
			return null != null;
		}
	}
	
	public static int numberOfStudents()
	{
		
		if (askedStudentNumber == false)
		{
			askedStudentNumber = true;
			System.out.print("how many students are in your class?");
			totalStudents = input.nextInt();
		}
		return totalStudents;
	}
	
	public static int studentsInEachGroup() 
	{
		int studentsInEachGroup = input.nextInt();
		return studentsInEachGroup;
	}
	
	public static int remainder()
	{
		int remainder = numberOfStudents() % studentsInEachGroup();
		return remainder;
		
	}
	public static void remainderPreCheck()
	{
		if(remainder() != 0 && remainder() > 1)
		{
			okayForSmallGroup();
		}
		if(remainder() == 0)
		{
			groups();	
		}
	}
	public static void asignNumber() 
	{
		int i = 1 ;
		for(int n = 0; n < numberOfStudents(); n++)
		{
			number[i] = i;
			i++;
		}
		start();
		
	}
	public static int returnNumberForTypeNames()
	{
		return returnNumberForTypeNames() + 1;
	
	}
	public static void typeNames() 
	{	
		for(int n = 0;	n < numberOfStudents();n++ )
		{
			name[n] = input.nextLine();
		}
		start();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private final static void testingArea()
	{
		
		
	}
	
}