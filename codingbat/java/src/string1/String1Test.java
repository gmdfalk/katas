package string1;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class String1Test {

	@Test
	public void testStringTimes() {
		assertThat(String1.helloName("Bob"), is("Hello Bob"));
		assertThat(String1.helloName("Alice"), is("Hello Alice"));
		assertThat(String1.helloName("X"), is("Hello X"));
	}
}
