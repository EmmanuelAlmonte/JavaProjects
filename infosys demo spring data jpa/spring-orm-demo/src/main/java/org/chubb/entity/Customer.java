package org.chubb.entity;

import org.chubb.dto.CustomerDTO;

import javax.persistence.*;

@Entity
public class Customer {
  @Id
  @Column(name = "phone_no")
  private Long phoneNumber;
  private String name;
  private Integer age;
  private Character gender;
  private String address;
  @Column(name = "plan_id")
  private Integer planId;

  // Constructor no arguments/parameters
  public Customer() {
  };

  public Customer(Long phoneNumber, String name, Integer age, Character gender, String address, Integer planId) {
    super();
    this.phoneNumber = phoneNumber;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.address = address;
    this.planId = planId;
  }

  public Long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Character getGender() {
    return gender;
  }

  public void setGender(Character gender) {
    this.gender = gender;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getPlanId() {
    return planId;
  }

  public void setPlanId(Integer planId) {
    this.planId = planId;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "phoneNumber=" + phoneNumber +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", gender=" + gender +
        ", address='" + address + '\'' +
        ", planId=" + planId +
        '}';
  }

  public static CustomerDTO prepareDTO(Customer customerEntity) {
    CustomerDTO custDTO = new CustomerDTO();
    custDTO.setPhoneNumber(customerEntity.getPhoneNumber());
    custDTO.setName(customerEntity.getName());
    custDTO.setGender(customerEntity.getGender());
    custDTO.setAge(customerEntity.getAge());
    custDTO.setAddress(customerEntity.getAddress());
    custDTO.setPlanId(customerEntity.getPlanId());
    return custDTO;
  }
}
