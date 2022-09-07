public class StarPattern
{ 
    public static void printStars(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) //outer loop 
         { 
           for(j=2*(n-i); j>=0; j--) // inner loop  
            {           
                System.out.print(" "); // printing space
            } 
            for(j=0; j<=i; j++) //  inner loop 
            {       
                System.out.print("* "); // print star
            }           
            System.out.println(); // ending line after each row
        } 
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n); 
    } 
}