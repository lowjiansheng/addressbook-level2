package seedu.addressbook.parser;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

import seedu.addressbook.common.Utils;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Address;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.Phone;
import seedu.addressbook.data.tag.Tag;
import seedu.addressbook.data.tag.UniqueTagList;

public class UtilsTest {

	
	@Test
	public void testNullPersonObject() {
		Person testPerson = null;
		assertTrue(Utils.isAnyNull(testPerson));
		
	}
	
	@Test
	public void testNonNullPersonObject(){
        final Person testPerson = generateTestPerson();
        assertTrue(!Utils.isAnyNull(testPerson));

	}
	
	@Test
	public void testElementsNotUnique(){
		ArrayList<Integer> testNotUniqueArr = new ArrayList<Integer>();
		generateSameArray(testNotUniqueArr);
		assertTrue(!Utils.elementsAreUnique(testNotUniqueArr));
	}
	
	@Test
	public void testElementsUnique(){
		HashSet<Integer> testUniqueArr = new HashSet<Integer>();
		generateUniqueArray(testUniqueArr);
		assertTrue(Utils.elementsAreUnique(testUniqueArr));
	}
	
	
	private static HashSet<Integer> generateUniqueArray(HashSet<Integer> set){
		
		for (int i = 0 ; i < 5000 ; i++){
			set.add(i);
		}
		
		return set;
	}
	
	
	private static ArrayList<Integer> generateSameArray(ArrayList<Integer> arr){
		
		for (int i = 0 ; i < 5000; i++){
			arr.add(1);
		}
		return arr;
	}
	
	private static Person generateTestPerson() {
        try {
            return new Person(
                new Name(Name.EXAMPLE),
                new Phone(Phone.EXAMPLE, true),
                new Email(Email.EXAMPLE, false),
                new Address(Address.EXAMPLE, true),
                new UniqueTagList(new Tag("tag1"), new Tag("tag2"), new Tag("tag3"))
            );
        } catch (IllegalValueException ive) {
            throw new RuntimeException("test person data should be valid by definition");
        }
    }

}
