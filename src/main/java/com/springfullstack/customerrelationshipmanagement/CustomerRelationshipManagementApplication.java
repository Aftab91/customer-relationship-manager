package com.springfullstack.customerrelationshipmanagement;

import com.springfullstack.customerrelationshipmanagement.entity.Customer;
import com.springfullstack.customerrelationshipmanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerRelationshipManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRelationshipManagementApplication.class, args);
	}

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void run(String... args) throws Exception {

//		Customer customer1= new Customer("Aftab","Shaik","shaikaftab02@gmail.com","Accenture");
//		customerRepository.save(customer1);
////
//		Customer customer2= new Customer("Bharath","Sunkara","bharath@gmail.com","Infosys");
//		customerRepository.save(customer2);
//////
//		Customer customer3= new Customer("tony","Stark","tonystrak@gmail.com","IBM");
//		customerRepository.save(customer3);
//		Customer customer4= new Customer("philips","bijoy","philipsbijoy8@gmail.com","IBM");
//		customerRepository.save(customer4);
//
//		Customer customer= new Customer("Bharath","Sunkara","bharathsunkara@gmail.com","Sacred Heart Uni");
//		customerRepository.deleteAll();


	}
}
