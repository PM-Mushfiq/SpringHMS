package com.hms.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class SpringHmsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringHmsApplication.class, args);
		System.out.println("Test run for \"Spring HMS\"");

		try {
			// The newInstance() call is a work around for some broken Java implementations
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			//JOptionPane.showMessageDialog(null,"JDBC Driver load success");
			System.out.println("JDBC Driver loaded successfully");
		} catch (Exception ex) {
			// handle the error
			System.out.println("Problem with JDBC Driver"+ex.toString());
			//JOptionPane.showMessageDialog(null,JOptionPane.ERROR_MESSAGE+"Problem with JDBC Driver");
		}
	}

}
