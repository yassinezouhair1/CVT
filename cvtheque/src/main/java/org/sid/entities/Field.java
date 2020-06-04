package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Field  implements Serializable {
	@Id @GeneratedValue
	private long id;
	private String code;
	private String label ;
	@OneToMany(mappedBy = "field", fetch = FetchType.LAZY)
	private Collection<Profil> profil;
	public Field() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Field(String code, String label, Collection<Profil> profil) {
		super();
		this.code = code;
		this.label = label;
		this.profil = profil;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Collection<Profil> getProfil() {
		return profil;
	}
	public void setProfil(Collection<Profil> profil) {
		this.profil = profil;
	}

	

}
