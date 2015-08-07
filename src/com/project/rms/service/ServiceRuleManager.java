package com.project.rms.service;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ServiceRuleManager
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public ServiceRule serviceRule;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ServiceRuleManager(){
		super();
		
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void retrieveRule() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void updateRule() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void deleteRule() {
		// TODO implement me	
	}

	public void createRule(String memberId, String ruleServiceName, String ruleServiceType, String ruleCategory,String ruleCategoryValue) {
		
		this.serviceRule= new ServiceRule();
		
		this.serviceRule.setRuleServiceName(ruleServiceName);
		this.serviceRule.setRuleCreator(memberId);
		this.serviceRule.setRuleServiceType(ruleServiceType);
		this.serviceRule.setRuleCategory(ruleCategory);
		this.serviceRule.setRuleCategoryValue(ruleCategoryValue);
		
		// TODO Auto-generated method stub
		
		System.out.println("Rule successfully created with ID ");
		
	
		
	}
	
}

