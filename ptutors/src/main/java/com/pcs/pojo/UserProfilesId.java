package com.pcs.pojo;
// Generated 5 Sep, 2018 6:08:07 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserProfilesId generated by hbm2java
 */
@Embeddable
public class UserProfilesId implements java.io.Serializable {

	private String userName;
	private String password;
	private String userRole;

	public UserProfilesId() {
	}

	public UserProfilesId(String userName, String password, String userRole) {
		this.userName = userName;
		this.password = password;
		this.userRole = userRole;
	}

	@Column(name = "user_name", nullable = false, length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password", nullable = false, length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "user_role", nullable = false, length = 20)
	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserProfilesId))
			return false;
		UserProfilesId castOther = (UserProfilesId) other;

		return ((this.getUserName() == castOther.getUserName()) || (this.getUserName() != null
				&& castOther.getUserName() != null && this.getUserName().equals(castOther.getUserName())))
				&& ((this.getPassword() == castOther.getPassword()) || (this.getPassword() != null
						&& castOther.getPassword() != null && this.getPassword().equals(castOther.getPassword())))
				&& ((this.getUserRole() == castOther.getUserRole()) || (this.getUserRole() != null
						&& castOther.getUserRole() != null && this.getUserRole().equals(castOther.getUserRole())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37 * result + (getPassword() == null ? 0 : this.getPassword().hashCode());
		result = 37 * result + (getUserRole() == null ? 0 : this.getUserRole().hashCode());
		return result;
	}

}
