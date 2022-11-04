package org.chubb.springdata.service;

import org.chubb.springdata.dto.CustomerDTO;

public interface CustomerService {

  public void insert(CustomerDTO customer);

  public int remove(Long phoneno);

}
