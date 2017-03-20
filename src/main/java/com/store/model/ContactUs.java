package com.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="contact_table")
public class ContactUs {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int contactId;
	
	@Column
	private String contactUserName;
	
	/*@Column
	private String contactLastName;*/
	
	@Column
	@Email
	private String contactEmail;
	
	/*@Column
	private String contactSubject;*/
	
	@Column(columnDefinition = "LONGTEXT")
	private String contactMessage;
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactUserName() {
		return contactUserName;
	}
	public void setContactUserName(String contactUserName) {
		this.contactUserName = contactUserName;
	}
	/*public String getContactLastName() {
		return contactLastName;
	}
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}*/
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	/*public String getContactSubject() {
		return contactSubject;
	}
	public void setContactSubject(String contactSubject) {
		this.contactSubject = contactSubject;
	}*/
	public String getContactMessage() {
		return contactMessage;
	}
	public void setContactMessage(String contactMessage) {
		this.contactMessage = contactMessage;
	}
	
	
	

}
