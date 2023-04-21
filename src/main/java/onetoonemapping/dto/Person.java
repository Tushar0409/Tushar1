package onetoonemapping.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
@Id
private int id;
private String name;
private long phone;
private String address;

@OneToOne
private AdharCard adharcard;

public AdharCard getAdharCard() {
	return adharcard;
}
public void setAdharCard(AdharCard adharcard) {
	this.adharcard = adharcard;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
}
