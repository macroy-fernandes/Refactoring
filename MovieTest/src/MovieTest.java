import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MovieTest {
	Movie movie;

	@Before
	public void setUp() throws Exception {
		movie = new Movie("abc",MovieType.NEWRELEASE);
	}

	@Test
	public void testGetCharge() {
		//fail("Not yet implemented");
		assertEquals(200,movie.getCharge("abc",2));
	}

}
