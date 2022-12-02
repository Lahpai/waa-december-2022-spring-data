package miu.edu.day3springdata.demo.dto;

import java.util.List;

public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private AddressDto address;
    private List<ReviewDto> review;

}
