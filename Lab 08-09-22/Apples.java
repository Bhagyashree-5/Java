class Apples 
{
    public static void main(String[] args) 
     {
         int apples = 420;
	 int selled = 40;
	 int remaining = 100 - 40;
		
		int total_apples = (apples * 100) / remaining;
	
		System.out.print("Fruit seller had " + total_apples + " apples");

	}

}