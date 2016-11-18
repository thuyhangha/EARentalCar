package ea.project.repository;

import java.util.List;
import java.util.Locale.Category;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ea.project.domain.customer.Customer;

/*@Repository
@Transactional*/
public class CustomerDao implements ICustomerDao {
   // @Autowired
    private SessionFactory sessionFactory;

    public List<Customer> getList() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer");
        List<Customer> customerList = query.list();
        session.flush();
        return customerList;
    }

    public Customer getOneById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = (Customer) session.get(Category.class, id);
        session.flush();
        return customer;
    }

    public void add(Customer domain) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(domain);
        session.flush();
    }

    public void edit(Customer domain) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(domain);
        session.flush();
    }

    public void delete(Customer domain) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(domain);
        session.flush();
    }
}
