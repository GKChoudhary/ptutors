package com.pcs.pojo;
// Generated 5 Sep, 2018 6:08:07 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TutorUgEducationId generated by hbm2java
 */
@Embeddable
public class TutorUgEducationId implements java.io.Serializable {

	private String tutorId;
	private Integer courseId;
	private String otherCourseName;
	private Integer subjectId;
	private String otherSubjectName;
	private Integer universityInstituteId;
	private String otherUniversityName;
	private Integer yearOfPassout;
	private String resultStandard;

	public TutorUgEducationId() {
	}

	public TutorUgEducationId(String tutorId) {
		this.tutorId = tutorId;
	}

	public TutorUgEducationId(String tutorId, Integer courseId, String otherCourseName, Integer subjectId,
			String otherSubjectName, Integer universityInstituteId, String otherUniversityName, Integer yearOfPassout,
			String resultStandard) {
		this.tutorId = tutorId;
		this.courseId = courseId;
		this.otherCourseName = otherCourseName;
		this.subjectId = subjectId;
		this.otherSubjectName = otherSubjectName;
		this.universityInstituteId = universityInstituteId;
		this.otherUniversityName = otherUniversityName;
		this.yearOfPassout = yearOfPassout;
		this.resultStandard = resultStandard;
	}

	@Column(name = "tutor_id", nullable = false, length = 10)
	public String getTutorId() {
		return this.tutorId;
	}

	public void setTutorId(String tutorId) {
		this.tutorId = tutorId;
	}

	@Column(name = "course_id")
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Column(name = "other_course_name", length = 200)
	public String getOtherCourseName() {
		return this.otherCourseName;
	}

	public void setOtherCourseName(String otherCourseName) {
		this.otherCourseName = otherCourseName;
	}

	@Column(name = "subject_id")
	public Integer getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	@Column(name = "other_subject_name", length = 200)
	public String getOtherSubjectName() {
		return this.otherSubjectName;
	}

	public void setOtherSubjectName(String otherSubjectName) {
		this.otherSubjectName = otherSubjectName;
	}

	@Column(name = "university_institute_id")
	public Integer getUniversityInstituteId() {
		return this.universityInstituteId;
	}

	public void setUniversityInstituteId(Integer universityInstituteId) {
		this.universityInstituteId = universityInstituteId;
	}

	@Column(name = "other_university_name", length = 200)
	public String getOtherUniversityName() {
		return this.otherUniversityName;
	}

	public void setOtherUniversityName(String otherUniversityName) {
		this.otherUniversityName = otherUniversityName;
	}

	@Column(name = "year_of_passout")
	public Integer getYearOfPassout() {
		return this.yearOfPassout;
	}

	public void setYearOfPassout(Integer yearOfPassout) {
		this.yearOfPassout = yearOfPassout;
	}

	@Column(name = "result_standard", length = 50)
	public String getResultStandard() {
		return this.resultStandard;
	}

	public void setResultStandard(String resultStandard) {
		this.resultStandard = resultStandard;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TutorUgEducationId))
			return false;
		TutorUgEducationId castOther = (TutorUgEducationId) other;

		return ((this.getTutorId() == castOther.getTutorId()) || (this.getTutorId() != null
				&& castOther.getTutorId() != null && this.getTutorId().equals(castOther.getTutorId())))
				&& ((this.getCourseId() == castOther.getCourseId()) || (this.getCourseId() != null
						&& castOther.getCourseId() != null && this.getCourseId().equals(castOther.getCourseId())))
				&& ((this.getOtherCourseName() == castOther.getOtherCourseName())
						|| (this.getOtherCourseName() != null && castOther.getOtherCourseName() != null
								&& this.getOtherCourseName().equals(castOther.getOtherCourseName())))
				&& ((this.getSubjectId() == castOther.getSubjectId()) || (this.getSubjectId() != null
						&& castOther.getSubjectId() != null && this.getSubjectId().equals(castOther.getSubjectId())))
				&& ((this.getOtherSubjectName() == castOther.getOtherSubjectName())
						|| (this.getOtherSubjectName() != null && castOther.getOtherSubjectName() != null
								&& this.getOtherSubjectName().equals(castOther.getOtherSubjectName())))
				&& ((this.getUniversityInstituteId() == castOther.getUniversityInstituteId())
						|| (this.getUniversityInstituteId() != null && castOther.getUniversityInstituteId() != null
								&& this.getUniversityInstituteId().equals(castOther.getUniversityInstituteId())))
				&& ((this.getOtherUniversityName() == castOther.getOtherUniversityName())
						|| (this.getOtherUniversityName() != null && castOther.getOtherUniversityName() != null
								&& this.getOtherUniversityName().equals(castOther.getOtherUniversityName())))
				&& ((this.getYearOfPassout() == castOther.getYearOfPassout())
						|| (this.getYearOfPassout() != null && castOther.getYearOfPassout() != null
								&& this.getYearOfPassout().equals(castOther.getYearOfPassout())))
				&& ((this.getResultStandard() == castOther.getResultStandard())
						|| (this.getResultStandard() != null && castOther.getResultStandard() != null
								&& this.getResultStandard().equals(castOther.getResultStandard())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTutorId() == null ? 0 : this.getTutorId().hashCode());
		result = 37 * result + (getCourseId() == null ? 0 : this.getCourseId().hashCode());
		result = 37 * result + (getOtherCourseName() == null ? 0 : this.getOtherCourseName().hashCode());
		result = 37 * result + (getSubjectId() == null ? 0 : this.getSubjectId().hashCode());
		result = 37 * result + (getOtherSubjectName() == null ? 0 : this.getOtherSubjectName().hashCode());
		result = 37 * result + (getUniversityInstituteId() == null ? 0 : this.getUniversityInstituteId().hashCode());
		result = 37 * result + (getOtherUniversityName() == null ? 0 : this.getOtherUniversityName().hashCode());
		result = 37 * result + (getYearOfPassout() == null ? 0 : this.getYearOfPassout().hashCode());
		result = 37 * result + (getResultStandard() == null ? 0 : this.getResultStandard().hashCode());
		return result;
	}

}
