
import java.io.InterruptedIOException;

/**
 * Starting code for Lab 4: ExceptionsLab
 *
 */

public class ExceptionsLab
{

	public static String indent = "";

	public static String[] STOOGES =
	{ "Larry Fine", "Moe Howard", "Curly Howard", "Shemp Howard", "Joe Besser", "'Curly' Joe DiRita", "Shemp 'Clone'" };

	public static boolean PRINTIT = true;

	public static void print(String msg)
	{
		if (PRINTIT)
			StdOut.println(msg);
	}

	public static void main(String[] args) // throws InterruptedException
	{
		PRINTIT = true; // change to see tracing output...

		print("Before call in main() => method1().");
//		try
//		{
			method1();
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//			// throw e;
//		}

		print("After return from call in main() => method1().");
	}

	public static void method1() // throws InterruptedException
	{
		print(" Inside method1(), before call to method2().");
		
		method2();
		// method3();
		// method4();
		// method5();
	
		print(" Inside method1(), after return from call to method2().");
	}

	public static void method2() // throws InterruptedException
	{
		print("  Before int division in method2().");
		int i = 1 / 1;
		print("  After int division in method2() .");

		print("  Before array index in method2().");
		print(STOOGES[2]);
		print("  After array index in method2().");

		// Thread.sleep(1000);

		// throw new Exception();
	}

	public static void method3() // throws InterruptedException
	{
		try
		{
			print("   Before int division in method3().");
			int i = 1 / 1;
			print("   After int division in method3().");

			print("   Before array index in method3().");
			print(STOOGES[2]);
			print("   After array index in method3().");

			// throw new RuntimeException("Help! I'm drowning in coffee!");
		}
		catch (ArithmeticException aex)
		{
			print("   Caught ArithmeticException in method3(): " +  aex.toString());
			// aex.printStackTrace();
			print("   Continuing...");
		}
		catch (ArrayIndexOutOfBoundsException aex)
		{
			print("   Caught ArrayIndexOutOfBoundsException in method3(): "+ aex.toString());
			// aex.printStackTrace();
			print("   Continuing...");
		}

		print("   Before method3() sleep().");
		// Thread.sleep(1000); // InterruptedException
		print("   After method3() sleep().");
	}

	public static void method4() // throws InterruptedException
	{
		try
		{
			print("    Before method4() int division.");
			int i = 1 / 1;
			print("    After method4() int division.");

			print("    Before method4() array index.");
			print(STOOGES[2]);
			print("    After method4() array index.");
		}
		catch (ArithmeticException ae)
		{
			print("    ArithmeticException in method4(): " + ae.toString());
			ae.printStackTrace();
			print("    Continuing...");
		}
		catch (ArrayIndexOutOfBoundsException aioobe)
		{
			print("    ArrayIndexOutOfBoundsException in method4(): " + aioobe);
			aioobe.printStackTrace();
			print("    Returning to caller...");

			return;
		}

		print("    Before method4() sleep().");
		// Thread.sleep(1000);
		print("    After method4() sleep().");
	}

	public static void method5() // throws InterruptedException
	{
		try
		{
			print("     Before method5() int division.");
			int i = 1 / 1;
			print("     After method5() int division.");

			print("     Before method5() array index.");
			print(STOOGES[2]);
			print("     After method5() array index.");

			// throw new RuntimeException("Can't escape finally()!!!");
		}
		catch (ArithmeticException ae)
		{
			print("     ArithmeticException in method5(): " + ae.toString());
			print("     Continuing...");
			// throw new RuntimeException("Exception handlers can throw exceptions!");
		}
		catch (ArrayIndexOutOfBoundsException aioobe)
		{
			print("     ArrayIndexOutOfBoundsException in method5(): " + aioobe);
			print("     Returning to caller...");

			return;
		}
		finally
		{
			print("      Executing finally block inside method5()...");
		}

		print("     Before method5() sleep().");
		// Thread.sleep(1000);
		print("     After method5() sleep().");
	}

}
