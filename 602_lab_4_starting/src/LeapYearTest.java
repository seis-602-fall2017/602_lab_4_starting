import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LeapYearTest
{
	@Before
	public void runThisBeforeEachTest()
	{
		StdOut.println ("before the test...");
	}
	
	@After
	public void runThisAfterEachTest()
	{
		StdOut.println("after the test...");
	}
	
	@Test
	public void testThisYear2017()
	{
		assertFalse(LeapYear.isLeapYear(2017));
	}

	@Test
	public void testLastYear2016()
	{
		assertTrue(LeapYear.isLeapYear(2016));
	}
}
