package imperativ;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TagDesJahres {

	  public static boolean isLeap( int year ) {
	    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	  }

	  // Month von 1 bis 12, nicht 0 bis 11!
	  public static int tagDesJahres( int tag, int monat, int jahr ) {
	    return (isLeap( jahr ) ? daysInleapYear[ monat - 1 ] : daysNotInleapYear[ monat - 1 ]) + tag;
	  }

	  private static int daysNotInleapYear[] = {
	    // Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
	       0,   31,  59,  90,  120, 151, 181, 212, 243, 273, 304, 334
	  };

	  private static int daysInleapYear[] = {
	    // Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
	       0,   31,  60,  91,  121, 152, 182, 213, 244, 274, 305, 335
	  };
	  
	  public static void main( String[] args ) {

	    System.out.println( isLeap( 2011 ) ); // kein Schaltjahr
	    System.out.println( isLeap( 2012 ) ); // ist Schaltjahr

	    System.out.println( tagDesJahres( 1, 1, 2012 ) ); // 1
	    System.out.println( tagDesJahres( 1, 2, 2012 ) ); // 1
	    System.out.println( tagDesJahres( 31, 12, 2012 ) ); // 366

	    GregorianCalendar cal = new GregorianCalendar( 2012, Calendar.JANUARY, 1 );
	    System.out.println( "Day of Year = " + cal.get( Calendar.DAY_OF_YEAR ) );

	    cal = new GregorianCalendar( 2012, Calendar.FEBRUARY, 1 );
	    System.out.println( "Day of Year = " + cal.get( Calendar.DAY_OF_YEAR ) );

	    cal = new GregorianCalendar( 2012, Calendar.DECEMBER, 31 );
	    System.out.println( "Day of Year = " + cal.get( Calendar.DAY_OF_YEAR ) );
	  }
	}
