package seedu.addressbook.data.person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address extends Contact implements Printable{

    public static final String EXAMPLE = "123, some street, 06126, 140101";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses has to be in this"
    		+ "format : block, street, unit, postal code";
    public static final String ADDRESS_VALIDATION_REGEX = "(.+),(.+),(.+),(.+)";
    
    private Block block;
    private Unit unit;
    private Street street;
    private PostalCode postalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        super.isPrivate = isPrivate; 
        super.value = address;
        splitAddress(address);
    }

    
    private void splitAddress(String address) throws IllegalValueException{
    	Pattern pattern = Pattern.compile(ADDRESS_VALIDATION_REGEX);
    	Matcher m = pattern.matcher(address);
    	
    	if (m.find()){
    		block = new Block(m.group(1));
    		street = new Street(m.group(2));
    		unit = new Unit(m.group(3));
    		postalCode = new PostalCode(m.group(4));
    	}
    	else {
    		throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
    	}
    }
    
    
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }


	@Override
	public String getPrintableString() {
		return "Address: " + this.toString();
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