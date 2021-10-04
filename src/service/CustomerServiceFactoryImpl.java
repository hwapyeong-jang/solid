package service;

import param.CustomerParam;
import repository.CustomerRepository;

public class CustomerServiceFactoryImpl implements CustomerServiceFactory {

    private final LocalCustomerService localCustomerService;
    private final ForeignCustomerService foreignCustomerService;

    public CustomerServiceFactoryImpl(CustomerRepository customerRepository) {
        this.localCustomerService = new LocalCustomerService(customerRepository);
        this.foreignCustomerService = new ForeignCustomerService(customerRepository);
    }

    @Override
    public CustomerService getCustomerService(CustomerParam.Type type) {
        if (type.isLocal()) {
            return localCustomerService;
        } else if (type.isForeign()) {
            return foreignCustomerService;
        }
        return localCustomerService;
    }
}
