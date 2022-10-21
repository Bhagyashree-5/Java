package lab;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCollection {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		
		// Insertion
		lhm.put(1, "Bhagyashree");
		lhm.put(2, "Vikas");
		lhm.put(3, "Gyanendra");
		lhm.put(4, "Ashutosh");
		lhm.put(5, "Rupam");
		lhm.put(6, "Pratham");
		System.out.println("Insertion: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Updating
		lhm.replace(3, "Sapna");
		lhm.replace(6, "Manasi");
		lhm.replace(5, "Vandana");
		System.out.println("Updation: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Deleting
		lhm.remove(5);
		lhm.remove(2);
		lhm.remove(1);
		System.out.println("Deletion: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
	}

}


