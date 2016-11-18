package ea.project.domain;

public class Customer_ {

	String customerNumber;
	String name;

	public Customer_() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Customer_(String customerNumber, String name) {
		// TODO Auto-generated constructor stub
		this.customerNumber = customerNumber;
		this.name = name;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return customerNumber+"\t"+name;
	}
}
