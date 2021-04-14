package com.mycompany.app;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;


public class PersonDao
{
	public static Session session = Utilities.getSessionFactory().openSession();

    public void addPerson(Person person) {
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
    }

    public List<Person> listPerson(){
    	return session.createQuery("FROM Person").list();
    }

    public void updatePerson(Person person){
    	session.beginTransaction();
    	session.update(person);
        session.getTransaction().commit();
    }

    public void deletePerson(Person person){
        session.beginTransaction();
        session.delete(person);
        session.getTransaction().commit();
    }

    public List<String> personRoles(Integer personId){
        String hql = "SELECT roleName FROM PersonRole WHERE person_id = :person_id";
        Query query = session.createQuery(hql);
        query.setParameter("person_id", personId);
        return query.list();
    }

    public void addPersonRole(PersonRole pr){
        session.beginTransaction();
        session.save(pr);
        session.getTransaction().commit();
    }

    public void deletePersonRole(PersonRole pr){
        session.beginTransaction();
        session.delete(pr);
        session.getTransaction().commit();
    }

    public List<Integer> PersonRoleId(String roleName, Integer personId){
        String hql = "SELECT personRoleId FROM PersonRole WHERE person_id =:person_id AND role_name = :role_name";
        Query query = session.createQuery(hql);
        query.setParameter("person_id", personId);
        query.setParameter("role_name", roleName);

        return query.list();

    }


    public void addContact(PersonContact pc){
        session.beginTransaction();
        session.save(pc);
        session.getTransaction().commit();
    }

    public void updateContact(PersonContact pc){
        session.beginTransaction();
        session.update(pc);
        session.getTransaction().commit();
    }

    public void deleteContact(PersonContact pc){
        session.beginTransaction();
        session.delete(pc);
        session.getTransaction().commit();
    }

    public List<PersonContact> personContacts(Integer personId){
        String hql = "FROM PersonContact WHERE person_id = :person_id";
        Query query = session.createQuery(hql);
        query.setParameter("person_id", personId);
        return query.list();
    }
}
