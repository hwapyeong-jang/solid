package dto;

import param.CustomerParam;

public class LocalCustomerDto extends CustomerDto {

    private LocalCustomerDto(CustomerParam customerParam) {
        super(customerParam.getName(), customerParam.getAge());
    }

    public static LocalCustomerDto of(CustomerParam customerParam) {
        return new LocalCustomerDto(customerParam);
    }

}
