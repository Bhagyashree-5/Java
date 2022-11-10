package jdbc;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();
		nmap.put(201, "Bhagyashree");
		nmap.put(202, "Ashutosh");
		nmap.put(203, "Vikas");
		nmap.put(204, "Pratham");
		nmap.put(205, "Rupam");
		nmap.put(206, "Gyanendra");
		nmap.put(207, "Rajnish");
		
		//Returns key-value pairs whose keys are less than the specified key.  
		System.out.println("headMap: "+ nmap.headMap(202));  
		//Returns key-value pairs whose keys are greater than or equal to the specified key.  
		System.out.println("tailMap: "+ nmap.tailMap(204));  
		//Returns key-value pairs exists in between the specified key.  
		System.out.println("subMap: "+ nmap.subMap(201, 205));   
		
	}

}
