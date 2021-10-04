package entity;

import dto.CustomerDto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Customer {

    private final String name;
    private final Integer age;
    private final LocalDateTime regDt;

    private Customer(CustomerDto customerDto) {
        this.name = customerDto.getName();
        this.age = customerDto.getAge();
        this.regDt = LocalDateTime.now();
    }

    public static Customer of(CustomerDto customerDto) {
        return new Customer(customerDto);
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String convertToStringFromRegDt() {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        return this.regDt.format(formatter);
    }

}
