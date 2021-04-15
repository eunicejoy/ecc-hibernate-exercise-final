package com.mycompany.app;
import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id", columnDefinition = "serial")
	private Integer roleId;

	@Column(name = "role_name")
	private String roleName;

	public Role(){}
	public Role(Integer roleId, String name){
		this.roleId = roleId;
		this.roleName = roleName;
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