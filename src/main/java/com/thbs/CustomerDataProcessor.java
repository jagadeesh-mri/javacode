package com.thbs;
import java.util.HashMap;

public class CustomerDataProcessor {
	
	public CustomerDataProcessor() {
		System.out.println("CustomerDataProcessor.CustomerDataProcessor()");
	}
	
	public HashMap<String, String> process(String data,int age){
		
		
		System.out.println("CustomerDataProcessor.process()");
		
		String[] elements=data.split(";");
		
		HashMap<String, String> customer = new HashMap<String,String>();
		
		customer.put("id", elements[0]);
		customer.put("name", elements[1]);
		customer.put("phone", elements[2]);
		customer.put("address", elements[3]);
		customer.put("age", age+"");
		
		
		return customer;
	}
	
}
