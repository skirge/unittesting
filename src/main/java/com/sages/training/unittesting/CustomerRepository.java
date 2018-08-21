package com.sages.training.unittesting;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getAll();

    void add(Customer c);
}
