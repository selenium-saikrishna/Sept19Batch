package day32;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({Login.class,
	           FindAFlight.class,
	           SelectAFlight.class,
	           BookAFlight.class,
	           FlightConfirmation.class})
public class BatchTest {

}
