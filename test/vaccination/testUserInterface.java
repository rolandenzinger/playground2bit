package vaccination;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class testUserInterface {

	@SuppressWarnings("deprecation")
	@Test
	void testDate() {
		Date result = UserInterface.AskForDate("Text", "25:05:05");
		Date Expected;
		try {
			Expected = new SimpleDateFormat("dd.MM.yyyy").parse("25.05.2005");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Expected = null;
		}
		Assert.assertEquals(Expected, result);
	}

}
