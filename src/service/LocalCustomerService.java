package service;

import dto.LocalCustomerDto;
import entity.Customer;
import param.CustomerParam;
import repository.CustomerRepository;

public class LocalCustomerService implements CustomerService {

    private final CustomerRepository customerRepository;

    public LocalCustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer create(CustomerParam customerParam) {
        LocalCustomerDto localCustomerDto = LocalCustomerDto.of(customerParam);
        return customerRepository.save(Customer.of(localCustomerDto));
    }

}
