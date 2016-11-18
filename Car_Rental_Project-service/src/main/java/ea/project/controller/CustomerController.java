package ea.project.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import ea.project.domain.customer.Customer;
import ea.project.serviceImpl.CustomerService;

@Controller
@RequestMapping(value="/client")
public class CustomerController {
	private CustomerService customerService;
	@Autowired
	public void setCustomerService(CustomerService customerService){
		this.customerService = customerService;
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	 @ResponseStatus(HttpStatus.CREATED)
	 public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	 @RequestMapping(value = "/customer/{customerNumber}", method =
	 RequestMethod.DELETE)
	 @ResponseStatus(HttpStatus.OK)
	 //public RedirectView deleteCustomer(@PathVariable("customerNumber") String
	 public void deleteCustomer(@PathVariable("customerNumber") String
	 customerNumber) {
		 customerService.deleteCustomer(customerNumber);
	 }
	 
	 @RequestMapping(value = "/customer/{customerNumber}", method =
	 RequestMethod.GET)
	 public @ResponseBody Customer getCustomer(@PathVariable("customerNumber")
	 String customerNumber) {
		 return customerService.getCustomer(customerNumber);
	 }
	 
	 @RequestMapping(value = "/customers", method = RequestMethod.GET)
	 public @ResponseBody Collection<Customer> getCustomers() {
		 return customerService.getCustomers();
	 }
	 
	 @RequestMapping(value = "/customer/{customerNumber}", method =
	 RequestMethod.PUT)
	 @ResponseStatus(HttpStatus.OK)
	 public void updateCustomer(@RequestBody Customer customer) {
		 customerService.updateCustomer(customer);
	 }

}
