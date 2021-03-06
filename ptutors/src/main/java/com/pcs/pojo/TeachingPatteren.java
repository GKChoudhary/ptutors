package com.pcs.pojo;
// Generated 5 Sep, 2018 6:08:07 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TeachingPatteren generated by hbm2java
 */
@Entity
@Table(name = "teaching_patteren", catalog = "ptutors_db")
public class TeachingPatteren implements java.io.Serializable {

	private int teachingPatterenId;
	private String teachingPatterenName;
	private Set<TutorTeachingPatteren> tutorTeachingPatterens = new HashSet<TutorTeachingPatteren>(0);

	public TeachingPatteren() {
	}

	public TeachingPatteren(int teachingPatterenId, String teachingPatterenName) {
		this.teachingPatterenId = teachingPatterenId;
		this.teachingPatterenName = teachingPatterenName;
	}

	public TeachingPatteren(int teachingPatterenId, String teachingPatterenName,
			Set<TutorTeachingPatteren> tutorTeachingPatterens) {
		this.teachingPatterenId = teachingPatterenId;
		this.teachingPatterenName = teachingPatterenName;
		this.tutorTeachingPatterens = tutorTeachingPatterens;
	}

	@Id

	@Column(name = "TEACHING_PATTEREN_ID", unique = true, nullable = false)
	public int getTeachingPatterenId() {
		return this.teachingPatterenId;
	}

	public void setTeachingPatterenId(int teachingPatterenId) {
		this.teachingPatterenId = teachingPatterenId;
	}

	@Column(name = "TEACHING_PATTEREN_NAME", nullable = false, length = 45)
	public String getTeachingPatterenName() {
		return this.teachingPatterenName;
	}

	public void setTeachingPatterenName(String teachingPatterenName) {
		this.teachingPatterenName = teachingPatterenName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teachingPatteren")
	public Set<TutorTeachingPatteren> getTutorTeachingPatterens() {
		return this.tutorTeachingPatterens;
	}

	public void setTutorTeachingPatterens(Set<TutorTeachingPatteren> tutorTeachingPatterens) {
		this.tutorTeachingPatterens = tutorTeachingPatterens;
	}

}
