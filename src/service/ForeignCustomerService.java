package service;

import dto.ForeignCustomerDto;
import entity.Customer;
import param.CustomerParam;
import repository.CustomerRepository;

public class ForeignCustomerService implements CustomerService {

    private final CustomerRepository customerRepository;

    public ForeignCustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer create(CustomerParam customerParam) {
        ForeignCustomerDto foreignCustomerDto = ForeignCustomerDto.of(customerParam);
        return customerRepository.save(Customer.of(foreignCustomerDto));
    }
}
