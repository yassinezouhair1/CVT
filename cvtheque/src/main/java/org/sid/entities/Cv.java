package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cv  implements Serializable {
	@Id @GeneratedValue
private	long id ;
private String documentName;
public Cv() {
	super();
	// TODO Auto-generated constructor stub
}
public Cv(String documentName)  {
	super();
	this.documentName = documentName;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getDocumentName() {
	return documentName;
}
public void setDocumentName(String documentName) {
	this.documentName = documentName;
}

	

}
