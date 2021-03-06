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
 * CcaTutorLanguage generated by hbm2java
 */
@Entity
@Table(name = "cca_tutor_language", catalog = "ptutors_db")
public class CcaTutorLanguage implements java.io.Serializable {

	private CcaTutorLanguageId id;
	private CcaTutor ccaTutor;

	public CcaTutorLanguage() {
	}

	public CcaTutorLanguage(CcaTutorLanguageId id) {
		this.id = id;
	}

	public CcaTutorLanguage(CcaTutorLanguageId id, CcaTutor ccaTutor) {
		this.id = id;
		this.ccaTutor = ccaTutor;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "tutorId", column = @Column(name = "tutor_id")),
			@AttributeOverride(name = "language", column = @Column(name = "language", length = 20)),
			@AttributeOverride(name = "status", column = @Column(name = "status", length = 10)) })
	public CcaTutorLanguageId getId() {
		return this.id;
	}

	public void setId(CcaTutorLanguageId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tutor_id", insertable = false, updatable = false)
	public CcaTutor getCcaTutor() {
		return this.ccaTutor;
	}

	public void setCcaTutor(CcaTutor ccaTutor) {
		this.ccaTutor = ccaTutor;
	}

}
