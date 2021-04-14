package com.mycompany.app;

import javax.persistence.*;

@Entity
@Table(name = "personrole")
public class PersonRole{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_role_id", columnDefinition = "serial")
	private Integer personRoleId;

	@Column(name = "person_id")
	private Integer personId;

	@Column(name = "role_id")
	private Integer roleId;

	@Column(name = "role_name")
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