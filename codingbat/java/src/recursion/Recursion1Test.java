package recursion;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Recursion1Test {

	@Test
	public void testCigarParty() {
		assertThat(Recursion1.factorial(1), is(1));
		assertThat(Recursion1.factorial(2), is(2));
		assertThat(Recursion1.factorial(3), is(6));
		assertThat(Recursion1.factorial(4), is(24));
		assertThat(Recursion1.factorial(5), is(120));
	}

	@Test
	public void testBunnyEars() {
		assertThat(Recursion1.bunnyEars(0), is(0));
		assertThat(Recursion1.bunnyEars(1), is(2));
		assertThat(Recursion1.bunnyEars(2), is(4));
	}

}
