package com.greatlearning.itsupport.model;

import java.util.Random;

import com.greatlearning.itsupport.service.Employee;

public class CredentialService {
	private String email;
	private char[] generatedPassword = new char[8];

	public void generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "@!#$*&";
		Random random = new Random();

		String passwordGenetratorString = capitalLetters + smallLetters + numbers + symbols;
		for (int i = 0; i < 8; i++) {
			int randomNumber = random.nextInt(passwordGenetratorString.length());
			generatedPassword[i] = passwordGenetratorString.charAt(randomNumber);			
		}
	}

	public void generateEmailAddress(String department, Employee employeeInfo) {
		email = employeeInfo.getFirstName().toLowerCase() + employeeInfo.getLastName().toLowerCase() + "@" + department
				+ ".greatlearning.com";
	}

	public void showCredentials() {
		String password = new String(generatedPassword);

		System.out.println("Dear Harshit your generated credentials are as follows");
		System.out.println("Email ---> " + email);
		System.out.println("Password ---> " + password);
	}
}
