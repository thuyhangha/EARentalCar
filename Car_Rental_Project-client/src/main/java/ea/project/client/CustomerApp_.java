package ea.project.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ea.project.domain.Customer;
import ea.project.domain.PersonalDetail;
import ea.project.service.ICustomerService;

public class CustomerApp_ {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		ICustomerService remoteService = context.getBean("customerServiceProxy", ICustomerService.class);

		// TODO add 3 customers & print customers list
		PersonalDetail personalDetail = new PersonalDetail();
		personalDetail.setFirstName("Hang");
		Customer cus1 = new Customer(personalDetail, null, null);	
		//remoteService.addCustomer(cus1);
		System.out.println(remoteService.getCustomers());
		
		// TODO update 1 customer & print customers list
		PersonalDetail personalDetail2 = new PersonalDetail();
		personalDetail2.setFirstName("Hang2");
		cus1.setPersonalDetail(personalDetail2);	
		remoteService.updateCustomer(cus1);
		System.out.println(remoteService.getCustomers());
		
		// TODO delete 1 customer & print customers list
		/*remoteService.deleteCustomer("101");
		System.out.println(remoteService.getCustomers());*/
	}

	/*public static void printCustomers(Collection<Customer> customers) {
		for (Customer customer : customers) {
			System.out.println(customer.getName() + " " + customer.getCustomerNumber());
		}
		System.out.println();
	}*/
}
