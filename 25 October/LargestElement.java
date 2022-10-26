package Task;

public class LargestElement {
	 public static int getLargest(int[] a, int total){  
		    int temp;  
		        for (int i = 0; i < total; i++)   
		                {  
		                    for (int j = i + 1; j < total; j++)   
		                    {  
		                        if (a[i] > a[j])   
		                        {  
		                            temp = a[i];  
		                            a[i] = a[j];  
		                            a[j] = temp;  
		                        }  
		                    }  
		                }  
		            return a[total-1];  
		        }  
		            public static void main(String args[]){  
		            int a[]={2,5,3,8,6,1};  
		            System.out.println("Largest: "+getLargest(a,6));  
		            }

}
