package logic;

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

	@Test
	public void testAlarmClock() {
		assertThat(Logic1.alarmClock(1, false), is("7:00"));
		assertThat(Logic1.alarmClock(5, false), is("7:00"));
		assertThat(Logic1.alarmClock(0, false), is("10:00"));
		assertThat(Logic1.alarmClock(1, true), is("10:00"));
		assertThat(Logic1.alarmClock(0, true), is("off"));
	}

	@Test
	public void testSortaSum() {
		assertThat(Logic1.sortaSum(3, 4), is(7));
		assertThat(Logic1.sortaSum(9, 4), is(20));
		assertThat(Logic1.sortaSum(10, 11), is(21));
	}
	
	@Test
	public void testLove6() {
		assertThat(Logic1.love6(6,4), is(true));
		assertThat(Logic1.love6(4,5), is(false));
		assertThat(Logic1.love6(1,5), is(true));
	}
	
	@Test
	public void testIn1To10() {
		assertThat(Logic1.in1To10(5, false), is(true));
		assertThat(Logic1.in1To10(11, false), is(false));
		assertThat(Logic1.in1To10(11, true), is(true));
	}
	
	@Test
	public void testSpecialEleven() {
		assertThat(Logic1.specialEleven(22), is(true));
		assertThat(Logic1.specialEleven(23), is(true));
		assertThat(Logic1.specialEleven(24), is(false));
	}
	
	@Test
	public void testMore20() {
		assertThat(Logic1.more20(20), is(false));
		assertThat(Logic1.more20(21), is(true));
		assertThat(Logic1.more20(22), is(true));
	}
	
	@Test
	public void testOld35() {
		assertThat(Logic1.old35(3), is(true));
		assertThat(Logic1.old35(10), is(true));
		assertThat(Logic1.old35(15), is(false));
	}
	
	@Test
	public void testLess20() {
		assertThat(Logic1.less20(18), is(true));
		assertThat(Logic1.less20(19), is(true));
		assertThat(Logic1.less20(20), is(false));
	}
	
	@Test
	public void testNearTen() {
		assertThat(Logic1.nearTen(12), is(true));
		assertThat(Logic1.nearTen(17), is(false));
		assertThat(Logic1.nearTen(19), is(true));
	}
	
	@Test
	public void testTeenSum() {
		assertThat(Logic1.teenSum(3,4), is(7));
		assertThat(Logic1.teenSum(10,13), is(19));
		assertThat(Logic1.teenSum(13,2), is(19));
	}
	
	@Test
	public void testAnswerCell() {
		assertThat(Logic1.answerCell(false, false, false), is(true));
		assertThat(Logic1.answerCell(false, false, true), is(false));
		assertThat(Logic1.answerCell(true, false, false), is(false));
	}
	
	@Test
	public void testTeaParty() {
		assertThat(Logic1.teaParty(6,8), is(1));
		assertThat(Logic1.teaParty(3,8), is(0));
		assertThat(Logic1.teaParty(20,6), is(2));
	}
	
	@Test
	public void testFizzString() {
		assertThat(Logic1.fizzString("fig"), is("Fizz"));
		assertThat(Logic1.fizzString("dib"), is("Buzz"));
		assertThat(Logic1.fizzString("fib"), is("FizzBuzz"));
	}
}
