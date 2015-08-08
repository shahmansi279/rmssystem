package com.project.rms.service;

import java.util.ArrayList;

import com.project.rms.request.Trip;
import com.project.rms.vehicle.Vehicle;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */

public class ServiceRuleManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */

	public ServiceRule serviceRule;

	public ArrayList<ServiceRule> serviceArr;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ServiceRuleManager() {
		super();

		serviceArr = new ArrayList<ServiceRule>();

		ServiceRule s = new ServiceRule();
		s.setServiceRuleId("S0001");
		s.setRuleCategory("FareRule");
		s.setRuleCategoryValue("SurgingPrice");
		s.setRuleServiceName("Uber");
		s.setRuleServiceType("SharedTaxi");
		serviceArr.add(s);

		ServiceRule s1 = new ServiceRule();
		s1.setServiceRuleId("S0002");
		s1.setRuleCategory("FareRule");
		s1.setRuleCategoryValue("SurgingPrice");
		s1.setRuleServiceName("YellowCab");
		s1.setRuleServiceType("PrivateTaxi");
		serviceArr.add(s1);

	}

	// Retrieve Rule

	public ServiceRule retrieveRule(String ruleServiceName, String ruleCategory) {

		for (ServiceRule s : this.serviceArr) {

			if (s.getRuleServiceName().equals(ruleServiceName) && s.getRuleCategory().equals(ruleCategory)) {

				System.out.println("Fetching Service Rule details : \n The service rule is set to " + s.getRuleCategoryValue());
				return s;
			}
		}

		
		return null;
		
	}

	// Update Rule

	public void updateRule(String ruleId, String ruleCategoryValue) {

		for (ServiceRule s : this.serviceArr) {

			if (s.getServiceRuleId().equals(ruleId)) {

				s.setRuleCategoryValue(ruleCategoryValue);
				System.out.println("Updated Service Rule Category Value to " + ruleCategoryValue);
				return;
			}
		}

		System.out.println("Rule Not Found");
		// TODO Auto-generated method stub
		return;

		// TODO implement me
	}

	// Delete Rule

	public void deleteRule(String ruleId) {

		for (ServiceRule s : this.serviceArr) {

			if (s.getServiceRuleId().equals(ruleId)) {
				this.serviceArr.remove(s);
				System.out.println("Service Rule ID " + ruleId + " has been removed successfully");
			}
		}

		// TODO implement me
	}

	public void createRule(String memberId, String ruleServiceName, String ruleServiceType, String ruleCategory,
			String ruleCategoryValue) {

		this.serviceRule = new ServiceRule();

		this.serviceRule.setRuleServiceName(ruleServiceName);
		this.serviceRule.setRuleCreator(memberId);
		this.serviceRule.setRuleServiceType(ruleServiceType);
		this.serviceRule.setRuleCategory(ruleCategory);
		this.serviceRule.setRuleCategoryValue(ruleCategoryValue);

		// TODO Auto-generated method stub

		System.out.println("Rule successfully created with ID ");

	}

	ServiceRule generateServiceRuleRecord() {

		int serviceId = this.serviceArr.size();
		String serviceRuleId = "S000" + (serviceId + 1);

		ServiceRule s = new ServiceRule();
		s.setServiceRuleId(serviceRuleId);

		return s;

	}

}
