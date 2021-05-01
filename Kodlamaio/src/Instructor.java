
public class Instructor extends User{
	private int Instructorid;
	private String firstName;
	private String lastName;
	private String certificates;
	
	public Instructor() {};
public Instructor(int Instructorid,String firstName,String lastName,String certificates){
	this();
	this.firstName=firstName;
	this.firstName=firstName;
	this.lastName=lastName;
	this.certificates=certificates;
};

public int getInstructorid() {
	return Instructorid;
}
public void setInstructorid(int instructorid) {
	Instructorid = instructorid;
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
public String getCertificates() {
	return certificates;
}
public void setCertificates(String certificates) {
	this.certificates = certificates;
}
	
	
}
