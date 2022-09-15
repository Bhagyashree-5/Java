import java.util.Scanner; 

public class PrimeNumbers 
{
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number");
        int x = sc.nextInt();
        System.out.println ("Enter 2 number:");
        int y = sc.nextInt();  
        sc.close();
  
        range(x, y);
    }


    static void range(int a, int b)
     {
         for(;a<b ; a++)
          {
              prime(a);
          }
     }

     static void prime(int s)
     {
        int n=0;
        for (int i = 2; i<=s/2; i++)
         {
             if(s % i ==0)
             {
                n = 1;
             }
         }
         if(n==0)
         {
            System.out.println(s+ " is a prime number ");
         }
    }
}