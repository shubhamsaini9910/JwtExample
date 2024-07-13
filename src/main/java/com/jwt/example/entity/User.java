package com.jwt.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	
	 private String userId;
	 
	 private String name;
	 
	 private String email;

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}

}
