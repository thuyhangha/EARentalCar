package ea.project.domain;

import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;


public class BillingAddress {
	
	@NotEmpty(message="The street name must not be null")
	private String streetName;

	@NotEmpty(message="The city name must not be null")
	private String city;
	
	@NotEmpty(message="The state name must not be null")
	private String state;
	
	@NotEmpty(message="The country name must not be null")
	private String country;
	
	@NotEmpty(message="The zip code must be not null")
	@Pattern(regexp="[0-9]+", message="Wrong zip")
	private String zipCode;
	
	@OneToOne
    private Customer customer;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public String toString() {
        return "BillingAddress{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
	
	

}
