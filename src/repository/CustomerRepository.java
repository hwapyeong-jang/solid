package repository;

import entity.Customer;

public class CustomerRepository {

    public Customer save(Customer customer) {
        System.out.printf("Saved Customer {\n name: %s,\n age: %d,\n regDt: %s\n}", customer.getName(), customer.getAge(), customer.convertToStringFromRegDt());
        return customer;
    }

}
