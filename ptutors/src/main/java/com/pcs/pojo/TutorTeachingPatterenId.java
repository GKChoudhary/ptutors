package com.pcs.pojo;
// Generated 5 Sep, 2018 6:08:07 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TutorTeachingPatterenId generated by hbm2java
 */
@Embeddable
public class TutorTeachingPatterenId implements java.io.Serializable {

	private String tutorId;
	private int teachingPatterenId;
	private String otherTeachingPatterenName;

	public TutorTeachingPatterenId() {
	}

	public TutorTeachingPatterenId(String tutorId, int teachingPatterenId) {
		this.tutorId = tutorId;
		this.teachingPatterenId = teachingPatterenId;
	}

	public TutorTeachingPatterenId(String tutorId, int teachingPatterenId, String otherTeachingPatterenName) {
		this.tutorId = tutorId;
		this.teachingPatterenId = teachingPatterenId;
		this.otherTeachingPatterenName = otherTeachingPatterenName;
	}

	@Column(name = "TUTOR_ID", nullable = false, length = 10)
	public String getTutorId() {
		return this.tutorId;
	}

	public void setTutorId(String tutorId) {
		this.tutorId = tutorId;
	}

	@Column(name = "TEACHING_PATTEREN_ID", nullable = false)
	public int getTeachingPatterenId() {
		return this.teachingPatterenId;
	}

	public void setTeachingPatterenId(int teachingPatterenId) {
		this.teachingPatterenId = teachingPatterenId;
	}

	@Column(name = "OTHER_TEACHING_PATTEREN_NAME", length = 200)
	public String getOtherTeachingPatterenName() {
		return this.otherTeachingPatterenName;
	}

	public void setOtherTeachingPatterenName(String otherTeachingPatterenName) {
		this.otherTeachingPatterenName = otherTeachingPatterenName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TutorTeachingPatterenId))
			return false;
		TutorTeachingPatterenId castOther = (TutorTeachingPatterenId) other;

		return ((this.getTutorId() == castOther.getTutorId()) || (this.getTutorId() != null
				&& castOther.getTutorId() != null && this.getTutorId().equals(castOther.getTutorId())))
				&& (this.getTeachingPatterenId() == castOther.getTeachingPatterenId())
				&& ((this.getOtherTeachingPatterenName() == castOther.getOtherTeachingPatterenName())
						|| (this.getOtherTeachingPatterenName() != null
								&& castOther.getOtherTeachingPatterenName() != null
								&& this.getOtherTeachingPatterenName()
										.equals(castOther.getOtherTeachingPatterenName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTutorId() == null ? 0 : this.getTutorId().hashCode());
		result = 37 * result + this.getTeachingPatterenId();
		result = 37 * result
				+ (getOtherTeachingPatterenName() == null ? 0 : this.getOtherTeachingPatterenName().hashCode());
		return result;
	}

}
