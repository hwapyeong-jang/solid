package service;

import param.CustomerParam;

public interface CustomerServiceFactory {

    CustomerService getCustomerService(CustomerParam.Type type);

}