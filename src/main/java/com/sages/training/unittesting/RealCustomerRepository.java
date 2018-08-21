package com.sages.training.unittesting;

import java.util.List;

public class RealCustomerRepository {
    private List<Customer> all;


    public List<Customer> getAll() {
        return all;
    };


    public void add(Customer c) {
        // validate etc.
        assert isValid(c);
        all.add(c);
    }

    private boolean isValid(Customer c) {
        return c.getAge() > 0 &&
                c.getFirstName() != null &&
                c.getLastName() != null;
    }

}
