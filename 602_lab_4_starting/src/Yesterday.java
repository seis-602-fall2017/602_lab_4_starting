
public class Yesterday
{
	public static String yesterday(int month, int day, int year)
	{
		int mm = month;
		int dd = day;
		int yy = year; 
		
		// insert your "day before" calcs here...
		
		String s = String.format("%02d/%02d/%4d", mm, dd, yy);
		return s;
	}

	public static void main(String[] args)
	{
		StdOut.print ("Enter int month, day, year on same line, separated by blanks: ");
		
		int m = StdIn.readInt();
		int d = StdIn.readInt();
		int y = StdIn.readInt();
		
		StdOut.printf("The day before %02d/%02d/%4d is %s.\n", m, d, y, yesterday(9, 28, 2017));

	}

}
