package com.mycompany.app;

public class PersonRole{
	private Integer personRoleId;
	private Integer personId;
	private Integer roleId;
	private String roleName;

	public Integer getPersonRoleId(){
		return personRoleId;
	}

	public void setPersonRoleId(Integer personRoleId){
		this.personRoleId = personRoleId;
	}

	public Integer getPersonId(){
		return personId;
	}

	public void setPersonId(Integer personId){
		this.personId = personId;
	}

	public Integer getRoleId(){
		return roleId;
	}

	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}

	public String getRoleName(){
		return roleName;
	}

	public void setRoleName(String roleName){
		this.roleName = roleName;
	}
}