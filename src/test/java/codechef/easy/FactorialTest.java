package codechef.easy;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		assertThat(Factorial.createFactorial(5), is(120L));
		assertThat(Factorial.countZeroes(120), is(1));
		assertThat(Factorial.main(6, new int[] {3,60,100,1024,23456,8735373}), is ( new int[] {0,14,24,253,5861,2183837}));
	}
}
