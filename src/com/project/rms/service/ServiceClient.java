package com.project.rms.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.project.rms.request.ProcessingState;
import com.project.rms.request.Request;

public class ServiceClient {

	public void createRule() {

		// Reading input from member to create request

		Scanner sc = new Scanner(System.in);

		System.out.println("\nPlease enter member account id ");
		String memberId = sc.nextLine();
		System.out.println(
				"\nPlease choose the service for the which the rule is being created \n Enter Uber or \t 2 YellowCab");
		String ruleServiceName = sc.nextLine();

		System.out.println(
				"\nPlease enter the type of service sub type for the which the rule is being created \n Enter Private or \t 2 Shared");

		String ruleServiceType = sc.nextLine();
		System.out.println("\nPlease enter rule category \n FareRule or \t LegalRule ");

		String ruleCategory = sc.nextLine();

		if (ruleCategory.equals("FareRule")) {
			System.out.println("\nPlease choose SurgePricing or Normal Pricing for the rule ");

			String ruleCategoryValue = sc.nextLine();
			ServiceRuleManager srm = new ServiceRuleManager();

			srm.createRule(memberId, ruleServiceName, ruleServiceType, ruleCategory, ruleCategoryValue);

		} else {

			System.out.println(
					"Currently we do not support to add legal rules for the type of service configuration selected");
		}

	}

	private void updateRule() {

		ServiceRuleManager srm = new ServiceRuleManager();
		Scanner sc = new Scanner(System.in);

		System.out.println("\nPlease enter rule id ");
		String ruleId = sc.nextLine();

		System.out.println("\nPlease enter the new  Service Rule Cateory Value");
		String ruleCategoryValue = sc.nextLine();

		srm.updateRule(ruleId, ruleCategoryValue);

	}

	private void retrieveRule() {

		ServiceRuleManager srm = new ServiceRuleManager();
		Scanner sc = new Scanner(System.in);

		System.out.println("\nPlease enter rule service name Uber or YellowCab");
		String ruleServiceName = sc.nextLine();

		System.out.println("\nPlease enter rule category name FareRule or LegalRule");
		String ruleCategory = sc.nextLine();

		srm.retrieveRule(ruleServiceName, ruleCategory);

	}

	private void deleteRule() {

		ServiceRuleManager srm = new ServiceRuleManager();
		Scanner sc = new Scanner(System.in);

		System.out.println("\nPlease enter rule id that you wish to delete");
		String ruleId = sc.nextLine();

		srm.deleteRule(ruleId);

	}

	public void processRuleRequest() {
		// TODO Auto-generated method stub

		System.out.println("Choose a valid option");
		System.out.println("1 Create Rule");
		System.out.println("2 Retrieve Rule");

		System.out.println("3 Update Rule");
		System.out.println("4 Delete Rule");

		System.out.println("5 Return to Main Menu");
		System.out.println("6 Exit");

		Scanner scan = new Scanner(System.in);
		int choice = Integer.parseInt(scan.nextLine());

		switch (choice) {
		case 1:
			System.out.println("Create  Rule");
			createRule();
			// call to fucn

			break;
		case 2:
			System.out.println("Retrieve Rule");
			retrieveRule();
			// call to funcn
			break;
		case 3:
			System.out.println("Update Rule");
			updateRule();
			break;

		case 4:
			System.out.println("Delete Rule");
			deleteRule();
			break;

		case 5:
			System.out.println("Exit");
			break;

		default:
			System.out.println("Invalid Option .... Please Try Again");
			break;
		}

	}

}
