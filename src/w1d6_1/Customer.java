package w1d6_1;

public class Customer {
	private String firstName;
	private String lastName;
	private Address address;
	private String phone;
	private String email;
	//public String getFirstName;
public Customer(String fname, String lname, Address add,
		String phone, String email){
	this.address= add;
	this.firstName= fname;
	this.lastName= lname;
	this.phone = phone;
	this.email= email;
	
	
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phone=" + phone
			+ ", email=" + email + "]";
}

}
