package ea.project.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Customer {

	@Id
	@GeneratedValue
	private String customerId;

	@Embedded
	private PersonalDetail personalDetail;
	
	@Embedded
	private BillingAddress billingAddress;
	
	@Embedded
	private CreditCard creditCard;

	public Customer() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Customer(PersonalDetail personalDetail, BillingAddress billingAddress, CreditCard creditCard) {
		// TODO Auto-generated constructor stub
		this.personalDetail = personalDetail;
		this.billingAddress = billingAddress;
		this.creditCard = creditCard;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public PersonalDetail getPersonalDetail() {
		return personalDetail;
	}

	public void setPersonalDetail(PersonalDetail personalDetail) {
		this.personalDetail = personalDetail;
	}
	
	@Override
	public String toString() {
		return personalDetail.getFirstName();
	}
}
