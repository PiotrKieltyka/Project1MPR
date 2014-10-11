package domain;

import java.util.*;

public class Person {

	private String firstName;
	private String surName;
	private String pesel;
	private String idNumber;
	private String birthDate;
	private User user;
	private List<Address> addresses;

public String getFirstName() {
return firstName;
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public String getSurName() {
return surName;
}
public void setSurName(String surName) {
this.surName = surName;
}
public String getPesel() {
return pesel;
}
public void setPesel(String pesel) {
this.pesel = pesel;
}
public String getIdNumber() {
return idNumber;
}
public void setIdNumber(String idNumber) {
this.idNumber = idNumber;
}
public String getBirthDate() {
return birthDate;
}
public void setBirthDate(String birthDate) {
this.birthDate = birthDate;
}
public User getUser() {
return user;
}
public void setUser(User user) {
this.user = user;
}
public List<Address> getAddresses() {
return addresses;
}
public void setAddresses(List<Address> addresses) {
this.addresses = addresses;
}

}