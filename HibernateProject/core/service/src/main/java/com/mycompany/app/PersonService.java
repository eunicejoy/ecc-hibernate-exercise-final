package com.mycompany.app;

import java.util.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PersonService{
	public static PersonDao personDao = new PersonDao();

    public static void createPerson(){
    	Scanner scanner = new Scanner(System.in);
    	Scanner scanInt = new Scanner(System.in);
    	Scanner scanDouble = new Scanner(System.in);

		System.out.print("First name: ");
		String fname = scanner.nextLine();

		System.out.print("Last name: ");
		String lname = scanner.nextLine();

		System.out.print("Middle name: ");
		String mname = scanner.nextLine();

		System.out.print("Suffix: ");
		String suffix = scanner.nextLine();

		System.out.print("Title: ");
		String title = scanner.nextLine();

		System.out.print("Street Number: ");
		int streetNumber = scanInt.nextInt();

		System.out.print("Barangay: ");
		String barangay = scanner.nextLine();

		System.out.print("Municipality or City: ");
		String municipalityOrCity = scanner.nextLine();

		System.out.print("Zipcode: ");
		int zipcode = scanInt.nextInt();

		System.out.print("Birthday (YYYY-MM-DD): ");
		String birthdayString = scanner.nextLine();

		System.out.print("General Weighted Average: ");
		double gwa = scanDouble.nextDouble();

		System.out.print("Date Hired (YYYY-MM-DD): ");
		String dateHiredString = scanner.nextLine();

		System.out.print("Currently Employed (Y/N): ");
		String currentlyEmployed = scanner.nextLine();

		Date birthday = new Date();
		Date dateHired = new Date();
		
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			birthday = dateFormat.parse(birthdayString);
			dateHired = dateFormat.parse(dateHiredString);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}

       	Person person = new Person();

       	person.setFirstName(fname);
		person.setLastName(lname);
		person.setMiddleName(mname);
		person.setSuffix(suffix);
		person.setTitle(title);
		person.setStreetNumber(streetNumber);
		person.setBarangay(barangay);
		person.setMunicipalityOrCity(municipalityOrCity);
		person.setZipcode(zipcode);
		person.setBirthday(birthday);
		person.setGeneralWeightedAverage(gwa);
		person.setDateHired(dateHired);
		person.setCurrentlyEmployed(currentlyEmployed);
	 
       	personDao.addPerson(person);
       	
       	System.out.println("New person added!");
    }

    public static void updatePerson(){

    	if(personDao.listPerson().isEmpty()){
    		System.out.println("");
	    	System.out.println("No records found.");
	    } else{
	    	System.out.println("");
	    	System.out.println("Enter Person ID to update:");
	    	Scanner scanInt = new Scanner(System.in);
	    	int personId = scanInt.nextInt();

	    	
	    	Person person = personDao.session.get(Person.class, personId);

	    	if(person == null){
	    		System.out.println("Person does not exist.");
	    	}else{
	    	
	    	Scanner scanner = new Scanner(System.in);

			System.out.print("First name: ");
			String fname = scanner.nextLine();
			if(fname == ""){
				System.out.println(person.getFirstName());
				person.setFirstName(person.getFirstName());
			}
			else{
				person.setFirstName(fname);
			}

			System.out.print("Last name: ");
			String lname = scanner.nextLine();
			if(lname == ""){
				person.setLastName(person.getLastName());
			}
			else{
				person.setLastName(lname);
			}

			System.out.print("Middle name: ");
			String mname = scanner.nextLine();
			if(mname == ""){
				person.setMiddleName(person.getMiddleName());
			}
			else{
				person.setMiddleName(mname);
			}

			System.out.print("Suffix: ");
			String suffix = scanner.nextLine();
			if(suffix == ""){
				person.setSuffix(person.getSuffix());
			}
			else{
				person.setSuffix(suffix);
			}

			System.out.print("Title: ");
			String title = scanner.nextLine();
			if(title == ""){
				person.setTitle(person.getTitle());
			}
			else{
				person.setTitle(title);
			}

			System.out.print("Street Number: ");
			String inputStreetNumber = scanner.nextLine();
			if(inputStreetNumber == ""){
				person.setStreetNumber(person.getStreetNumber());
			}	
			else{
				Integer streetNumber = Integer.valueOf(inputStreetNumber);
				person.setStreetNumber(streetNumber);
			}

			System.out.print("Barangay: ");
			String barangay = scanner.nextLine();
			if(barangay == ""){
				person.setBarangay(person.getBarangay());
			}
			else{
				person.setBarangay(barangay);
			}

			System.out.print("Municipality or City: ");
			String municipalityOrCity = scanner.nextLine();
			if(municipalityOrCity == ""){
				person.setMunicipalityOrCity(person.getMunicipalityOrCity());
			}
			else{
				person.setMunicipalityOrCity(municipalityOrCity);
			}

			System.out.print("Zipcode: ");
			String inputZipcode = scanner.nextLine();
			if(inputZipcode == "") {
				person.setZipcode(person.getZipcode());	
			}
			else{
				Integer zipcode = Integer.valueOf(inputZipcode);
				person.setZipcode(zipcode);
			}

			System.out.print("Birthday (YYYY-MM-DD): ");
			String birthdayString = scanner.nextLine();
			if(birthdayString == ""){
				person.setBirthday(person.getBirthday());	
			}
			else{
				Date birthday = new Date();
				try{
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				birthday = dateFormat.parse(birthdayString);
				} catch (ParseException ex) {
				ex.printStackTrace();
				}
				person.setBirthday(birthday);
			}

			System.out.print("General Weighted Average: ");
			String inputGwa = scanner.nextLine();
			if(inputGwa == ""){
				person.setGeneralWeightedAverage(person.getGeneralWeightedAverage());
			}
			else{
				Double gwa = Double.valueOf(inputGwa);
				person.setGeneralWeightedAverage(gwa);
			}

			System.out.print("Date Hired (YYYY-MM-DD): ");
			String dateHiredString = scanner.nextLine();
			if(dateHiredString == ""){
				person.setDateHired(person.getDateHired());
			}
			else{
				Date dateHired = new Date();
				try{
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				dateHired = dateFormat.parse(dateHiredString);
				} catch (ParseException ex) {
				ex.printStackTrace();
				}
				person.setDateHired(dateHired);
			}

			System.out.print("Currently Employed (Y/N): ");
			String currentlyEmployed = scanner.nextLine();
			if(currentlyEmployed == ""){
				person.setCurrentlyEmployed(person.getCurrentlyEmployed());
			}
			else{
				person.setCurrentlyEmployed(currentlyEmployed);
			}
	
			personDao.updatePerson(person);

	       	System.out.println("Person " + personId + " has been updated!");
	    	}  
	    }

    }

    public static void deletePerson(){
    	
    	if(personDao.listPerson().isEmpty()){
    		System.out.println("");
	    	System.out.println("No records found.");
	    } else{
	    	System.out.println("");
	    	System.out.println("Enter Person ID to delete:");
	    	Scanner scanner = new Scanner(System.in);
	    	int personId = scanner.nextInt();

	    	Person person = personDao.session.get(Person.class, personId);

	    	if(person == null){
	    		System.out.println("Person does not exist.");
	    	}else{
		    	personDao.deletePerson(person);
		    	System.out.println("Person " + personId	+ " has been deleted!");
	    	}
	    }

    	
    }


    public static void listPerson(){

	    if(personDao.listPerson().isEmpty()){
	    	System.out.println("");
	    	System.out.println("No records found.");
	    } else{
	    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	System.out.println("");

    		System.out.println("------------------Persons-----------------");
    	for(Person person:personDao.listPerson()){
    		System.out.println("ID: " + person.getPersonId());
    		System.out.println("First Name: " + person.getFirstName());
    		System.out.println("Last Name: " + person.getLastName());
    		System.out.println("Middle Name: " + person.getMiddleName());
    		System.out.println("Suffix: " + person.getSuffix());
    		System.out.println("Title: " + person.getTitle());
    		System.out.println("Street Number: " + person.getStreetNumber());
    		System.out.println("Barangay: " + person.getBarangay());
    		System.out.println("Municipality or City: " + person.getMunicipalityOrCity());
    		System.out.println("Zipcode: " + person.getZipcode());
    		String birthday = dateFormat.format(person.getBirthday());
    		System.out.println("Birthday: " + birthday);
    		System.out.println("General Weighted Average: " + person.getGeneralWeightedAverage());	
			String dateHired = dateFormat.format(person.getDateHired());
    		System.out.println("Date Hired: " + dateHired);
    		System.out.println("Currently Employed: " + person.getCurrentlyEmployed());
    		
    		List<PersonContact> personContacts = personDao.personContacts(person.getPersonId());
	        System.out.println("Contacts:");
	        for(PersonContact pc:personContacts){
	        	System.out.println(pc.getPersonContactType() + ": " + pc.getPersonContactValue());
	        }

    		List<String> result = personDao.personRoles(person.getPersonId());
            System.out.println("Roles: ");
	            for(String roleName:result){
	            	System.out.println(roleName);
	            }


    		System.out.println("------------------------------------------");
            }
	    }
    }

    public static void listPersonBy(String column, String sort){
    	if(personDao.listPersonBy(column, sort).isEmpty()){
	    	System.out.println("");
	    	System.out.println("No records found.");
	    } else{
	    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	System.out.println("");

    		System.out.println("------------------Persons-----------------");
    	for(Person person:personDao.listPersonBy(column, sort)){
    		System.out.println("ID: " + person.getPersonId());
    		System.out.println("First Name: " + person.getFirstName());
    		System.out.println("Last Name: " + person.getLastName());
    		System.out.println("Middle Name: " + person.getMiddleName());
    		System.out.println("Suffix: " + person.getSuffix());
    		System.out.println("Title: " + person.getTitle());
    		System.out.println("Street Number: " + person.getStreetNumber());
    		System.out.println("Barangay: " + person.getBarangay());
    		System.out.println("Municipality or City: " + person.getMunicipalityOrCity());
    		System.out.println("Zipcode: " + person.getZipcode());
    		String birthday = dateFormat.format(person.getBirthday());
    		System.out.println("Birthday: " + birthday);
    		System.out.println("General Weighted Average: " + person.getGeneralWeightedAverage());	
			String dateHired = dateFormat.format(person.getDateHired());
    		System.out.println("Date Hired: " + dateHired);
    		System.out.println("Currently Employed: " + person.getCurrentlyEmployed());
    		
    		List<PersonContact> personContacts = personDao.personContacts(person.getPersonId());
	        System.out.println("Contacts:");
	        for(PersonContact pc:personContacts){
	        	System.out.println(pc.getPersonContactType() + ": " + pc.getPersonContactValue());
	        }

    		List<String> result = personDao.personRoles(person.getPersonId());
            System.out.println("Roles: ");
	            for(String roleName:result){
	            	System.out.println(roleName);
	            }


    		System.out.println("------------------------------------------");
            }
	    }
    }

    public static void addPersonRole(){
    	if(personDao.listPerson().isEmpty()){
    		System.out.println("");
	    	System.out.println("No records found.");
	    } else{
	    	System.out.println("");
    	System.out.println("Enter ID of Person to add Role:");
    	Scanner scanInt = new Scanner(System.in);
    	int personId = scanInt.nextInt();
    	
    	Person person = personDao.session.get(Person.class, personId);

    	if(person == null){
    		System.out.println("Person does not exist.");
    	} else{
    		List<Role> roles = RoleService.roleDao.listRole();

    		if(roles.isEmpty()){
    			System.out.println("No records found. Add roles first. ");
    		} else{

	    			System.out.println("--------------------");
			    	for(Role roleDetail:roles){
			    		System.out.println(roleDetail.getRoleId() + " \t| " + roleDetail.getRoleName());
			    	}
		
					System.out.println("Choose role name from the list of roles:");
					Scanner scanner = new Scanner(System.in);
					String roleName = scanner.nextLine();

					boolean notfound = true;
					for(Role role:roles){
						
			    		if(role.getRoleName().contains(roleName)){
							
				            	//Check if role has been added already to the person
				            	boolean roleNotFound = true;
				            	List<String> result = personDao.personRoles(person.getPersonId());

				            	if(result.contains(roleName)){
				            		System.out.println("The person has "+roleName+" role already.");
				            			roleNotFound = false;
					            		notfound = false;
				            	}else{
				            		notfound = false;
									PersonRole pr = new PersonRole();
									pr.setPersonId(personId);
									pr.setRoleId(role.getRoleId());
									pr.setRoleName(role.getRoleName());
									personDao.addPersonRole(pr);
									System.out.println("Person " + personId +" has new role added");
				            	}
							
						} 
			    	}

			    	if(notfound == true){
			    		System.out.println("Role name is not on the list.");
			    	}
	    		}
    		}
	    }
    	
    }

    public static void deletePersonRole(){
    	if(personDao.listPerson().isEmpty()){
    		System.out.println("");
	    	System.out.println("No records found.");
	    } else {
	    	System.out.println("");
	    	System.out.println("Enter Person ID to delete Role:");
	    	Scanner scanInt = new Scanner(System.in);
	    	int personId = scanInt.nextInt();

    		Person person = personDao.session.get(Person.class, personId);

	    	if(person == null){
	    		System.out.println("Person does not exist.");
	    	} else{
    		System.out.println("Person " + personId + " role(s):");
    		List<String> result = personDao.personRoles(person.getPersonId());
	            for(String roleName:result){
	            	System.out.println(roleName);
	            }
		         if(result.isEmpty()){
		         	System.out.println("Person " + personId + " has no roles yet.");
		         } else{
		         	System.out.println("Enter role name to delete: ");
			         Scanner scanner = new Scanner(System.in);
			         String roleName = scanner.nextLine();

			         if(result.contains(roleName)){
			         	List<Integer> personRole = personDao.PersonRoleId(roleName, personId);
			         	for(Integer personRoleId:personRole){
			         		PersonRole pr = personDao.session.get(PersonRole.class, personRoleId);
			         		personDao.deletePersonRole(pr);
			         		System.out.println("Role " + roleName + " has been deleted. ");
			         	}
			         	
			         }else{
			         	System.out.println("Person " + personId + " does not have a " + roleName + " role");
			         }
		         }
	         
    		}
	    }
    }



    public static void addContact(){
    	if(personDao.listPerson().isEmpty()){
    		System.out.println("");
	    	System.out.println("No records found.");
	    } else{
	    	System.out.println("");
	    	System.out.println("Enter Person ID to add contact:");
	    	Scanner scanInt = new Scanner(System.in);
	    	int personId = scanInt.nextInt();

	    	Person person = personDao.session.get(Person.class, personId);

	    	if(person == null){
	    		System.out.println("Person does not exist.");
	    	}else{
		    	Scanner scanner = new Scanner(System.in);

		    	System.out.println("Enter contact type (landline/mobile number/email): ");
		    	String contactType = scanner.nextLine();

		    	System.out.println("Enter contact value: ");
		    	String contactValue = scanner.nextLine();

		    	PersonContact pc = new PersonContact();
		    	pc.setPersonId(personId);
		    	pc.setPersonContactType(contactType);
		    	pc.setPersonContactValue(contactValue);
		    	personDao.addContact(pc);

		    	System.out.println("Person " + personId + " has new contact added.");
	    	}
	    }
    }

    public static void updateContact(){
    	
    	if(personDao.listPerson().isEmpty()){
    		System.out.println("");
	    	System.out.println("No records found.");
	    } else{
	    	System.out.println("");
	    	System.out.println("Enter Person ID to update contact:");
	    	Scanner scanInt = new Scanner(System.in);
	    	int personId = scanInt.nextInt();

	    	Person person = personDao.session.get(Person.class, personId);

    		if(person == null){
    			System.out.println("Person does not exist.");
    		}else{
    		
	    	List<PersonContact> personContacts = personDao.personContacts(personId);
	        	if(personContacts.isEmpty()){
	        		System.out.println("Person " + personId + " has no contacts yet.");
	        	} else{
	        		System.out.println("Person " + personId + " has the following contacts: ");
			        for(PersonContact pc:personContacts){
			        	System.out.println("id: "+ pc.getPersonContactId() + " " + pc.getPersonContactType() + ": " + pc.getPersonContactValue());
			        }

			        System.out.println("Enter the id of contact you want to update: ");
			        int contactId = scanInt.nextInt();

			       PersonContact pc = personDao.session.get(PersonContact.class, contactId);
			        if(pc == null){
			        	System.out.println("No contact match.");
			        } else{
			        	Scanner scanner = new Scanner(System.in);

				    	System.out.println("Enter contact type (landline/mobile number/email): ");
				    	String contactType = scanner.nextLine();
				    	if(contactType == ""){
				    		pc.setPersonContactType(pc.getPersonContactType());
				    	}
				    	else{
				    		pc.setPersonContactType(contactType);
				    	}

				    	System.out.println("Enter contact value: ");
				    	String contactValue = scanner.nextLine();
				    	if(contactValue == ""){
				    		pc.setPersonContactValue(pc.getPersonContactValue());
				    	}
				    	else{
				    		pc.setPersonContactValue(contactValue);
				    	}

				    	personDao.updateContact(pc);

				    	System.out.println("Person " + personId + " contact " +contactId+" has been updated.");
			        }

	        	}
	        	
    		}
	    }

    }

    public static void deleteContact(){
		if(personDao.listPerson().isEmpty()){
			System.out.println("");
	    	System.out.println("No records found.");
	    } else{
	    	System.out.println("");
	    	System.out.println("Enter Person ID to delete contact:");
	    	Scanner scanInt = new Scanner(System.in);
	    	int personId = scanInt.nextInt();

	    	Person person = personDao.session.get(Person.class, personId);

	    	if(person == null){
	    		System.out.println("Person does not exist.");
	    	}else{
		    	List<PersonContact> personContacts = personDao.personContacts(personId);
	        	if(personContacts.isEmpty()){
	        		System.out.println("Person " + personId + " has no contacts yet.");
	        	} else{
	        		System.out.println("Person " + personId + " has the following contacts: ");
			        for(PersonContact pc:personContacts){
			        	System.out.println("id: "+ pc.getPersonContactId() + " " + pc.getPersonContactType() + ": " + pc.getPersonContactValue());
			        }

			        System.out.println("Enter the id of contact you want to delete: ");
			        int contactId = scanInt.nextInt();

			       PersonContact pc = personDao.session.get(PersonContact.class, contactId);
			        if(pc == null){
			        	System.out.println("No contact match.");
			        } else{
				    	personDao.deleteContact(pc);

				    	System.out.println("Person " + personId + " contact " +contactId+" has been deleted.");
			        }

	        	}
	    	}
	    }

    }
}