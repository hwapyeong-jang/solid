package controller;

import entity.Customer;
import param.CustomerParam;
import service.CustomerService;
import service.CustomerServiceFactory;

public class CustomerController {

    private final CustomerServiceFactory customerServiceFactory;

    public CustomerController(CustomerServiceFactory customerServiceFactory) {
        this.customerServiceFactory = customerServiceFactory;
    }

    /**
     * POST /api/customer
     */
    public Customer create(CustomerParam customerParam) {
        CustomerService customerService = customerServiceFactory.getCustomerService(customerParam.getType());
        return customerService.create(customerParam);
    }

}
