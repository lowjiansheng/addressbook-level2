package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    public final String value;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = address;
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}

class Block{
	
	private String blockData;
	
	Block(String blockData){
		this.blockData = blockData;
	}
	
	public String getBlock(){
		return this.blockData;
	}
	
}

class Street{
	
	private String streetData;
	
	Street(String streetData){
		this.streetData = streetData;
	}
	
	public String getStreet(){
		return this.streetData;
	}
}

class Unit{
	
	private String unitData;
	
	Unit(String unitData){
		this.unitData = unitData;
	}
	
	public String getUnit(){
		return this.unitData;
	}
	
}

class PostalCode{
	
	private String postalCodeData;
	
	PostalCode(String postalCodeData){
		this.postalCodeData = postalCodeData;
	}
	
	public String getPostalCode(){
		return this.postalCodeData;
	}
}