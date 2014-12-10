package codingbat.ap;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class AP1Test {

	@Test
	public void testScoresIncreasing() {
		assertThat(AP1.scoresIncreasing(new int[] { 1, 3, 4 }), is(true));
		assertThat(AP1.scoresIncreasing(new int[] { 1, 3, 2 }), is(true));
		assertThat(AP1.scoresIncreasing(new int[] { 1, 1, 4 }), is(true));
	}

	@Test
	public void testScores100() {
		assertThat(AP1.scores100(new int[] { 1, 100, 100 }), is(true));
		assertThat(AP1.scores100(new int[] { 1, 100, 99, 100 }), is(false));
		assertThat(AP1.scores100(new int[] { 100, 1, 100, 100 }), is(true));
	}

	@Test
	public void testScoresClump() {
		assertThat(AP1.scoresClump(new int[] { 3, 4, 5 }), is(true));
		assertThat(AP1.scoresClump(new int[] { 3, 4, 6 }), is(false));
		assertThat(AP1.scoresClump(new int[] { 1, 3, 5, 5 }), is(true));
	}

	@Test
	public void testScoresAverage() {
		assertThat(AP1.scoresAverage(new int[] { 2, 2, 4, 4 }), is(4));
		assertThat(AP1.scoresAverage(new int[] { 4, 4, 4, 2, 2, 2 }), is(4));
		assertThat(AP1.scoresAverage(new int[] { 3, 4, 5, 1, 2, 3 }), is(4));
	}

	@Test
	public void testWordsCount() {
		assertThat(AP1.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 1),
				is(2));
		assertThat(AP1.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 3),
				is(1));
		assertThat(AP1.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 4),
				is(0));

	}

	@Test
	public void testWordsFront() {
		assertThat(AP1.wordsFront(new String[] { "a", "b", "c", "d" }, 1),
				is(new String[] { "a" }));
		assertThat(AP1.wordsFront(new String[] { "a", "b", "c", "d" }, 2),
				is(new String[] { "a", "b" }));
		assertThat(AP1.wordsFront(new String[] { "a", "b", "c", "d" }, 3),
				is(new String[] { "a", "b", "c" }));
	}

	@Test
	public void testWordsWithoutList() {
		assertThat(
				AP1.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 1),
				is(Arrays.asList("bb", "ccc")));
		assertThat(
				AP1.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 3),
				is(Arrays.asList("a", "bb", "b")));
		assertThat(
				AP1.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 4),
				is(Arrays.asList("a", "bb", "b", "ccc")));
	}

	@Test
	public void testHasOne() {
		assertThat(AP1.hasOne(10), is(true));
		assertThat(AP1.hasOne(22), is(false));
		assertThat(AP1.hasOne(220), is(false));
	}

	@Test
	public void testDividesSelf() {
		assertThat(AP1.dividesSelf(128), is(true));
		assertThat(AP1.dividesSelf(12), is(true));
		assertThat(AP1.dividesSelf(120), is(false));
	}

	@Test
	public void testCopyEvens() {
		assertThat( AP1.copyEvens( new int[] { 3, 2, 4, 5, 8 }, 2 ), is( new int[] { 2, 4 } ) );
		assertThat( AP1.copyEvens( new int[] { 3, 2, 4, 5, 8 }, 3 ), is( new int[] { 2, 4, 8 } ) );
		assertThat( AP1.copyEvens( new int[] { 6, 1, 2, 4, 5, 8 }, 3 ), is( new int[] { 6, 2, 4 } ) );
	}

	@Test
	public void testCopyEndy() {
		assertThat( AP1.copyEndy( new int[] { 9, 11, 90, 22, 6 }, 2 ), is( new int[] { 9, 90 } ) );
		assertThat( AP1.copyEndy( new int[] { 9, 11, 90, 22, 6 }, 3 ), is( new int[] { 9, 90, 6 } ) );
		assertThat( AP1.copyEndy( new int[] { 12, 1, 1, 13, 0, 20 }, 2 ), is( new int[] { 1, 1 } ) );
	}

	@Test
	public void testMatchUp() {
		assertThat( AP1.matchUp( new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "xx", "bb" } ), is( 1 ) );
		assertThat( AP1.matchUp( new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "b", "bb" } ), is( 2 ) );
		assertThat( AP1.matchUp( new String[] { "aa", "bb", "cc" }, new String[] { "", "", "ccc" } ), is( 1 ) );
	}

	@Test
	public void testScoreUp() {
		assertThat( AP1.scoreUp( new String[] { "a", "a", "b", "b" }, new String[] { "a", "c", "b", "c" } ), is( 6 ) );
		assertThat( AP1.scoreUp( new String[] { "a", "a", "b", "b" }, new String[] { "a", "a", "b", "c" } ), is( 11 ) );
		assertThat( AP1.scoreUp( new String[] { "a", "a", "b", "b" }, new String[] { "a", "a", "b", "b" } ), is( 16 ) );
	}

	@Test
	public void testWordsWithout() {
		assertThat( AP1.wordsWithout( new String[] { "a", "b", "c", "a" }, "a" ), is( new String[] { "b", "c" } ) );
		assertThat( AP1.wordsWithout( new String[] { "a", "b", "c", "a" }, "b" ), is( new String[] { "a", "c", "a" } ) );
		assertThat( AP1.wordsWithout( new String[] { "a", "b", "c", "a" }, "c" ), is( new String[] { "a", "b", "a" } ) );
	}

	@Test
	public void testScoresSpecial() {
		assertThat( AP1.scoresSpecial( new int[] { 12, 10, 4 }, new int[] { 2, 20, 30 } ), is( 40 ) );
		assertThat( AP1.scoresSpecial( new int[] { 20, 10, 4 }, new int[] { 2, 20, 10 } ), is( 40 ) );
		assertThat( AP1.scoresSpecial( new int[] { 12, 11, 4 }, new int[] { 2, 20, 31 } ), is( 20 ) );
	}

	@Test
	public void testSumHeights() {
		assertThat( AP1.sumHeights( new int[] { 5, 3, 6, 7, 2 }, 2, 4 ), is( 6 ) );
		assertThat( AP1.sumHeights( new int[] { 5, 3, 6, 7, 2 }, 0, 1 ), is( 2 ) );
		assertThat( AP1.sumHeights( new int[] { 5, 3, 6, 7, 2 }, 0, 4 ), is( 11 ) );
	}

	@Test
	public void testSumHeights2() {
		assertThat( AP1.sumHeights2( new int[] { 5, 3, 6, 7, 2 }, 2, 4 ), is( 7 ) );
		assertThat( AP1.sumHeights2( new int[] { 5, 3, 6, 7, 2 }, 0, 1 ), is( 2 ) );
		assertThat( AP1.sumHeights2( new int[] { 5, 3, 6, 7, 2 }, 0, 4 ), is( 15 ) );
	}

	@Test
	public void testBigHeights() {
		assertThat( AP1.bigHeights( new int[] { 5, 3, 6, 7, 2 }, 2, 4 ), is( 1 ) );
		assertThat( AP1.bigHeights( new int[] { 5, 3, 6, 7, 2 }, 0, 1 ), is( 0 ) );
		assertThat( AP1.bigHeights( new int[] { 5, 3, 6, 7, 2 }, 0, 4 ), is( 1 ) );
	}

	@Test
	public void testUserCompare() {
		assertThat( AP1.userCompare( "bb", 1, "zz", 2 ), is( -1 ) );
		assertThat( AP1.userCompare( "bb", 1, "aa", 2 ), is( 1 ) );
		assertThat( AP1.userCompare( "bb", 1, "bb", 1 ), is( 0 ) );
	}

	@Test
	public void testMergeTwo() {
		assertThat( AP1.mergeTwo( new String[] { "a", "c", "z" }, new String[] { "b", "f", "z" }, 3 ), is( new String[] { "a", "b", "c" } ) );
		assertThat( AP1.mergeTwo( new String[] { "a", "c", "z" }, new String[] { "c", "f", "z" }, 3 ), is( new String[] { "a", "c", "f" } ) );
		assertThat( AP1.mergeTwo( new String[] { "f", "g", "z" }, new String[] { "c", "f", "g" }, 3 ), is( new String[] { "c", "f", "g" } ) );
	}
}
