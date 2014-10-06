package array1;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Logic1Test {

	@Test
	public void testCigarParty() {
		assertThat(Logic1.cigarParty(30, false), is(false));
		assertThat(Logic1.cigarParty(50, false), is(true));
		assertThat(Logic1.cigarParty(70, true), is(true));
	}

	@Test
	public void testDateFashion() {
		assertThat(Logic1.dateFashion(5, 10), is(2));
		assertThat(Logic1.dateFashion(5, 2), is(0));
		assertThat(Logic1.dateFashion(5, 5), is(1));
	}

	@Test
	public void testSquirrelPlay() {
		assertThat(Logic1.squirrelPlay(70, false), is(true));
		assertThat(Logic1.squirrelPlay(95, false), is(false));
		assertThat(Logic1.squirrelPlay(95, true), is(true));
	}

	@Test
	public void testCaughtSpeeding() {
		assertThat(Logic1.caughtSpeeding(60, false), is(0));
		assertThat(Logic1.caughtSpeeding(65, false), is(1));
		assertThat(Logic1.caughtSpeeding(65, true), is(0));
	}
	
//	@Test
//	public void testStuff() {
//		Logic1.stuff(true, true, true, true);
//		Logic1.stuff(false, true, true, false);
//	}
	
	@Test
	public void testSortaSum() {
		assertThat(Logic1.sortaSum(3,4), is(7));
		assertThat(Logic1.sortaSum(9,4), is(20));
		assertThat(Logic1.sortaSum(10,11), is(21));
	}
	

	@Test
	public void testAlarmClock() {
		assertThat(Logic1.alarmClock(1, false), is("7:00"));
		assertThat(Logic1.alarmClock(5, false), is("7:00"));
		assertThat(Logic1.alarmClock(0, false), is("10:00"));
		assertThat(Logic1.alarmClock(0, true), is("off"));
		assertThat(Logic1.alarmClock(1, true), is("10:00"));
	}

}
