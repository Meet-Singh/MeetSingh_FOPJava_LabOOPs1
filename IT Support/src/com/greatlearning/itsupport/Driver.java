package com.greatlearning.itsupport;

import java.util.Scanner;

import com.greatlearning.itsupport.model.CredentialService;
import com.greatlearning.itsupport.service.Employee;

public class Driver {

	public static void main(String[] args) {
		int userDepartmentChoice;
		
		Scanner sc = new Scanner(System.in);
		CredentialService credentials = new CredentialService();
		Employee employee = new Employee("Harshit", "Choudary");

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		userDepartmentChoice = sc.nextInt();
		sc.close();
		
		switch (userDepartmentChoice) {
		case 1:
			credentials.generateEmailAddress("tech", employee);
			credentials.generatePassword();
			credentials.showCredentials();
			break;
		case 2:
			credentials.generateEmailAddress("admin", employee);
			credentials.generatePassword();
			credentials.showCredentials();
			break;
		case 3:
			credentials.generateEmailAddress("hr", employee);
			credentials.generatePassword();
			credentials.showCredentials();
			break;
		case 4:
			credentials.generateEmailAddress("legal", employee);
			credentials.generatePassword();
			credentials.showCredentials();
			break;
		default:
			System.out.println("Kindly enter the correct input and try again");
		}

	}

}
