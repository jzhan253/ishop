package ishop.service;

import ishop.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ishop.dao.CustomerDao;
import ishop.model.Customer;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void addCustomer(Customer customer) {
        customer.getUser().setEnabled(true);

        Cart cart = new Cart();
        customer.setCart(cart);

        customerDao.addCustomer(customer);
    }

    public Customer getCustomerByUserName(String userName) {
        return customerDao.getCustomerByUserName(userName);
    }
}

