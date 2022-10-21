package lab;

import java.util.*;


public class HashMapCollection {
	public static void main(String[] args) {
		HashMap<Integer, String> numhm = new HashMap<Integer, String>();
		
		// Insertion
		numhm.put(1, "Bhagyashree");
		numhm.put(2, "Manasi");
		numhm.put(3, "Gyanendra");
		numhm.put(4, "Vikas");
		numhm.put(5, "Shuruti");
		numhm.put(6, "Pratham");
		System.out.println("Insertion: ");
		for(Map.Entry m:numhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
		System.out.println();
			
		// Deleting
				numhm.remove(3);
				numhm.remove(6);
				System.out.println("Deletion: ");
				for(Map.Entry m:numhm.entrySet()){    
				       System.out.println(m.getKey()+" "+m.getValue());    
				}
				System.out.println();
				
				// Replacing
				numhm.replace(2, "Ashutosh");
				numhm.replace(5, "Rupam");
				System.out.println("Updation: ");
				for(Map.Entry m:numhm.entrySet()){    
				       System.out.println(m.getKey()+" "+m.getValue()); 
		}
	}

}
