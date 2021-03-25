package vaccination;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testTimeslot {

	@Test
	public void test() {
		assertEquals(1, timeslot.addSlot(1430,1530,"14.03.2004",true));
		assertEquals(2, timeslot.addSlot(1630,1730,"14.03.2004",false));
		
		
	}

}
