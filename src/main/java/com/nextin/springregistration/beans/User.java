package com.nextin.springregistration.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
	private String userName;
	private String userEmail;
	private String userPhoneNumber;
	private String userPassword;
}
