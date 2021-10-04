package service;

import entity.Customer;
import param.CustomerParam;

public interface CustomerService {

    Customer create(CustomerParam customerParam);

}
