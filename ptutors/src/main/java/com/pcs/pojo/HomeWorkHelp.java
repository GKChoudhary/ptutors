package com.pcs.pojo;
// Generated 5 Sep, 2018 6:08:07 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * HomeWorkHelp generated by hbm2java
 */
@Entity
@Table(name = "home_work_help", catalog = "ptutors_db")
public class HomeWorkHelp implements java.io.Serializable {

	private Integer homeWorkId;
	private String name;
	private String subject;
	private String segment;
	private String email;
	private String contactNumber;
	private String country;
	private Date deadline;
	private String budget;
	private String description;
	private byte[] uploadHomeWork;

	public HomeWorkHelp() {
	}

	public HomeWorkHelp(String name, String subject, String segment, String email, String contactNumber, String country,
			Date deadline, String budget, String description, byte[] uploadHomeWork) {
		this.name = name;
		this.subject = subject;
		this.segment = segment;
		this.email = email;
		this.contactNumber = contactNumber;
		this.country = country;
		this.deadline = deadline;
		this.budget = budget;
		this.description = description;
		this.uploadHomeWork = uploadHomeWork;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "home_work_id", unique = true, nullable = false)
	public Integer getHomeWorkId() {
		return this.homeWorkId;
	}

	public void setHomeWorkId(Integer homeWorkId) {
		this.homeWorkId = homeWorkId;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "subject", length = 100)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "segment", length = 100)
	public String getSegment() {
		return this.segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	@Column(name = "email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "contact_number", length = 45)
	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Column(name = "country", length = 45)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "deadline", length = 10)
	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	@Column(name = "budget", length = 45)
	public String getBudget() {
		return this.budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	@Column(name = "description", length = 300)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "upload_home_work")
	public byte[] getUploadHomeWork() {
		return this.uploadHomeWork;
	}

	public void setUploadHomeWork(byte[] uploadHomeWork) {
		this.uploadHomeWork = uploadHomeWork;
	}

}
