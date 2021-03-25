package vaccination;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testPerson {

	@Test public void testAddNewPerson() {
		assertEquals(0, Person.addNewPerson("Maxi", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(1, Person.addNewPerson("Maxi1", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(2, Person.addNewPerson("Maxi2", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(3, Person.addNewPerson("Maxi3", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(4, Person.addNewPerson("Maxi3", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(5, Person.addNewPerson("Maxi3", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
		assertEquals(6, Person.addNewPerson("Maxi3", "Mustermann", 123456789, "Kastanienweg", 8740, "Weiﬂkirchen", "Austria", "12.12.20012", 6801506));
	}
	
	@Test public void testDeletePersons() {
		assertEquals(true, Person.deletePerson(0));
		assertEquals(true, Person.deletePerson(1));
		assertEquals(true, Person.deletePerson(2));
		
		assertEquals(false, Person.deletePerson(-1));
		assertEquals(false, Person.deletePerson(500));
		assertEquals(false, Person.deletePerson(-3));
	}	
}
