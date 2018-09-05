package com.pcs.pojo;
// Generated 5 Sep, 2018 6:08:07 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Subject generated by hbm2java
 */
@Entity
@Table(name = "subject", catalog = "ptutors_db")
public class Subject implements java.io.Serializable {

	private Integer subjectId;
	private String subjectName;
	private Set<TutorPgEducation> tutorPgEducations = new HashSet<TutorPgEducation>(0);
	private Set<TutorUgEducation> tutorUgEducations = new HashSet<TutorUgEducation>(0);
	private Set<StudentDetails> studentDetailses = new HashSet<StudentDetails>(0);

	public Subject() {
	}

	public Subject(String subjectName) {
		this.subjectName = subjectName;
	}

	public Subject(String subjectName, Set<TutorPgEducation> tutorPgEducations, Set<TutorUgEducation> tutorUgEducations,
			Set<StudentDetails> studentDetailses) {
		this.subjectName = subjectName;
		this.tutorPgEducations = tutorPgEducations;
		this.tutorUgEducations = tutorUgEducations;
		this.studentDetailses = studentDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "SUBJECT_ID", unique = true, nullable = false)
	public Integer getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	@Column(name = "SUBJECT_NAME", nullable = false, length = 200)
	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
	public Set<TutorPgEducation> getTutorPgEducations() {
		return this.tutorPgEducations;
	}

	public void setTutorPgEducations(Set<TutorPgEducation> tutorPgEducations) {
		this.tutorPgEducations = tutorPgEducations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
	public Set<TutorUgEducation> getTutorUgEducations() {
		return this.tutorUgEducations;
	}

	public void setTutorUgEducations(Set<TutorUgEducation> tutorUgEducations) {
		this.tutorUgEducations = tutorUgEducations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
	public Set<StudentDetails> getStudentDetailses() {
		return this.studentDetailses;
	}

	public void setStudentDetailses(Set<StudentDetails> studentDetailses) {
		this.studentDetailses = studentDetailses;
	}

}