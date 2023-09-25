package com.example.demo.appin;

import org.springframework.data.annotation.Id;

import com.example.demo.app.AppName;

import lombok.Data;

@Data
public class ClientId extends AppName {
	
	@Id
	public String id;
	
	private String cliNum;
	private String cliFirstName;
	private String cliLastName;

}
