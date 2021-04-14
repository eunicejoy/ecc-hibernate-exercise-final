package com.mycompany.app;

import java.util.Date;
import java.util.Set;

public class Person{

	private Integer personId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String suffix;
	private String title;
	private Integer streetNumber;
	private String barangay;
	private String municipalityOrCity;
	private Integer zipcode;
	private Date birthday;
	private Double generalWeightedAverage;
	private Date dateHired;
	private String currentlyEmployed;

	public Integer getPersonId(){
		return personId;
	}

	public void setPersonId(Integer personId){
		this.personId = personId;
	}
	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getMiddleName(){
		return middleName;
	}

	public void setMiddleName(String middleName){
		this.middleName = middleName;
	}

	public String getSuffix(){
		return suffix;
	}

	public void setSuffix(String suffix){
		this.suffix = suffix;
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public Integer getStreetNumber(){
		return streetNumber;
	}

	public void setStreetNumber(Integer streetNumber){
		this.streetNumber = streetNumber;
	}

	public String getBarangay(){
		return barangay;
	}

	public void setBarangay(String barangay){
		this.barangay = barangay;
	}

	public String getMunicipalityOrCity(){
		return municipalityOrCity;
	}

	public void setMunicipalityOrCity(String municipalityOrCity){
		this.municipalityOrCity = municipalityOrCity;
	}

	public Integer getZipcode(){
		return zipcode;
	}

	public void setZipcode(Integer zipcode){
		this.zipcode = zipcode;
	}

	public Date getBirthday(){
		return birthday;
	}

	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}

	public Double getGeneralWeightedAverage(){
		return generalWeightedAverage;
	}

	public void setGeneralWeightedAverage(Double generalWeightedAverage){
		this.generalWeightedAverage = generalWeightedAverage;
	}

	public Date getDateHired(){
		return dateHired;
	}

	public void setDateHired(Date dateHired){
		this.dateHired = dateHired;
	}

	public String getCurrentlyEmployed(){
		return currentlyEmployed;
	}

	public void setCurrentlyEmployed(String currentlyEmployed){
		this.currentlyEmployed = currentlyEmployed;
	}
}