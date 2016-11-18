package ea.project.service;

import java.util.Collection;

import ea.project.domain.customer.Customer;

public interface ICustomerService {
	public void addCustomer(Customer customer);
	public void deleteCustomer(String customerNumber);
	public void updateCustomer(Customer customer);
	public Collection<Customer> getCustomers();
	public Customer getCustomer(String customerNumber);
}
