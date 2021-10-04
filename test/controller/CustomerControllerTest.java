package controller;

import entity.Customer;
import param.CustomerParam;
import repository.CustomerRepository;
import service.CustomerServiceFactory;
import service.CustomerServiceFactoryImpl;

public class CustomerControllerTest {

    private static CustomerController customerController;

    public static void main(String[] args) {
        init();
        testCreateLocalCustomer();
        testCreateForeignCustomer();
    }

    private static void init() {
        CustomerRepository customerRepository = new CustomerRepository();
        CustomerServiceFactory customerServiceFactory = new CustomerServiceFactoryImpl(customerRepository);
        customerController = new CustomerController(customerServiceFactory);
    }

    private static void testCreateLocalCustomer() {
        System.out.println("\n# Start CustomerControllerTest::testCreateLocalCustomer Test!");

        // given
        String givenName = "장화평";
        Integer givenAge = 31;
        CustomerParam.Type givenType = CustomerParam.Type.LOCAL;
        CustomerParam givenCustomerParam = new CustomerParam(givenName, givenAge, givenType);

        // when
        Customer expectedCustomer = customerController.create(givenCustomerParam);

        // then
        assertForUpdate(givenCustomerParam, expectedCustomer);

        System.out.println("\n# End CustomerControllerTest::testCreateLocalCustomer Test!");
    }

    private static void testCreateForeignCustomer() {
        System.out.println("\n# Start CustomerControllerTest::testCreateForeignCustomer Test!");

        // given
        String givenFirstName = "Hwapyeong";
        String givenLastName = "Jang";
        Integer givenAge = 99;
        CustomerParam.Type givenType = CustomerParam.Type.FOREIGN;
        CustomerParam givenCustomerParam = new CustomerParam(
                givenFirstName, givenLastName, givenAge, givenType);

        // when
        Customer expectedCustomer = customerController.create(givenCustomerParam);

        // then
        assertForUpdate(givenCustomerParam, expectedCustomer);

        System.out.println("\n# End CustomerControllerTest::testCreateForeignCustomer Test!");
    }

    private static void assertForUpdate(CustomerParam givenCustomerParam, Customer expectedCustomer) {
        assert givenCustomerParam.getName().equals(expectedCustomer.getName());
        assert givenCustomerParam.getAge().equals(expectedCustomer.getAge());
    }
}
