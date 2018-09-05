package com.pcs.pojo;
// Generated 5 Sep, 2018 6:08:07 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TutorSubjectId generated by hbm2java
 */
@Embeddable
public class TutorSubjectId implements java.io.Serializable {

	private String tutorId;
	private int subjectId;
	private String otherSubjectName;

	public TutorSubjectId() {
	}

	public TutorSubjectId(String tutorId, int subjectId) {
		this.tutorId = tutorId;
		this.subjectId = subjectId;
	}

	public TutorSubjectId(String tutorId, int subjectId, String otherSubjectName) {
		this.tutorId = tutorId;
		this.subjectId = subjectId;
		this.otherSubjectName = otherSubjectName;
	}

	@Column(name = "TUTOR_ID", nullable = false, length = 10)
	public String getTutorId() {
		return this.tutorId;
	}

	public void setTutorId(String tutorId) {
		this.tutorId = tutorId;
	}

	@Column(name = "SUBJECT_ID", nullable = false)
	public int getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	@Column(name = "OTHER_SUBJECT_NAME", length = 200)
	public String getOtherSubjectName() {
		return this.otherSubjectName;
	}

	public void setOtherSubjectName(String otherSubjectName) {
		this.otherSubjectName = otherSubjectName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TutorSubjectId))
			return false;
		TutorSubjectId castOther = (TutorSubjectId) other;

		return ((this.getTutorId() == castOther.getTutorId()) || (this.getTutorId() != null
				&& castOther.getTutorId() != null && this.getTutorId().equals(castOther.getTutorId())))
				&& (this.getSubjectId() == castOther.getSubjectId())
				&& ((this.getOtherSubjectName() == castOther.getOtherSubjectName())
						|| (this.getOtherSubjectName() != null && castOther.getOtherSubjectName() != null
								&& this.getOtherSubjectName().equals(castOther.getOtherSubjectName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTutorId() == null ? 0 : this.getTutorId().hashCode());
		result = 37 * result + this.getSubjectId();
		result = 37 * result + (getOtherSubjectName() == null ? 0 : this.getOtherSubjectName().hashCode());
		return result;
	}

}