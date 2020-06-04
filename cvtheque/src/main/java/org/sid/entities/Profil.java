package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity 
public class Profil  implements Serializable {
	@Id @GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	private int expereience;
	@ManyToOne
	@JoinColumn(name="CODE_CV")
	private Cv cv;
	
	
	
	
	@ManyToOne
	@JoinColumn(name="CODE_FIEL")
	private Field field;
	@OneToMany(mappedBy = "profil", fetch = FetchType.LAZY)
	private Collection<Skill> skill;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getExpereience() {
		return expereience;
	}
	public void setExpereience(int expereience) {
		this.expereience = expereience;
	}
	public Cv getCv() {
		return cv;
	}
	public void setCv(Cv cv) {
		this.cv = cv;
	}

	
	public Field getField() {
		return field;
	}
	public void setField(Field field) {
		this.field = field;
	}
	public Collection<Skill> getSkill() {
		return skill;
	}
	public void setSkill(Collection<Skill> skill) {
		this.skill = skill;
	}
	public Profil(String nom, String prenom, int expereience, Cv cv,   Field field,
			Collection<Skill> skill) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.expereience = expereience;
		this.cv = cv;
		this.field = field;
		this.skill = skill;
	}
	
	public Profil() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
