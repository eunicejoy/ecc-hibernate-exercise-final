package com.mycompany.app;

import java.util.Scanner;
import java.util.List;

public class RoleService 
{
	
	public static RoleDao roleDao = new RoleDao();

    public static void addRole(){
    	Scanner scanner = new Scanner(System.in);

    	System.out.println("");
    	System.out.print("Role name: ");
    	String name = scanner.nextLine();

    	Role role = new Role();

    	role.setRoleName(name);
    	
		roleDao.addRole(role);
    	System.out.println("New role added!");

    }

    public static void updateRole(){
    	if(roleDao.listRole().isEmpty()){
            System.out.println("");
            System.out.println("No records found.");
        } else{
           System.out.println("");
            System.out.println("Enter role id to update: ");
            Scanner scanner = new Scanner(System.in);
            int roleId = scanner.nextInt();

            Role role = roleDao.session.get(Role.class, roleId);

            if(role == null){
                System.out.println("Role id does not exist.");
            }else{

                 System.out.println("Enter new role name: ");
                Scanner scan =  new Scanner(System.in);
                String roleName = scan.nextLine();
                if(roleName == ""){
                    role.setRoleName(role.getRoleName());
                } else{
                    role.setRoleName(roleName);
                    roleDao.updateRole(role);
                    System.out.println("Role " + roleId + " has been updated!");
                }
               
            } 
        }
    }

    public static void deleteRole(){
        if(roleDao.listRole().isEmpty()){
            System.out.println("");
            System.out.println("No records found.");
        } else{
            System.out.println("");
            System.out.println("Enter role id to delete: ");
            Scanner scanner = new Scanner(System.in);
            int roleId = scanner.nextInt();

            Role role = roleDao.session.get(Role.class, roleId);
            if(role == null){
                System.out.println("Role id does not exist.");
            }else{
                roleDao.deleteRole(role);

                System.out.println("Role " + roleId + " has been deleted!");
            }
        }
    }

    public static void listRole(){
    	if(roleDao.listRole().isEmpty()){
            System.out.println("");
            System.out.println("No records found.");
        }else{

            System.out.println("");
            System.out.println("--------Roles--------");
            System.out.println("Role Id\t| Role Name");
            System.out.println("---------------------");
            for(Role role:roleDao.listRole()){
                System.out.print(role.getRoleId() + "\t| " + role.getRoleName()+ "\n");
            }
            System.out.println("---------------------");
        }
    }	
}
