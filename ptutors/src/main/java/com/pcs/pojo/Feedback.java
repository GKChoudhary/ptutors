package com.pcs.pojo;
// Generated 5 Sep, 2018 6:08:07 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Feedback generated by hbm2java
 */
@Entity
@Table(name = "feedback", catalog = "ptutors_db")
public class Feedback implements java.io.Serializable {

	private String feedbackId;
	private String personName;
	private String emailAddress;
	private String comments;
	private Date feedbackPostingDate;
	private Boolean feedbackVerificationFlag;

	public Feedback() {
	}

	public Feedback(String feedbackId) {
		this.feedbackId = feedbackId;
	}

	public Feedback(String feedbackId, String personName, String emailAddress, String comments,
			Date feedbackPostingDate, Boolean feedbackVerificationFlag) {
		this.feedbackId = feedbackId;
		this.personName = personName;
		this.emailAddress = emailAddress;
		this.comments = comments;
		this.feedbackPostingDate = feedbackPostingDate;
		this.feedbackVerificationFlag = feedbackVerificationFlag;
	}

	@Id

	@Column(name = "FEEDBACK_ID", unique = true, nullable = false, length = 50)
	public String getFeedbackId() {
		return this.feedbackId;
	}

	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}

	@Column(name = "PERSON_NAME", length = 200)
	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Column(name = "EMAIL_ADDRESS", length = 200)
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Column(name = "COMMENTS", length = 500)
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FEEDBACK_POSTING_DATE", length = 10)
	public Date getFeedbackPostingDate() {
		return this.feedbackPostingDate;
	}

	public void setFeedbackPostingDate(Date feedbackPostingDate) {
		this.feedbackPostingDate = feedbackPostingDate;
	}

	@Column(name = "FEEDBACK_VERIFICATION_FLAG")
	public Boolean getFeedbackVerificationFlag() {
		return this.feedbackVerificationFlag;
	}

	public void setFeedbackVerificationFlag(Boolean feedbackVerificationFlag) {
		this.feedbackVerificationFlag = feedbackVerificationFlag;
	}

}
