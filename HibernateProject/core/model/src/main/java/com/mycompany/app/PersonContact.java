package com.mycompany.app;

public class PersonContact{

	private Integer personContactId;
	private Integer personId;
	private String personContactType;
	private String personContactValue;

	public Integer getPersonContactId(){
		return personContactId;
	}

	public void setPersonContactId(Integer personContactId){
		this.personContactId = personContactId;
	}

	public Integer getPersonId(){
		return personId;
	}

	public void setPersonId(Integer personId){
		this.personId = personId;
	}

	public String getPersonContactType(){
		return personContactType;
	}

	public void setPersonContactType(String personContactType){
		this.personContactType = personContactType;
	}

	public String getPersonContactValue(){
		return personContactValue;
	}

	public void setPersonContactValue(String personContactValue){
		this.personContactValue = personContactValue;
	}
}