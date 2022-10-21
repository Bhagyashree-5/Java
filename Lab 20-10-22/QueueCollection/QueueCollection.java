package lab;

import java.util.*;

public class QueueCollection {
	 public static void main(String[] args) 
	    {
	         Queue<Integer> Q = new LinkedList<Integer>();
	 
	        Q.add(07);
	        Q.add(18);
	        Q.add(05);
	        Q.add(29); 
	        
	        Iterator<Integer> it = Q.iterator();
	        System.out.println("Numbers of the queue: ");
	        while(it.hasNext()) {
	           System.out.println(it.next());
	        }

	 
	        // Peek Method
	        System.out.println("Queue's peek method: " + Q.peek());
	 
	         // Poll Method
	        System.out.println("Queue's poll method: " + Q.poll()); 

	         // Remove Method
	        System.out.println("Queue's remove method: " + Q.remove()); 
	        
	        // Pop Method
	        System.out.println("Queue's poll method: " + ((LinkedList<Integer>) Q).pop()); 


	    }
	}


