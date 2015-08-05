package com.project.rms.request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

import com.project.rms.service.PrivateTaxi;
import com.project.rms.service.ServiceType;
import com.project.rms.request.ReqMgmtFacade;

public class RequestClient {
	public ReqMgmtFacade rFacade;

	public RequestClient() {

		rFacade = new ReqMgmtFacade();
	}

	public void createRequest() {

		// Reading input from member to create request

		

		System.out.println("Continue?[Y/N]");
		
		Scanner sc = new Scanner(System.in);

	
			System.out.println("\nPlease enter member account id ");
			String memberId = sc.nextLine();
			System.out.println("\nPlease enter pick up address");
			String pickAddr = sc.nextLine();
			System.out.println("\nPlease enter destination address");
			String destAddr = sc.nextLine();
			System.out.println("\nPlease enter pick up date and time in yyyy-MM-ddTHH:mm format");
			Date date = null;
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd':'HH:mm");

			while (date == null) {
				String line = sc.nextLine();
				try {
					date = format.parse(line);
				} catch (ParseException e) {
					System.out.println("Sorry, that's not valid. Please try again.");
				}
			}
			System.out.println("\nPlease enter service type \t 1: Private Taxi  \t 2: Shared Taxi");
			int serviceType = Integer.parseInt(sc.nextLine());
			
			System.out.println("\nPlease enter any extra features for the vehicle if required (ans y/n)");

			HashMap<String, String> features = new HashMap<String, String>();
			features.put("Wheel Chair", "n");
			features.put("No of Seats", "n");
			features.put("Bike Rack", "n");

			Iterator it = features.entrySet().iterator();
			
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				System.out.println("Add " + pair.getKey() + " feature ");
				pair.setValue(sc.nextLine());
				//
				// avoids a ConcurrentModificationException
			}

			System.out.println(features);

			
		//Create Request
			
		Request r =rFacade.createRequest(memberId,pickAddr,destAddr,date,serviceType,features);
		
		//rFacade.requests.add(r);
		
		
		
		//UpdateRequestState
		
		r.setrState(new ProcessingState());
		r.executeAction(rFacade);
		
		//
		
		// put request in queue and all
		
		
		//request.executeAction(this);


	}
	
	
}
