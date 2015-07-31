package com.project.rms.service;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class PrivateTaxi implements ServiceType
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Service> service;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public PrivateTaxi(){
		super();
		
		System.out.println("Testing Github Commit Again");
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void computeBaseFare() {
		// TODO implement me	
	}
	
	
	public static void main(String args[]){

		 HashSet<String> tree = new HashSet<String>();
			tree.add("WC");
			tree.add("Taxi");
			tree.add("RC");
			
			

		 
			// here it test it's sorted, 63 is the last element. see output below
			Iterator<String> iterator = tree.iterator();
			System.out.print("Tree set data: ");
		 
			// Displaying the Tree set data
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
			System.out.println();
		 
			// Check empty or not
			if (tree.isEmpty()) {
				System.out.print("Tree Set is empty.");
			} else {
				System.out.println("Tree Set size: " + tree.size());
			}
		 
			// Retrieve first data from tree set
			System.out.println("First data: ");
		 
			// Retrieve last data from tree set
		//	System.out.println("Last data: " + tree.last());
		 
			if (tree.remove("WC")) { // remove element by value
				System.out.println("Data is removed from tree set");
			} else {
				System.out.println("Data doesn't exist!");
			}
			
			Iterator<String> iterator1 = tree.iterator();
			while (iterator1.hasNext()) {
				System.out.print(iterator1.next() + " ");
			}
			
		    
	
	Map<String, String> m1 = new TreeMap<String, String>(); // or new TreeMap() will order based on keys
	m1.put("Windows", "2000");
	m1.put("Windows", "XP");
	m1.put("Language", "Java");
	m1.put("Website", "programcreek.com");
	System.out.println("Map Elements");
	System.out.print("\t" + m1);

}
}
