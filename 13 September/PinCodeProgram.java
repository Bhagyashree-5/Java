

class PinCodeProgram 
{
    void Area(int pincode) //This will print pc
    {
	System.out.println(pincode);
    }
	
    void Area(int pincode, String post_o)  //This will print pc and po 
    {
	System.out.println(pincode);
	System.out.println(post_o);
    }

    void Area(int pincode, String post_o, String city)  //This will print pc,po and city 
    {
	System.out.println(pincode);
	System.out.println(post_o);
	System.out.println(city);
	}	

	public static void main(String[] args) //main method
        {
		java.util.Scanner scan = new java.util.Scanner(System.in) ;
		System.out.print("How many data you want to enter: ");  //user input
		int num_data = scan.nextInt();
		
		PinCodeProgram ps1 =  new PinCodeProgram();
		
		switch(num_data) {
			case 1:
				ps1.Area(421301);
				break;
			case 2:
				ps1.Area(421301, "Khadakpada");
				break;
			case 3:
				ps1.Area(421301, "Khadakpada", "Thane");
				break;
			default: 
				System.out.print("Invalid Input");
		}
	}
}