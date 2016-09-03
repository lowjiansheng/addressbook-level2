package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {


	@Test
	public void testIsSimilar() throws IllegalValueException {
		String testName1 = "K Smith";
		String testName2 = "Smith K";
		Name name1 = new Name(testName1);
		Name name2 = new Name(testName2);
		
		assertTrue(isSimilar(name1, name2);
	}
	
	@Test
	public void testIsNotSimilar() throws IllegalValueException {
		String testName1 = "M Smith";
		String testName2 = "Smith K";
		Name name1 = new Name(testName1);
		Name name2 = new Name(testName2);
		
		assertTrue(!isSimilar(name1, name2));
	}

}
