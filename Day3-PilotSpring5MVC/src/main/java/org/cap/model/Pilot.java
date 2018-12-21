package org.cap.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.cap.controller.CustomAnnotation;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.lang.NonNull;

@Entity
public class Pilot {
	@Id
	@GeneratedValue
	private int pilotId;
	@NotEmpty(message="* First Name should not be empty") 
	@CustomAnnotation(value="Sri",message="FirstName must start with Sri")
	private String firstName;
	@NotEmpty(message = "* Last Name should not be empty")
	private String lastName;
	@Past(message = "* Please enter a past date")
	private Date dateOfBirth;
	@NotNull(message = "Should enter a date, can't be null")
	@Future(message = "* Date has to be a future date")
	private Date dateOfJoin;
	private Boolean isCertified;
	@Range(min = 1000, max = 100000, message = "* Salary must be between 1k to 1L")
	private double salary;

	public int getPilotId() {
		return pilotId;
	}

	public void setPilotId(int pilotId) {
		this.pilotId = pilotId;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public Boolean getIsCertified() {
		return isCertified;
	}

	public void setIsCertified(Boolean isCertified) {
		this.isCertified = isCertified;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Pilot(int pilotId, String firstName, String lastName, Date dateOfBirth, Date dateOfJoin, Boolean isCertified,
			double salary) {
		super();
		this.pilotId = pilotId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoin = dateOfJoin;
		this.isCertified = isCertified;
		this.salary = salary;
	}

	public Pilot() {

	}

	@Override
	public String toString() {
		return "Pilot [pilotId=" + pilotId + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", dateOfJoin=" + dateOfJoin + ", isCertified=" + isCertified + ", salary=" + salary
				+ "]";
	}

}
