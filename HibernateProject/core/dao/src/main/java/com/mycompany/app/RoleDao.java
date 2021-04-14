package com.mycompany.app;

import java.util.List;
import org.hibernate.Session;

public class RoleDao
{
	public static Session session = Utilities.getSessionFactory().openSession();

    public void addRole(Role role) {
        session.beginTransaction();
        session.save(role);
        session.getTransaction().commit();
    }

    public List<Role> listRole(){

    	return session.createQuery("FROM Role").list();
        
    }

    public void updateRole(Role role){
    	session.beginTransaction();
    	session.update(role);
        session.getTransaction().commit();
    }

    public void deleteRole(Role role){
        session.beginTransaction();
        session.delete(role);
        session.getTransaction().commit();
    }
}
