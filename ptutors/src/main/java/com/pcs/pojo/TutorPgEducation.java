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
 * TutorPgEducation generated by hbm2java
 */
@Entity
@Table(name = "tutor_pg_education", catalog = "ptutors_db")
public class TutorPgEducation implements java.io.Serializable {

	private TutorPgEducationId id;
	private CourseName courseName;
	private Subject subject;
	private TutorDetails tutorDetails;
	private UniversityInstitute universityInstitute;

	public TutorPgEducation() {
	}

	public TutorPgEducation(TutorPgEducationId id, TutorDetails tutorDetails) {
		this.id = id;
		this.tutorDetails = tutorDetails;
	}

	public TutorPgEducation(TutorPgEducationId id, CourseName courseName, Subject subject, TutorDetails tutorDetails,
			UniversityInstitute universityInstitute) {
		this.id = id;
		this.courseName = courseName;
		this.subject = subject;
		this.tutorDetails = tutorDetails;
		this.universityInstitute = universityInstitute;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "tutorId", column = @Column(name = "tutor_id", nullable = false, length = 10)),
			@AttributeOverride(name = "courseId", column = @Column(name = "course_id")),
			@AttributeOverride(name = "otherCourseName", column = @Column(name = "other_course_name", length = 200)),
			@AttributeOverride(name = "subjectId", column = @Column(name = "subject_id")),
			@AttributeOverride(name = "otherSubjectName", column = @Column(name = "other_subject_name", length = 200)),
			@AttributeOverride(name = "universityInstituteId", column = @Column(name = "university_institute_id")),
			@AttributeOverride(name = "otherUniversityInstituteName", column = @Column(name = "other_university_institute_name", length = 200)),
			@AttributeOverride(name = "yearOfPassout", column = @Column(name = "year_of_passout")),
			@AttributeOverride(name = "resultStandard", column = @Column(name = "result_standard", length = 50)) })
	public TutorPgEducationId getId() {
		return this.id;
	}

	public void setId(TutorPgEducationId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id", insertable = false, updatable = false)
	public CourseName getCourseName() {
		return this.courseName;
	}

	public void setCourseName(CourseName courseName) {
		this.courseName = courseName;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id", insertable = false, updatable = false)
	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tutor_id", nullable = false, insertable = false, updatable = false)
	public TutorDetails getTutorDetails() {
		return this.tutorDetails;
	}

	public void setTutorDetails(TutorDetails tutorDetails) {
		this.tutorDetails = tutorDetails;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "university_institute_id", insertable = false, updatable = false)
	public UniversityInstitute getUniversityInstitute() {
		return this.universityInstitute;
	}

	public void setUniversityInstitute(UniversityInstitute universityInstitute) {
		this.universityInstitute = universityInstitute;
	}

}
