package com.sages.training.unittesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Simple fake, without validation
public class CustomerRepositoryImpl implements CustomerRepository {

    private List<Customer> all = new ArrayList<Customer>();

    @Override
    public List<Customer> getAll() {
        return Collections.unmodifiableList(all);
    };

    @Override
    public void add(Customer c) {
        all.add(c);
    }
}
