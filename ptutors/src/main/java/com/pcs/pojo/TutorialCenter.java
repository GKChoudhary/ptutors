package com.pcs.pojo;
// Generated 5 Sep, 2018 6:08:07 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TutorialCenter generated by hbm2java
 */
@Entity
@Table(name = "tutorial_center", catalog = "ptutors_db")
public class TutorialCenter implements java.io.Serializable {

	private String instituteId;
	private CountryName countryName;
	private LocationName locationName;
	private SecretQuestion secretQuestion;
	private String instituteLoginName;
	private String instituteLoginPassword;
	private String instituteSecurityAnswer;
	private String instituteFullName;
	private Integer instituteCategoryId;
	private Integer instituteSubCategoryId;
	private String institutePrefaceInfo;
	private String instituteArea;
	private String instituteLandmark;
	private String institutePostalCode;
	private String instituteStateProvince;
	private String instituteAddress;
	private String instituteContactPerson;
	private String instituteTelephone;
	private String instituteMobile;
	private String instituteEmail;
	private String instituteWebsite;
	private String instituteCourses;
	private String instituteFaculty;
	private String instituteAchivement;
	private String instituteMembershipCategory;
	private Integer instituteMembershipDuration;
	private String instituteModeOfPayment;
	private BigDecimal institutePaymentAmount;
	private String institutePaymentId;
	private String instituteTransactionId;
	private Date institutePaymentDate;
	private Date instituteRegistrationDate;
	private Date instituteMembershipBeginDate;
	private Date instituteMembershipExpireWarningDate;
	private Date instituteMembershipExpireDate;
	private Byte imageFlag;

	public TutorialCenter() {
	}

	public TutorialCenter(String instituteId) {
		this.instituteId = instituteId;
	}

	public TutorialCenter(String instituteId, CountryName countryName, LocationName locationName,
			SecretQuestion secretQuestion, String instituteLoginName, String instituteLoginPassword,
			String instituteSecurityAnswer, String instituteFullName, Integer instituteCategoryId,
			Integer instituteSubCategoryId, String institutePrefaceInfo, String instituteArea, String instituteLandmark,
			String institutePostalCode, String instituteStateProvince, String instituteAddress,
			String instituteContactPerson, String instituteTelephone, String instituteMobile, String instituteEmail,
			String instituteWebsite, String instituteCourses, String instituteFaculty, String instituteAchivement,
			String instituteMembershipCategory, Integer instituteMembershipDuration, String instituteModeOfPayment,
			BigDecimal institutePaymentAmount, String institutePaymentId, String instituteTransactionId,
			Date institutePaymentDate, Date instituteRegistrationDate, Date instituteMembershipBeginDate,
			Date instituteMembershipExpireWarningDate, Date instituteMembershipExpireDate, Byte imageFlag) {
		this.instituteId = instituteId;
		this.countryName = countryName;
		this.locationName = locationName;
		this.secretQuestion = secretQuestion;
		this.instituteLoginName = instituteLoginName;
		this.instituteLoginPassword = instituteLoginPassword;
		this.instituteSecurityAnswer = instituteSecurityAnswer;
		this.instituteFullName = instituteFullName;
		this.instituteCategoryId = instituteCategoryId;
		this.instituteSubCategoryId = instituteSubCategoryId;
		this.institutePrefaceInfo = institutePrefaceInfo;
		this.instituteArea = instituteArea;
		this.instituteLandmark = instituteLandmark;
		this.institutePostalCode = institutePostalCode;
		this.instituteStateProvince = instituteStateProvince;
		this.instituteAddress = instituteAddress;
		this.instituteContactPerson = instituteContactPerson;
		this.instituteTelephone = instituteTelephone;
		this.instituteMobile = instituteMobile;
		this.instituteEmail = instituteEmail;
		this.instituteWebsite = instituteWebsite;
		this.instituteCourses = instituteCourses;
		this.instituteFaculty = instituteFaculty;
		this.instituteAchivement = instituteAchivement;
		this.instituteMembershipCategory = instituteMembershipCategory;
		this.instituteMembershipDuration = instituteMembershipDuration;
		this.instituteModeOfPayment = instituteModeOfPayment;
		this.institutePaymentAmount = institutePaymentAmount;
		this.institutePaymentId = institutePaymentId;
		this.instituteTransactionId = instituteTransactionId;
		this.institutePaymentDate = institutePaymentDate;
		this.instituteRegistrationDate = instituteRegistrationDate;
		this.instituteMembershipBeginDate = instituteMembershipBeginDate;
		this.instituteMembershipExpireWarningDate = instituteMembershipExpireWarningDate;
		this.instituteMembershipExpireDate = instituteMembershipExpireDate;
		this.imageFlag = imageFlag;
	}

	@Id

	@Column(name = "INSTITUTE_ID", unique = true, nullable = false, length = 10)
	public String getInstituteId() {
		return this.instituteId;
	}

	public void setInstituteId(String instituteId) {
		this.instituteId = instituteId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INSTITUTE_COUNTRY_CODE")
	public CountryName getCountryName() {
		return this.countryName;
	}

	public void setCountryName(CountryName countryName) {
		this.countryName = countryName;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INSTITUTE_LOCATION_ID")
	public LocationName getLocationName() {
		return this.locationName;
	}

	public void setLocationName(LocationName locationName) {
		this.locationName = locationName;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INSTITUTE_SECURITY_QUESTION_ID")
	public SecretQuestion getSecretQuestion() {
		return this.secretQuestion;
	}

	public void setSecretQuestion(SecretQuestion secretQuestion) {
		this.secretQuestion = secretQuestion;
	}

	@Column(name = "INSTITUTE_LOGIN_NAME", length = 200)
	public String getInstituteLoginName() {
		return this.instituteLoginName;
	}

	public void setInstituteLoginName(String instituteLoginName) {
		this.instituteLoginName = instituteLoginName;
	}

	@Column(name = "INSTITUTE_LOGIN_PASSWORD", length = 32)
	public String getInstituteLoginPassword() {
		return this.instituteLoginPassword;
	}

	public void setInstituteLoginPassword(String instituteLoginPassword) {
		this.instituteLoginPassword = instituteLoginPassword;
	}

	@Column(name = "INSTITUTE_SECURITY_ANSWER", length = 200)
	public String getInstituteSecurityAnswer() {
		return this.instituteSecurityAnswer;
	}

	public void setInstituteSecurityAnswer(String instituteSecurityAnswer) {
		this.instituteSecurityAnswer = instituteSecurityAnswer;
	}

	@Column(name = "INSTITUTE_FULL_NAME", length = 200)
	public String getInstituteFullName() {
		return this.instituteFullName;
	}

	public void setInstituteFullName(String instituteFullName) {
		this.instituteFullName = instituteFullName;
	}

	@Column(name = "INSTITUTE_CATEGORY_ID")
	public Integer getInstituteCategoryId() {
		return this.instituteCategoryId;
	}

	public void setInstituteCategoryId(Integer instituteCategoryId) {
		this.instituteCategoryId = instituteCategoryId;
	}

	@Column(name = "INSTITUTE_SUB_CATEGORY_ID")
	public Integer getInstituteSubCategoryId() {
		return this.instituteSubCategoryId;
	}

	public void setInstituteSubCategoryId(Integer instituteSubCategoryId) {
		this.instituteSubCategoryId = instituteSubCategoryId;
	}

	@Column(name = "INSTITUTE_PREFACE_INFO", length = 2000)
	public String getInstitutePrefaceInfo() {
		return this.institutePrefaceInfo;
	}

	public void setInstitutePrefaceInfo(String institutePrefaceInfo) {
		this.institutePrefaceInfo = institutePrefaceInfo;
	}

	@Column(name = "INSTITUTE_AREA", length = 100)
	public String getInstituteArea() {
		return this.instituteArea;
	}

	public void setInstituteArea(String instituteArea) {
		this.instituteArea = instituteArea;
	}

	@Column(name = "INSTITUTE_LANDMARK", length = 100)
	public String getInstituteLandmark() {
		return this.instituteLandmark;
	}

	public void setInstituteLandmark(String instituteLandmark) {
		this.instituteLandmark = instituteLandmark;
	}

	@Column(name = "INSTITUTE_POSTAL_CODE", length = 50)
	public String getInstitutePostalCode() {
		return this.institutePostalCode;
	}

	public void setInstitutePostalCode(String institutePostalCode) {
		this.institutePostalCode = institutePostalCode;
	}

	@Column(name = "INSTITUTE_STATE_PROVINCE", length = 200)
	public String getInstituteStateProvince() {
		return this.instituteStateProvince;
	}

	public void setInstituteStateProvince(String instituteStateProvince) {
		this.instituteStateProvince = instituteStateProvince;
	}

	@Column(name = "INSTITUTE_ADDRESS", length = 300)
	public String getInstituteAddress() {
		return this.instituteAddress;
	}

	public void setInstituteAddress(String instituteAddress) {
		this.instituteAddress = instituteAddress;
	}

	@Column(name = "INSTITUTE_CONTACT_PERSON", length = 200)
	public String getInstituteContactPerson() {
		return this.instituteContactPerson;
	}

	public void setInstituteContactPerson(String instituteContactPerson) {
		this.instituteContactPerson = instituteContactPerson;
	}

	@Column(name = "INSTITUTE_TELEPHONE", length = 20)
	public String getInstituteTelephone() {
		return this.instituteTelephone;
	}

	public void setInstituteTelephone(String instituteTelephone) {
		this.instituteTelephone = instituteTelephone;
	}

	@Column(name = "INSTITUTE_MOBILE", length = 20)
	public String getInstituteMobile() {
		return this.instituteMobile;
	}

	public void setInstituteMobile(String instituteMobile) {
		this.instituteMobile = instituteMobile;
	}

	@Column(name = "INSTITUTE_EMAIL", length = 200)
	public String getInstituteEmail() {
		return this.instituteEmail;
	}

	public void setInstituteEmail(String instituteEmail) {
		this.instituteEmail = instituteEmail;
	}

	@Column(name = "INSTITUTE_WEBSITE", length = 200)
	public String getInstituteWebsite() {
		return this.instituteWebsite;
	}

	public void setInstituteWebsite(String instituteWebsite) {
		this.instituteWebsite = instituteWebsite;
	}

	@Column(name = "INSTITUTE_COURSES", length = 1000)
	public String getInstituteCourses() {
		return this.instituteCourses;
	}

	public void setInstituteCourses(String instituteCourses) {
		this.instituteCourses = instituteCourses;
	}

	@Column(name = "INSTITUTE_FACULTY", length = 1000)
	public String getInstituteFaculty() {
		return this.instituteFaculty;
	}

	public void setInstituteFaculty(String instituteFaculty) {
		this.instituteFaculty = instituteFaculty;
	}

	@Column(name = "INSTITUTE_ACHIVEMENT", length = 1000)
	public String getInstituteAchivement() {
		return this.instituteAchivement;
	}

	public void setInstituteAchivement(String instituteAchivement) {
		this.instituteAchivement = instituteAchivement;
	}

	@Column(name = "INSTITUTE_MEMBERSHIP_CATEGORY", length = 200)
	public String getInstituteMembershipCategory() {
		return this.instituteMembershipCategory;
	}

	public void setInstituteMembershipCategory(String instituteMembershipCategory) {
		this.instituteMembershipCategory = instituteMembershipCategory;
	}

	@Column(name = "INSTITUTE_MEMBERSHIP_DURATION")
	public Integer getInstituteMembershipDuration() {
		return this.instituteMembershipDuration;
	}

	public void setInstituteMembershipDuration(Integer instituteMembershipDuration) {
		this.instituteMembershipDuration = instituteMembershipDuration;
	}

	@Column(name = "INSTITUTE_MODE_OF_PAYMENT", length = 100)
	public String getInstituteModeOfPayment() {
		return this.instituteModeOfPayment;
	}

	public void setInstituteModeOfPayment(String instituteModeOfPayment) {
		this.instituteModeOfPayment = instituteModeOfPayment;
	}

	@Column(name = "INSTITUTE_PAYMENT_AMOUNT", precision = 10)
	public BigDecimal getInstitutePaymentAmount() {
		return this.institutePaymentAmount;
	}

	public void setInstitutePaymentAmount(BigDecimal institutePaymentAmount) {
		this.institutePaymentAmount = institutePaymentAmount;
	}

	@Column(name = "INSTITUTE_PAYMENT_ID", length = 20)
	public String getInstitutePaymentId() {
		return this.institutePaymentId;
	}

	public void setInstitutePaymentId(String institutePaymentId) {
		this.institutePaymentId = institutePaymentId;
	}

	@Column(name = "INSTITUTE_TRANSACTION_ID", length = 20)
	public String getInstituteTransactionId() {
		return this.instituteTransactionId;
	}

	public void setInstituteTransactionId(String instituteTransactionId) {
		this.instituteTransactionId = instituteTransactionId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INSTITUTE_PAYMENT_DATE", length = 10)
	public Date getInstitutePaymentDate() {
		return this.institutePaymentDate;
	}

	public void setInstitutePaymentDate(Date institutePaymentDate) {
		this.institutePaymentDate = institutePaymentDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSTITUTE_REGISTRATION_DATE", length = 19)
	public Date getInstituteRegistrationDate() {
		return this.instituteRegistrationDate;
	}

	public void setInstituteRegistrationDate(Date instituteRegistrationDate) {
		this.instituteRegistrationDate = instituteRegistrationDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INSTITUTE_MEMBERSHIP_BEGIN_DATE", length = 10)
	public Date getInstituteMembershipBeginDate() {
		return this.instituteMembershipBeginDate;
	}

	public void setInstituteMembershipBeginDate(Date instituteMembershipBeginDate) {
		this.instituteMembershipBeginDate = instituteMembershipBeginDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INSTITUTE_MEMBERSHIP_EXPIRE_WARNING_DATE", length = 10)
	public Date getInstituteMembershipExpireWarningDate() {
		return this.instituteMembershipExpireWarningDate;
	}

	public void setInstituteMembershipExpireWarningDate(Date instituteMembershipExpireWarningDate) {
		this.instituteMembershipExpireWarningDate = instituteMembershipExpireWarningDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INSTITUTE_MEMBERSHIP_EXPIRE_DATE", length = 10)
	public Date getInstituteMembershipExpireDate() {
		return this.instituteMembershipExpireDate;
	}

	public void setInstituteMembershipExpireDate(Date instituteMembershipExpireDate) {
		this.instituteMembershipExpireDate = instituteMembershipExpireDate;
	}

	@Column(name = "IMAGE_FLAG")
	public Byte getImageFlag() {
		return this.imageFlag;
	}

	public void setImageFlag(Byte imageFlag) {
		this.imageFlag = imageFlag;
	}

}
