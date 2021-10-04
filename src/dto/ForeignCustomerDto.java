package dto;

import param.CustomerParam;

public class ForeignCustomerDto extends CustomerDto {

    private ForeignCustomerDto(CustomerParam customerParam) {
        super();
        super.setName(customerParam.getFirstName() + " " + customerParam.getLastName());
        super.setAge(customerParam.getAge());
    }

    public static ForeignCustomerDto of(CustomerParam customerParam) {
        return new ForeignCustomerDto(customerParam);
    }
}
