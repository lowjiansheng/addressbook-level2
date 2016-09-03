package seedu.addressbook.data.person;

public class Contact {

	public String value;
	public Boolean isPrivate;
	
	public Contact() {
	}

	public boolean isValid(String test, String regex) {
		return test.matches(regex);
	}

	public String toString(){
		return value;
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

}
