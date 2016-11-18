package ea.project.controller;

import java.util.Collection;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import ea.project.domain.Customer;
import ea.project.service.ICustomerService;

public class CustomerServiceProxy implements ICustomerService {
	
	private static final String ServiceURL = "http://localhost:8080/Car_Rental_Project-service/rest";
	private static final String listURL = ServiceURL+"/client/customers";
	private static final String newCustomersURL = ServiceURL+"/client/customer";
	private static final String customerURL = ServiceURL+"/client/customer/{customerNumber}";

	private RestTemplate restTemplate;

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		restTemplate.postForObject(newCustomersURL, customer, Customer.class);
	}

	@Override
	public void deleteCustomer(String customerNumber) {
		// TODO Auto-generated method stub
		restTemplate.delete(customerURL, customerNumber);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		restTemplate.put(customerURL, customer, Customer.class);
	}

	@Override
	public Collection<Customer> getCustomers() {
		ParameterizedTypeReference<Collection<Customer>> typeRef = new ParameterizedTypeReference<Collection<Customer>>() {};
		ResponseEntity<Collection<Customer>> response = restTemplate.exchange(listURL, HttpMethod.GET, null, typeRef);
		return response.getBody();
	}

	@Override
	public Customer getCustomer(String customerNumber) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject(customerURL, Customer.class, customerNumber);
	}

}
