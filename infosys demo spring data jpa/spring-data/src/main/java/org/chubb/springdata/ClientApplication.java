package org.chubb.springdata;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.chubb.springdata.dto.CustomerDTO;
import org.chubb.springdata.service.CustomerService;
import org.chubb.springdata.service.CustomerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {
	static Logger logger = Logger.getLogger(ClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		// CustomerService customerService = new CustomerServiceImpl();
		// CustomerDTO customer = new CustomerDTO(7022713722L, "Lucy", 27, 'F', "INDIA",
		// 3);
		// customerService.insert(customer);
		// logger.info("Records are successfully added..");
		// System.out.println("Enter the phone Number of the Customer which has to be
		// deleted.");

		// Scanner scanner = new Scanner(System.in);
		// Long phoneNo = scanner.nextLong();
		// int result = customerService.remove(phoneNo);
		// if (result == 1) {
		// logger.info("Success : Record deleted");
		// } else {
		// logger.info("Error : No record found ");
		// }
		// scanner.close();
	}

}
