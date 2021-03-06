package com.pcs.pojo;
// Generated 5 Sep, 2018 6:08:07 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TutorTeachingOption generated by hbm2java
 */
@Entity
@Table(name = "tutor_teaching_option", catalog = "ptutors_db")
public class TutorTeachingOption implements java.io.Serializable {

	private TutorTeachingOptionId id;
	private TeachingOption teachingOption;
	private TutorDetails tutorDetails;

	public TutorTeachingOption() {
	}

	public TutorTeachingOption(TutorTeachingOptionId id, TeachingOption teachingOption, TutorDetails tutorDetails) {
		this.id = id;
		this.teachingOption = teachingOption;
		this.tutorDetails = tutorDetails;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "tutorId", column = @Column(name = "TUTOR_ID", nullable = false, length = 10)),
			@AttributeOverride(name = "teachingOptionId", column = @Column(name = "TEACHING_OPTION_ID", nullable = false)),
			@AttributeOverride(name = "otherTeachingOptionName", column = @Column(name = "OTHER_TEACHING_OPTION_NAME", length = 200)) })
	public TutorTeachingOptionId getId() {
		return this.id;
	}

	public void setId(TutorTeachingOptionId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEACHING_OPTION_ID", nullable = false, insertable = false, updatable = false)
	public TeachingOption getTeachingOption() {
		return this.teachingOption;
	}

	public void setTeachingOption(TeachingOption teachingOption) {
		this.teachingOption = teachingOption;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TUTOR_ID", nullable = false, insertable = false, updatable = false)
	public TutorDetails getTutorDetails() {
		return this.tutorDetails;
	}

	public void setTutorDetails(TutorDetails tutorDetails) {
		this.tutorDetails = tutorDetails;
	}

}
