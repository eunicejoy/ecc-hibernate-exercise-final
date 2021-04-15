package com.mycompany.app;

import javax.persistence.*;

@Entity
@Table(name = "personcontact")
public class PersonContact{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_contact_id", columnDefinition = "serial")
	private Integer personContactId;

	@Column(name = "person_id")
	private Integer personId;

	@Column(name = "person_contact_type")
	private String personContactType;

	@Column(name = "person_contact_value")
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