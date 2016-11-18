package ea.project.serviceImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import ea.project.domain.customer.Customer;
import ea.project.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService {
	private Map<String, Customer> customers = new HashMap<String, Customer>();

	public void addCustomer(Customer customer) {
		//System.out.println("Adding: "+customer.getCustomerName() + " " + customer.getCustomerNumber());
		customers.put(customer.getCustomerId(), customer);
	}

	public void deleteCustomer(String customerNumber) {
		System.out.println("deleting: "+customerNumber);
		customers.remove(customerNumber);
	}

	public Customer getCustomer(String customerNumber) {
		System.out.println("Retrieving: "+customerNumber);
		return customers.get(customerNumber);
	}

	public Collection<Customer> getCustomers() {
		System.out.println("Retrieving: "+customers.values());
		return customers.values();
	}

	public void updateCustomer(Customer customer) {
		System.out.println("Updating: "+customer);
		customers.put(customer.getCustomerId(), customer);
	}

}
