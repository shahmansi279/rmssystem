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

public class RequestClient {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("rCount", "Enter the count");

		Request r = new Request();
		// map.put("rStatus", "Enter pickup time");
		ReqMgmtFacade rw = new ReqMgmtFacade();
		for (int i = 0; i < 4; i++) {

			Scanner time = new Scanner(System.in);

			DateFormat format = new SimpleDateFormat("yyyy-MM-dd':'HH:mm");
			System.out.println("Enter date and time in the format yyyy-MM-ddTHH:mm");
			System.out.println("For example, it is now " + format.format(new Date()));
			Date date = null;
			while (date == null) {
				String line = time.nextLine();
				try {
					date = format.parse(line);
				} catch (ParseException e) {
					System.out.println("Sorry, that's not valid. Please try again.");
				}
			}

			ServiceType pvt = new PrivateTaxi();
			Request rCtx = rw.createRequest("555 E El", "456 E El", date, pvt, "Car", "WheelChair");

			rw.addRequestToQueue(rCtx);

		}

	}

}
