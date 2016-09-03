package seedu.addressbook.data.tag;

import java.util.ArrayList;


import seedu.addressbook.data.person.Person;

public class Tagging {

	private Person taggedPerson;
	private ArrayList<String> tags;
	private final String ADD = "+";
	private final String DELETE = "-";
	
	public Tagging(Person taggedPerson){
		this.taggedPerson = taggedPerson;
		tags = new ArrayList<String>();
	}
	
	

	public void addTag(Tag tagAdd){
		tags.add(ADD + tagAdd);
	}
	
	public void removeTag(Tag tagRemove){
		tags.add(DELETE + tagRemove);
	}
	
	public ArrayList<String> getPersonTags(){
		return tags;
	}
	
	public void printTagRecords(){
		for (int i = 0 ; i < tags.size(); i++){
			System.out.println(tags.get(i));
		}
	}
	
	/**
	 * 
	 * @return the person who was tagged.
	 */
	public String getName(){
		return this.taggedPerson.getName().toString();
	}
	
	
}
