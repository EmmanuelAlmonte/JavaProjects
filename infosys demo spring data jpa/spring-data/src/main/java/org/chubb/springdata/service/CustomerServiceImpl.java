package org.chubb.springdata.service;

import org.chubb.springdata.dto.CustomerDTO;
import org.chubb.springdata.repository.CustomerDAO;
import org.chubb.springdata.repository.CustomerDAOImpl;
import org.springframework.stereotype.Service;

// @Service("customerService")
public class CustomerServiceImpl implements CustomerService {

  // @Autowired
  CustomerDAO customerDAO = new CustomerDAOImpl();

  @Override
  public void insert(CustomerDTO customer) {
    // TODO Auto-generated method stub
    customerDAO.insert(CustomerDTO.prepareCustomerEntity(customer));
  }

  @Override
  public int remove(Long phoneNo) {
    // TODO Auto-generated method stub
    return customerDAO.remove(phoneNo);
  }
}
