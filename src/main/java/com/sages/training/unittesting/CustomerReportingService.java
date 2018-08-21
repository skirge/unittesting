package com.sages.training.unittesting;

import java.util.stream.Collectors;

public class CustomerReportingService {

    private CustomerRepository customerRepository;

    public CustomerReportingService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String generateReport() {
        StringBuilder b = new StringBuilder();
        customerRepository.getAll().stream().map(c -> c.getFirstName() + " " + c.getLastName() + " " + c.getAge()+"\r\n")
                .forEach(b::append);
        return b.toString();
    }

}
