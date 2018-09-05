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
 * TutorTeachingPatteren generated by hbm2java
 */
@Entity
@Table(name = "tutor_teaching_patteren", catalog = "ptutors_db")
public class TutorTeachingPatteren implements java.io.Serializable {

	private TutorTeachingPatterenId id;
	private TeachingPatteren teachingPatteren;
	private TutorDetails tutorDetails;

	public TutorTeachingPatteren() {
	}

	public TutorTeachingPatteren(TutorTeachingPatterenId id, TeachingPatteren teachingPatteren,
			TutorDetails tutorDetails) {
		this.id = id;
		this.teachingPatteren = teachingPatteren;
		this.tutorDetails = tutorDetails;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "tutorId", column = @Column(name = "TUTOR_ID", nullable = false, length = 10)),
			@AttributeOverride(name = "teachingPatterenId", column = @Column(name = "TEACHING_PATTEREN_ID", nullable = false)),
			@AttributeOverride(name = "otherTeachingPatterenName", column = @Column(name = "OTHER_TEACHING_PATTEREN_NAME", length = 200)) })
	public TutorTeachingPatterenId getId() {
		return this.id;
	}

	public void setId(TutorTeachingPatterenId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEACHING_PATTEREN_ID", nullable = false, insertable = false, updatable = false)
	public TeachingPatteren getTeachingPatteren() {
		return this.teachingPatteren;
	}

	public void setTeachingPatteren(TeachingPatteren teachingPatteren) {
		this.teachingPatteren = teachingPatteren;
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