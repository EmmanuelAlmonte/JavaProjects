package org.chubb.springdata.repository;

import org.chubb.springdata.entity.Customer;

public interface CustomerDAO {
  public void insert(Customer customer);

  public int remove(long phoneNo);
}
