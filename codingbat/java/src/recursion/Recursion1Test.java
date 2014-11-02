package recursion;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Recursion1Test {

	@Test
	public void testCigarParty() {
		assertThat( Recursion1.factorial( 1 ), is( 1 ) );
		assertThat( Recursion1.factorial( 2 ), is( 2 ) );
		assertThat( Recursion1.factorial( 3 ), is( 6 ) );
		assertThat( Recursion1.factorial( 4 ), is( 24 ) );
		assertThat( Recursion1.factorial( 5 ), is( 120 ) );
	}

	@Test
	public void testBunnyEars() {
		assertThat( Recursion1.bunnyEars( 0 ), is( 0 ) );
		assertThat( Recursion1.bunnyEars( 1 ), is( 2 ) );
		assertThat( Recursion1.bunnyEars( 2 ), is( 4 ) );
		assertThat( Recursion1.bunnyEars( 3 ), is( 6 ) );
		assertThat( Recursion1.bunnyEars( 4 ), is( 8 ) );
		assertThat( Recursion1.bunnyEars( 5 ), is( 10 ) );
		assertThat( Recursion1.bunnyEars( 6 ), is( 12 ) );
	}

	@Test
	public void testFibonacci() {
		assertThat( Recursion1.fibonacci( 0 ), is( 0 ) );
		assertThat( Recursion1.fibonacci( 1 ), is( 1 ) );
		assertThat( Recursion1.fibonacci( 2 ), is( 1 ) );
		assertThat( Recursion1.fibonacci( 3 ), is( 2 ) );
		assertThat( Recursion1.fibonacci( 4 ), is( 3 ) );
		assertThat( Recursion1.fibonacci( 5 ), is( 5 ) );
	}

	@Test
	public void testBunnyEars2() {
		assertThat( Recursion1.bunnyEars2( 0 ), is( 0 ) );
		assertThat( Recursion1.bunnyEars2( 1 ), is( 2 ) );
		assertThat( Recursion1.bunnyEars2( 2 ), is( 5 ) );
		assertThat( Recursion1.bunnyEars2( 3 ), is( 7 ) );
		assertThat( Recursion1.bunnyEars2( 4 ), is( 10 ) );
		assertThat( Recursion1.bunnyEars2( 5 ), is( 12 ) );
		assertThat( Recursion1.bunnyEars2( 6 ), is( 15 ) );
	}

	@Test
	public void testTriangle() {
		assertThat( Recursion1.triangle( 0 ), is( 0 ) );
		assertThat( Recursion1.triangle( 1 ), is( 1 ) );
		assertThat( Recursion1.triangle( 2 ), is( 3 ) );
		assertThat( Recursion1.triangle( 3 ), is( 6 ) );
		assertThat( Recursion1.triangle( 4 ), is( 10 ) );
		assertThat( Recursion1.triangle( 5 ), is( 15 ) );
	}

	@Test
	public void testSumDigits() {
		assertThat( Recursion1.sumDigits( 126 ), is( 9 ) );
		assertThat( Recursion1.sumDigits( 49 ), is( 13 ) );
		assertThat( Recursion1.sumDigits( 12 ), is( 3 ) );
	}

	@Test
	public void testCount7() {
		assertThat( Recursion1.count7( 717 ), is( 2 ) );
		assertThat( Recursion1.count7( 7 ), is( 1 ) );
		assertThat( Recursion1.count7( 123 ), is( 0 ) );
	}

	@Test
	public void testCount8() {
		assertThat( Recursion1.count8( 10 ), is( 0 ) );
		assertThat( Recursion1.count8( 8 ), is( 1 ) );
		assertThat( Recursion1.count8( 818 ), is( 2 ) );
		assertThat( Recursion1.count8( 8818 ), is( 4 ) );
	}

	@Test
	public void testPowerN() {
		assertThat( Recursion1.powerN( 3, 1 ), is( 3 ) );
		assertThat( Recursion1.powerN( 3, 2 ), is( 9 ) );
		assertThat( Recursion1.powerN( 3, 3 ), is( 27 ) );
		assertThat( Recursion1.powerN( 4, 3 ), is( 64 ) );
		assertThat( Recursion1.powerN( 4, 4 ), is( 256 ) );
	}

	@Test
	public void testCountX() {
		assertThat( Recursion1.countX( "xxhixx" ), is( 4 ) );
		assertThat( Recursion1.countX( "xhixhix" ), is( 3 ) );
		assertThat( Recursion1.countX( "hi" ), is( 0 ) );
		assertThat( Recursion1.countX( "xyouxarexcooxx" ), is( 5 ) );
	}

	@Test
	public void testCountHi() {
		assertThat( Recursion1.countHi( "xxhixx" ), is( 1 ) );
		assertThat( Recursion1.countHi( "xhixhix" ), is( 2 ) );
		assertThat( Recursion1.countHi( "hi" ), is( 1 ) );
		assertThat( Recursion1.countHi( "xyouxarexcooxx" ), is( 0 ) );
	}

	@Test
	public void testChangeXY() {
		assertThat( Recursion1.changeXY( "codex" ), is( "codey" ) );
		assertThat( Recursion1.changeXY( "xxhixx" ), is( "yyhiyy" ) );
		assertThat( Recursion1.changeXY( "xhixhix" ), is( "yhiyhiy" ) );
	}
}
