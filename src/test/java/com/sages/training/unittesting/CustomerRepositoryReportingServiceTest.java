package com.sages.training.unittesting;

import org.junit.Assert;
import org.junit.Test;

public class CustomerRepositoryReportingServiceTest {

    @Test
    public void testReportingService() {
        CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();

        customerRepository.add(new Customer(21, "User1", "LastName1"));
        customerRepository.add(new Customer(0, "User2", "LastName2"));

        CustomerReportingService reportingService = new CustomerReportingService(customerRepository);

        String report = reportingService.generateReport();

        Assert.assertEquals(report, "User1 LastName1 21\r\nUser2 LastName2 0\r\n");
    }
}
