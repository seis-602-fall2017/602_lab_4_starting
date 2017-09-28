import static org.junit.Assert.*;
import org.junit.Test;

public class YesterdayTest
{

	@Test
	public void test_today()
	{
		assertEquals("09/27/2017", Yesterday.yesterday(9, 28, 2017));
	}

	@Test
	public void test_new_years_2017()
	{
		assertEquals("12/31/2016", Yesterday.yesterday(1, 1, 2017));
	}

}
