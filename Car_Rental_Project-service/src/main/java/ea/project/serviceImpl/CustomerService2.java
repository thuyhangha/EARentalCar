package ea.project.serviceImpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ea.project.domain.customer.Customer;
import ea.project.repository.ICustomerDao;

//@Service
// implements ICustomerService 
public class CustomerService2{
	// @Autowired
	 private ICustomerDao customerDao;

	public void addCustomer(Customer customer) {
		//System.out.println("Adding: "+customer.getCustomerName() + " " + customer.getCustomerNumber());
		customerDao.add(customer);
	}

	public void deleteCustomer(Customer customer) {
		customerDao.delete(customer);
	}

	public Customer getCustomer(Integer customerNumber) {
		return customerDao.getOneById(customerNumber);
	}

	public Collection<Customer> getCustomers() {
		return customerDao.getList();
	}

	public void updateCustomer(Customer customer) {
		customerDao.edit(customer);
	}

}
