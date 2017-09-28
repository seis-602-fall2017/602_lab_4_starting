
public class LeapYear
{
	public static boolean isLeapYear(int year)
	{
		return false;
	}

	public static void main(String[] args)
	{
		StdOut.print("Enter an integer year: ");
		int year = StdIn. readInt();
		
		StdOut.printf("Is %d a leap year? %b\n", year, isLeapYear(year));
	}

}
