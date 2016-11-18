package ea.project.domain;

import java.util.Date;

import javax.persistence.Lob;
import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class PersonalDetail {
	@NotEmpty(message="The first name must not be null")
	private
	String firstName;
	
	@NotEmpty(message="The middle name must not be null")
	private
	String middleName;
	
	@NotEmpty(message="The last name must not be null")
	private
	String lastName;
	
	@Lob
	@DateTimeFormat(pattern="MM/dd/yyyy")
    @Past
    @NotEmpty(message="The date of birthday must not be null")
	private
	Date DateOfBirth;
	
	String title;
	
	@NotEmpty(message = "The customer email must not be null")
	@Pattern(regexp = ".+@.+\\..+", message = "Wrong email")
	private String customerEmail;
	
	
	 /* if (phoneNo.matches("\\d{10}")) return true;
      //validating phone number with -, . or spaces
      else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
      //validating phone number with extension length from 3 to 5
      else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
      //validating phone number where area code is in braces ()
      else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;*/
	@NotEmpty(message = "The phone must not be valid")
	 //validating phone number with -, . or spaces
	@Pattern(regexp = "\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}", message = "Incorrect Phone Format")
	private String customerPhone;

	@NotEmpty(message = "The customer username must not be null")
	private String username;

	@NotEmpty(message = "The customer password must not be null")
	@Length(min = 6, message = "Password should be more than 5 characters")
	private String password;
	
	//Driver license
	@NotEmpty(message = "The customer password must not be null")
	private
	String driverLicenceNumber;
	
	private String driverLicenceUsingCountryOrState;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
    @Future
    @NotEmpty(message="The driver licence expiration date must not be null")
	private
	String driverLicenceNumberExpirationDate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriverLicenceNumber() {
		return driverLicenceNumber;
	}

	public void setDriverLicenceNumber(String driverLicenceNumber) {
		this.driverLicenceNumber = driverLicenceNumber;
	}

	public String getDriverLicenceUsingCountryOrState() {
		return driverLicenceUsingCountryOrState;
	}

	public void setDriverLicenceUsingCountryOrState(String driverLicenceUsingCountryOrState) {
		this.driverLicenceUsingCountryOrState = driverLicenceUsingCountryOrState;
	}

	public String getDriverLicenceNumberExpirationDate() {
		return driverLicenceNumberExpirationDate;
	}

	public void setDriverLicenceNumberExpirationDate(String driverLicenceNumberExpirationDate) {
		this.driverLicenceNumberExpirationDate = driverLicenceNumberExpirationDate;
	}
}
